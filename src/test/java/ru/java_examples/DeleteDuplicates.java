package ru.java_examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteDuplicates {

  public static void main(String[] args) {
    int[] arr = {1,2,2,3,4,4,4,5,5,6,7,8,8};
    List<Integer> list = Arrays.asList(1,2,2,3,4,4,4,5,5,6,7,8,8);
    System.out.println(Arrays.toString(deleteDuplicatesArray(arr)));
    System.out.println(deleteDuplicatesList(list));
  }

  public static int[] deleteDuplicatesArray(int[] arr) {
    return Arrays.stream(arr).distinct().toArray();
  }

  public static List<Integer> deleteDuplicatesList(List<Integer> list) {
    return list.stream().distinct().collect(Collectors.toList());
  }

}
