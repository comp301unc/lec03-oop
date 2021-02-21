package com.comp301.lec03;

public class Point {
  private double x;
  private double y;
  private static final double EPSILON = 0.001;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distanceTo(Point other) {
    return Point.distance(this, other);
  }

  public static double distance(Point a, Point b) {
    return Math.sqrt(Math.pow(a.y - b.y, 2) + Math.pow(a.x - b.x, 2));
  }
}
