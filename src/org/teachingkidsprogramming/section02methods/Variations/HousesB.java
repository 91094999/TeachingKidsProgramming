package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class HousesB
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(1);
    int height = 40;
    drawHousePointyRoof(30);
    drawFlatRoofHouse(120);
    drawFlatRoofHouse(90);
    drawHouseSlantedRoof(80);
    drawHousePointyRoof(180);
    drawFlatRoofHouse(50);
    drawHouseSlantedRoof(120);
    drawHousePointyRoof(60);
    drawHousePointyRoof(100);
    drawHouseSlantedRoof(160);
  }
  private static void drawHouseSlantedRoof(int height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.move(height);
    drawSlantedRoof();
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
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawPointyRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
  private static void drawFlatRoofHouse(int height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawFlatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
