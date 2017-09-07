package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("James");
    Tortoise.show();
    Tortoise.setSpeed(10);
    int sides = 120;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.setPenWidth(i);
      int length = i;
      Tortoise.move(length);
      Tortoise.turn(3000 / sides); // i is a loop variable
    }
    //
    //  See your work at http://virtualproctor.tkpjava.org
  }
}
