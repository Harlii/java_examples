package ru.java_examples;

import org.testng.Assert;

import javax.xml.stream.events.Characters;

public class CharCount {

  public static void main(String[] args) {
    Assert.assertEquals(charCount("", 'a'), -1);
    Assert.assertEquals(charCount("Hello", 'h'), 1);
    Assert.assertEquals(charCount("hello WORLD", 'L'), 3);
    Assert.assertEquals(charCount("Hello WORLD", ' '), 1);
  }

  public static int charCount(String str, Character ch) {
    if (str.isEmpty()) return -1;
    int count = 0;
    String newStr = str.toLowerCase();
    char newCh = Character.toLowerCase(ch);
    for (int i = 0; i < newStr.length(); i++) {
      if (newCh == newStr.charAt(i)) {
        count++;
      }
    }
    return count;
  }

}
