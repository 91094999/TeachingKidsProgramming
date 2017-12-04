package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibsvariation
{
  public static void main(String[] args)
  {
    String adVerb = askAdverb();
    String edVerb = askEdverb();
    String bodyPart = bodyPart();
  }
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("U done Goofed");
      askAdverb();
    }
    else if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("That is not a number dumbo");
      askAdverb();
    }
    return "adverb";
  }//end of method
  private static String askEdverb()
  {
    String edverb = MessageBox.askForTextInput("Enter an edverb");
    if (edverb.isEmpty())
    {
      MessageBox.showMessage("Please enter EDVERBS!");
      askEdverb();
    }
    else if (edverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Please enter a number and don't be a plumber");
      askEdverb();
    }
    return "edVerb";
  }
  private static String bodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("Enter a body part");
    if (bodyPart.isEmpty())
    {
      MessageBox.showMessage("Please enter a body part");
      bodyPart();
    }
    else if (bodyPart.matches("[\\d]*"))
    {
      MessageBox.showMessage("Enter body part pls!");
      bodyPart();
    }
    return bodyPart;
  }
}//end of class
