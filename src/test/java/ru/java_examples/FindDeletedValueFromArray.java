package ru.java_examples;

import org.testng.Assert;

import java.util.Arrays;

public class FindDeletedValueFromArray {

  // Дан массив элементов от 1 до N. Удаляется один элемент, оставшиеся элементы перемешиваются. Найти удаленный элемент

  public static void main(String[] args) {
    int[] arr = {3, 1, 2, 5}; // например, удалили число 4 и перемешали значения
//    int[] newArr = {103, 3, 12, 1, 5, 120, 26, 63, 10};
//    System.out.println(findDeletedValue(arr));
    Assert.assertEquals(findDeletedValue(new int[]{2, 5, 4, 3}), 1);
    Assert.assertEquals(findDeletedValue(new int[]{3, 1, 2, 5}), 4);
    Assert.assertEquals(findDeletedValue(new int[]{3, 1, 2, 4}), 5);
    Assert.assertEquals(findDeletedValue(new int[]{1}), 2);
    Assert.assertEquals(findDeletedValue(new int[]{}), 1);

//    int[] arr_2 = {1, 3, 5, 10, 12, 26, 30, 63, 103, 120}; // например, удалили последнее число 120 и перемешали значения
//    int[] newArr_2 = {103, 3, 12, 1, 5, 30, 26, 63, 10};
//    System.out.println(findDeletedValue(arr_2, newArr_2));
  }

  public static int findDeletedValue(int[] arr) {
    if (arr.length == 0) {
      return 1;
    }
    Arrays.sort(arr);
    if (arr[0] != 1) {
      return 1;
    }
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i+1] - arr[i] != 1) {
        return arr[i] + 1;
      }
    }
    return arr[arr.length-1] + 1;
  }

}
