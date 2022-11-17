package ru.java_examples;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class CollectionWithString {

  public static void main(String[] args) {
    List<String> list = asList("my string", "test 123");
    System.out.println(change(list));
  }

  public static List<String> change(List<String> list) {
    List<String> newList = new ArrayList<>();
    for (String value : list) {
      newList.add(value.toUpperCase().replace(" ", "_"));
    }
    return newList;
  }

}
