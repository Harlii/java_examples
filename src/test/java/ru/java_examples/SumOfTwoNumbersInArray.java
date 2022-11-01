package ru.java_examples;

import java.util.Arrays;

public class SumOfTwoNumbersInArray {

  // Поиск двух чисел из отсортированного массива, в сумме дающих заданное число.
  // Для решения задачи воспользуемся методом вдух указателей

  public static void main(String[] args) {
    int[] arr = {-3,0,1,3,4};
    int k = 5;
    System.out.println(Arrays.toString(findTwoNumbers(arr, k)));
  }

  public static int[] findTwoNumbers(int[] arr, int k) {
    int l = 0, r = arr.length - 1;
    while (l < r) {
      int sum = arr[l] + arr[r];
      if (sum == k) {
        return new int[]{arr[l], arr[r]};
      }
      if (sum < k) {
        l++;
      } else {
        r--;
      }
    }
    return new int[0];
  }

}
