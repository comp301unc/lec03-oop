package com.comp301.lec03;

public class SummerBad {
  // Don't do this! "sum" and "i" don't need to be fields.
  // They can be local variables in the getSum() method. See the Summer class instead.
  private int sum;
  private int i;

  public int getSum(int[] numbers) {
    sum = 0;
    for (i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }
}
