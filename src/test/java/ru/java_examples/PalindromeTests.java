package ru.java_examples;

public class PalindromeTests {

  // Палиндром - число, которое читается слева направо и справа налево одинаково.

  public static void main(String[] args) {
    System.out.println(isPalindrome("01230"));
    System.out.println(isPalindrome("12345"));
    System.out.println(isPalindrome("1001002001001"));
  }

  public static boolean isPalindrome(String numberAsString) {
    String[] list = numberAsString.trim().split("");
    for (int i = 0; i < list.length/2; i++) {
      if (!list[i].equals(list[list.length - 1 - i])) {
        return false;
      }
    }
    return true;
  }

}
