package ru.java_examples;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abba"));
  }

  public static int lengthOfLongestSubstring(String s) {
    int maxLength = 0;
    int left = 0;
    Map<Character, Integer> map = new HashMap<>();
    for(int right = 0; right < s.length(); right++){
      char ch = s.charAt(right);
      if (map.containsKey(ch)) {
        left = Math.max(left, map.get(ch) + 1);
      }
      map.put(ch, right);
      maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;
  }

}
