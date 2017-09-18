package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Houses4
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("James Williams");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(0);
    int height = 40;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  private static void drawHouse(int height)
  {
    Tortoise.getPenColor();
    Tortoise.move(height);
    //drawFlatRoof();
    //drawSlantedRoof();
    //drawPointyRoof();
    //drawTrapezoidRoof();
    drawRoundRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawRoundRoof()
  {
    Tortoise.turn(60);
    Tortoise.move(3.14);
    Tortoise.turn(60);
    Tortoise.move(3.14);
    Tortoise.turn(60);
  }
  private static void drawTrapezoidRoof()
  {
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
}
