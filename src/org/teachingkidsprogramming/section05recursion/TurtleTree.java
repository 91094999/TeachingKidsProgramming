package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Browns;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Greens;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Turn the background black  --#21
    //Tortoise.getBackgroundWindow().setBackground(Color.black());
    int length = 60;
    drawBranch(length);
  }
  private static void drawBranch(int length)
  {
    System.out.println("The length is " + length + "\n");
    if (length > 0)
    {
      adjustColor(length);
      //
      Tortoise.move(length);
      drawLowerBranches(length);
    }
  }
  private static void adjustColor(Object length)
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, Greens.Lime);
    colors.put(20, Greens.ForestGreen);
    colors.put(30, Greens.DarkGreen);
    colors.put(40, Greens.Olive);
    colors.put(50, Browns.Sienna);
    colors.put(60, Browns.SaddleBrown);
    Tortoise.setPenColor(colors.get(length));
  }
  private static void drawLowerBranches(int length)
  {
    Tortoise.turn(30);
    //
    drawShorterBranch(length);
    //
    Tortoise.turn(-60);
    drawShorterBranch(length);
    Tortoise.turn(30);
    adjustColor(length);
    Tortoise.move(-length);
  }
  private static void drawShorterBranch(int length)
  {
    drawBranch(length - 10);
  }
}