package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;

public class AdLibsRtf
{
  public static class Words
  {
    public String adVerb;
    public String edVerb;
    public String bodyPart;
  }
  public static void main(String[] args)
  {
    //  Create a new 'word' container your story's words (uncomment line 9) --#1.1
    Words word = new Words();
    //  Ask the user to enter an adverb, save it as currentAdverb --#2
    word.adVerb = MessageBox.askForTextInput("Enter an adverb");
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#3
    word.edVerb = MessageBox.askForTextInput("Enter an -ed verb");
    //  Ask the user to enter a body part, save it as currentBodyPart --#4
    word.bodyPart = MessageBox.askForTextInput("Enter a body part");
    //  Connect the words in the currentStory to an RTF file parser (use the Parser object)  --#1.2
    String currentStory = "Today I woke up " + word.adVerb + ". ";
    currentStory = currentStory + "Then I " + word.edVerb + " ";
    currentStory = currentStory + "my " + word.bodyPart + ". ";
    Parser.parseRtfFile("view.rtf", word);
    //  Display the currentStory in an RTF file (use the Viewer object) --#1.3
    Viewer.displayRtfFile(currentStory);
  }
}