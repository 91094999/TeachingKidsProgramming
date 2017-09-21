package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PyramidsOfGiza
{
  public static void main(String[] args) throws Exception
  {
    setUpPyramidLand();
    makePyramid();
    makePyramid2();
    makePyramid3();
  }
  private static void makePyramid3()
  {
    Tortoise.move(100);
    Tortoise.turn(90);
    Tortoise.move(100);
    Tortoise.turn(-90);
    Tortoise.turn(225);
    Tortoise.move(140);
  }
  private static void makePyramid2()
  {
    Tortoise.move(100);
    Tortoise.turn(90);
    Tortoise.move(100);
    Tortoise.turn(135);
    Tortoise.move(140);
  }
  private static void makePyramid()
  {
    Tortoise.turn(-90);
    Tortoise.move(140);
    Tortoise.turn(135);
    Tortoise.move(100);
    Tortoise.turn(90);
    Tortoise.move(100);
    Tortoise.turn(-90);
  }
  private static void setUpPyramidLand()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.setPenWidth(2);
    Tortoise.hide();
  }
}
