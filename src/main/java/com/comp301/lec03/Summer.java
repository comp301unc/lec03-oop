package com.comp301.lec03;

public class Summer {
  public int getSum(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }
}
