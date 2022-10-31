package ru.java_examples;

public class SumMaxTests {

  // Дан массив натуральных чисел. Найти наибольшее по сумме цифр. Вывести число и суммы цифр

  public static void main(String[] args) {
    int[] arr = {3781, 3902, 2850, 7121, 8090};
    System.out.println(sumMax(arr));
  }

  public static String sumMax(int[] arr) {
    int number = 0;
    int sumNumbersMax = 0;
    int sumNumbers = 0;
    for (int value : arr) {
      sumNumbers = value/1000 + value/100%10 + value/10%10 + value%10;
      if (sumNumbers > sumNumbersMax) {
        sumNumbersMax = sumNumbers;
        number = value;
      }
    }
    return "Максимальная сумма чисел: " + sumNumbersMax + "\nЧисло: " + number;
  }

}
