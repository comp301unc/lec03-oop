package com.comp301.lec03;

public class DayMain {
  public static void main(String[] args) {
    Day day = Day.SUNDAY;

    if (day == Day.WEDNESDAY) {
      System.out.println("Hey, that's today!");
    }

    switch (day) {
      case MONDAY:
        System.out.println("Mondays are bad.");
        break;
      case FRIDAY:
        System.out.println("Fridays are better.");
        break;
      case SATURDAY:
      case SUNDAY:
        System.out.println("Weekends are best.");
        break;
      default:
        System.out.println("Midweek days are so-so.");
        break;
    }
  }
}
