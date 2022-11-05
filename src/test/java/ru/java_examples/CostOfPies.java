package ru.java_examples;

public class CostOfPies {

  // Определите, сколько рублей и копеек нужно заплатить за N пирожков, если пирожок в столовой стоит А рублей и В копеек.
  // На вход 3 числа: рубли, копейки и количество пирожков. На выходе 2 числа: рубли и копейки.

  public static void main(String[] args) {
    int a = 5, b = 14, n = 5;
    System.out.println(costOfPies(a, b, n));
  }

  public static String costOfPies(int a, int b, int n) {
    int countForOne = a * 60 + b;
    int countForN = countForOne * n;
    return countForN / 60 + "," + countForN % 60 + " руб.";
  }

}
