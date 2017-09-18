package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Houses_Pointy
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("James Williams");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  private static void drawHouse(int height)
  {
    Tortoise.setPenColor(Reds.OrangeRed);
    Tortoise.move(height);
    //drawFlatRoof();
    //drawSlantedRoof();
    drawPointyRoof();
    //draw a trapezoid roof
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawSlantedRoof()
  {
    Tortoise.move(30);
    Tortoise.turn(120);
    Tortoise.move(40);
    Tortoise.turn(60);
    Tortoise.move(10);
  }
  private static void drawPointyRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
  private static void drawFlatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
  private static void drawTrapezoidRoof()
  {
  }
}
