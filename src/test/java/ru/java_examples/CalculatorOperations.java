package ru.java_examples;

import org.testng.Assert;

import java.text.DecimalFormat;

public class CalculatorOperations {

  static DecimalFormat decimalFormat = new DecimalFormat("#.##");
  // Можно искользовать String.format("%.3f", value) есди нам нужны конечные нули - 6.200

  public static void main(String[] args) {
    Assert.assertEquals(sum(3, 5), 8);
    Assert.assertEquals(sum(0, 0), 0);
    Assert.assertEquals(sum(10, 0), 10);
    Assert.assertEquals(sum(0, -5), -5);
    Assert.assertEquals(sum(-5, 6), 1);
    Assert.assertEquals(sum(5, -7), -2);
    Assert.assertEquals(sum(-7, -5), -12);
//    Assert.assertEquals(sum(2.9, 3.3), "6,2");
//    Assert.assertEquals(difference(12, 5), 7);
//    Assert.assertEquals(difference(5.9, 3.3),  "2,6");
//    Assert.assertEquals(multiplication(3, 5), 15);
//    Assert.assertEquals(multiplication(2.2, 4.3), "9,46");
//    Assert.assertEquals(division(10, 4), 2);
//    Assert.assertEquals(division(10.0, 4.0), "2,5");
  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static String sum(double a, double b) {
    return decimalFormat.format(a + b);
  }

  public static int difference(int a, int b) {
    return a - b;
  }

  public static String difference(double a, double b) {
    return decimalFormat.format(a - b);
  }

  public static int multiplication(int a, int b) {
    return a * b;
  }

  public static String multiplication(double a, double b) {
     return decimalFormat.format(a * b);
  }

  public static int division(int a, int b) {
    return a / b;
  }

  public static String division(double a, double b) {
     return decimalFormat.format(a / b);
  }

}
