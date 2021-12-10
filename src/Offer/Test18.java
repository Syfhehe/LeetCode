package Offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Test18 {

  @Test
  void test() {
    Number18 testNumber18 = new Number18();
    String s1 = "A man, a plan, a canal: Panama";
    assertEquals(true, testNumber18.isPalindrome(s1));
    s1="";
    assertEquals(true, testNumber18.isPalindrome(s1));
    s1="abbba";
    assertEquals(true, testNumber18.isPalindrome(s1));
    s1="abba";
    assertEquals(true, testNumber18.isPalindrome(s1));
    s1="a";
    assertEquals(true, testNumber18.isPalindrome(s1));
    s1="abab";
    assertEquals(false, testNumber18.isPalindrome(s1));
    s1="121";
    assertEquals(true, testNumber18.isPalindrome(s1));
    s1="12";
    assertEquals(false, testNumber18.isPalindrome(s1));
  }

}
