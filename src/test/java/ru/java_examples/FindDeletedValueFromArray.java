package ru.java_examples;

import java.util.Arrays;

public class FindDeletedValueFromArray {

  // Дан массив элементов от 1 до N. Удаляется один элемент, оставшиеся элементы перемешиваются. Найти удаленный элемент

  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 10, 12, 26, 30, 63, 103, 120}; // например, удалили число 30 и перемешали значения
    int[] newArr = {103, 3, 12, 1, 5, 120, 26, 63, 10};
    System.out.println(findDeletedValue(arr, newArr));

    int[] arr_2 = {1, 3, 5, 10, 12, 26, 30, 63, 103, 120}; // например, удалили последнее число 120 и перемешали значения
    int[] newArr_2 = {103, 3, 12, 1, 5, 30, 26, 63, 10};
    System.out.println(findDeletedValue(arr_2, newArr_2));
  }

  public static String findDeletedValue(int[] arr, int[] newArr) {
    Arrays.sort(newArr);
    for (int i = 0; i < arr.length - 2; i++) {
      if (arr[i] != newArr[i]) {
        return "Удаленное число: " + arr[i];
      }
    }
    return "Удаленное число: " + arr[arr.length-1];
  }

}
