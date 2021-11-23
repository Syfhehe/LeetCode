package Offer;

import org.junit.jupiter.api.Test;

class Test15 {

  @Test
  void test() {
    Number15 testNumber15 = new Number15();
    String s1 = "cbaebabacd";
    String s2 = "abc";
    System.out.println(testNumber15.findAnagrams(s1, s2));
    s1 = "abab";
    s2 = "ab";
    System.out.println(testNumber15.findAnagrams(s1, s2));

  }

}
