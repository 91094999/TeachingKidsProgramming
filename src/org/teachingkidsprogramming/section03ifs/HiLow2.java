package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

// this variation tells user how many guesses they have left
public class HiLow2
{
  public static void main(String[] args)
  {
    //int i;
    int answer = (int) (Math.random() * 100 + 1);
    // System.out.println("The answer is " + answer);
    for (int i = 0; i <= 8; i++)
    {
      int guess = 4;
      if (guess == 0)
      {
        MessageBox.showMessage("You have 4 guesses left");
      }
      guess = MessageBox.askForNumericalInput("What is your guess?");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too High");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
      if (i == 8)
      {
        MessageBox.showMessage("Your bad kid");
      }
    }
  }
}
