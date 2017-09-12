package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Grays;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(8);
    Tortoise.setX(200);
    int height = 40;
    for (int i = 0; i < 5; i++) {
      
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  private static void drawHouse(int height)
  {
    Tortoise.setPenColor(Grays.DarkSlateGray);
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
}
}
