package ru.java_examples;

import java.util.Arrays;

public class NumberIsPresentInAllArrays {

  public static void main(String[] args) {
    int[] arr_1 = {1,2,4};
    int[] arr_2 = {3,3,4};
    int[] arr_3 = {2,3,4,5,6};
    System.out.println(whichNumberIsPresent(arr_1, arr_2, arr_3));
  }

  public static int whichNumberIsPresent(int[] arr_1, int[] arr_2, int[] arr_3) {
    for (int value : arr_1) {
      if ((Arrays.binarySearch(arr_1, value) >= 0) && (Arrays.binarySearch(arr_2, value) >= 0) && (Arrays.binarySearch(arr_3, value) >= 0)) {
        return value;
      }
    }
    return -1;
  }

}
