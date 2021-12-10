package Offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Test19 {

  @Test
  void test() {
    Number19 testNumber19 = new Number19();
    String s1 = "cbbcc";
    assertEquals(true, testNumber19.validPalindrome(s1));
    s1 = "abca";
    assertEquals(true, testNumber19.validPalindrome(s1));
    s1="aba";
    assertEquals(true, testNumber19.validPalindrome(s1));
    s1="";
    assertEquals(true, testNumber19.validPalindrome(s1));
    s1="abba";
    assertEquals(true, testNumber19.validPalindrome(s1));
    s1="a";
    assertEquals(true, testNumber19.validPalindrome(s1));
    s1="abc";
    assertEquals(false, testNumber19.validPalindrome(s1));
  }

}
