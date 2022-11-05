package ru.java_examples;

import org.testng.Assert;

public class SumMaxTests {

  // Дан массив натуральных чисел. Найти наибольшее по сумме цифр. Вывести число и суммы цифр

  public static void main(String[] args) {
    int[] arr = {-3781, 3902, 2850, 7121, 8090};
//    System.out.println(sumMax(arr));
    Assert.assertEquals(sumMax(arr), new int[]{19, -3781});
  }

  public static int[] sumMax(int[] arr) {
    int number = 0;
    int sumNumbersMax = 0;
    for (int value : arr) {
      int currentValue = value;
      if (value < 0) {
        value = Math.abs(value);
      }
      int sumNumbers = 0;
      while (value != 0) {
        sumNumbers += value % 10;
        value /= 10;
      }
      if (sumNumbers > sumNumbersMax) {
        sumNumbersMax = sumNumbers;
        number = currentValue;
      }
    }
//    return "Максимальная сумма чисел: " + sumNumbersMax + "\nЧисло: " + number;
    return new int[]{sumNumbersMax, number};
  }

}
