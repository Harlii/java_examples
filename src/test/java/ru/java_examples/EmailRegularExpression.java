package ru.java_examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegularExpression {

  public static void main(String[] args) {
    String[] arr = {"test@gmail.com", "123-test@gmail.com", "123@456.ru", "test.test@mail.ru", "test@mail.", "test_12@mail.ru", "test-@mail.ru", "test@-mail.ru"};
    regExp(arr);
  }

  // \\w  [A-Za-z0-9]
  // +    1 или более, {1,}
  // ?    0 или 1, {0,1}
  // *    0 или более, {0,}
  public static void regExp(String[] arr) {
    Pattern pattern = Pattern.compile("\\w+([\\-._]?\\w+)*@\\w+([\\-._]?\\w+)*\\.\\w{2,4}");
    for (String email : arr) {
      Matcher matcher = pattern.matcher(email);
      System.out.println(email + " : " + matcher.matches());
    }
  }

}
