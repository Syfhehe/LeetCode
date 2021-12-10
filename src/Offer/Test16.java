package Offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Test16 {

  @Test
  void test() {
    Number16 testNumber16 = new Number16();
    String s1 = "abcabcbb";
    String s2 = "bbbbb";
    String s3 = "pwwkew";
    assertEquals(3, testNumber16.lengthOfLongestSubstring(s1));
    assertEquals(1, testNumber16.lengthOfLongestSubstring(s2));
    assertEquals(3, testNumber16.lengthOfLongestSubstring(s3));

  }

}
