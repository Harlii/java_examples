package ru.java_examples;

import org.testng.Assert;

public class MaxSubarrayOf_1 {

  // Дан массив из нулей и единиц. Нужно определить, какой максимальный по длине подмассив из единиц будет, удалив ровно один элемент массива.
  // [1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1] -> 6

  public static void main(String[] args) {
    Assert.assertEquals(maxArr(new int[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1}), 6);
    Assert.assertEquals(maxArr(new int[]{}), -1);
    Assert.assertEquals(maxArr(new int[]{1, 1, 1, 0}), 3);
    Assert.assertEquals(maxArr(new int[]{0, 1, 1, 1, 1}), 4);
    Assert.assertEquals(maxArr(new int[]{0, 0, 0, 0}), 0);
    Assert.assertEquals(maxArr(new int[]{1, 1, 1, 1, 1, 1, 1}), 6);
    Assert.assertEquals(maxArr(new int[]{1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1}), 5);
    Assert.assertEquals(maxArr(new int[]{1, 1, 1, 0, 0, 1}), 3);
  }

  public static int maxArr(int[] arr) {
    int countLeft = 0;
    int countRight = 0;
    int countMax = 0;
    for (int value : arr) {
      if (value != 0) {
        countRight++;
      } else {
        if (countLeft + countRight > countMax) {
          countMax = countLeft + countRight;
        }
        countLeft = countRight;
        countRight = 0;
      }
    }
    if (countLeft + countRight > countMax) {
      countMax = countLeft + countRight;
    }
    if (countMax == arr.length) {
      countMax--;
    }
    return countMax;
  }

}
