package ru.java_examples;

public class DivisionByThreeNumbers {

  // Выяснить делится ли число на 1000, 3, 5.
  // Делится на 1000 - вывести одну тысячную часть числа
  // Делится на 3 - вывести суммы всех цифр
  // Делится на 5 - вывести число умноженное на 5
  // Для нескольких положительных условий вывести несколько вариантов

  public static void main(String[] args) {
    System.out.println(divisionByNumbers(10));
    System.out.println(divisionByNumbers(12));
    System.out.println(divisionByNumbers(45));
    System.out.println(divisionByNumbers(21000));
    System.out.println(divisionByNumbers(3001));
  }

  public static String divisionByNumbers(int k) {
    int sum = 0;
    if (k % 3 == 0) {
      int n = k;
      while (n != 0) {
        sum += n % 10;
        n /= 10;
      }
    }
    if (k % 3000 == 0) {
      return k / 1000 + ", " + sum + ", " + k * 5;
    }
    if (k % 1000 == 0) {
      return k / 1000 + ", " + k * 5;
    }
    if (k % 15 == 0) {
      return sum + ", " + k * 5;
    }
    if (k % 5 == 0) {
      return String.valueOf(k * 5);
    }
    if (k % 3 == 0) {
      return String.valueOf(sum);
    }
    return "Число не делится на 1000, 3, 5 без остатка";
  }

}
