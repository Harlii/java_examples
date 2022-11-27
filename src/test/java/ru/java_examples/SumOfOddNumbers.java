package ru.java_examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfOddNumbers {

  public static void main(String[] args) {
    int[] arr = {1, -1, 2, 5, 17, 22, -4, -13};
    System.out.println(sumOfOddNumbers(arr));
  }

  public static int sumOfOddNumbers(int[] arr) {
//    int count = Arrays.stream(arr).filter(n -> n % 2 != 0).reduce((n1, n2) -> n1 + n2).orElse(0);
//    int count = Arrays.stream(arr).filter(n -> n % 2 != 0).reduce(Integer::sum).orElse(0);
//    int count = Arrays.stream(arr).filter(n -> n % 2 != 0).sum();
    return Arrays.stream(arr).filter(n -> n % 2 != 0).reduce(Integer::sum).orElse(0);
  }

}
