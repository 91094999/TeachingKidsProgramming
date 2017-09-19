package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

@SuppressWarnings("unused")
public class TriangleShell
{
  private static int length = 1;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 0; i < 60; i++)
    {
      //      Change the pen color of the line the tortoise draws to a random color --#9
      Tortoise.setPenColor(PenColors.getRandomColor());
      //      Increase the current length of the side by 4 pixels --#8
      Tortoise.move(length + 4);
      //
      drawTriangle();
      //
      //      Turn the tortoise 1/60th of 360 degrees to the right --#10
      Tortoise.turn(360 / 60);
    }
  }
  private static void drawTriangle()
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
  }
}
