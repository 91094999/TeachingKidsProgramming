package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow4
{
  public static void main(String[] args)
  {
    //int i;
    int answer = (int) (Math.random() * 100 + 1);
    // System.out.println("The answer is " + answer);
    for (int i = 0; i <= 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("Your guess?");
      //input validation
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
        MessageBox.showMessage("You tried");
      }
    }
  }
}
