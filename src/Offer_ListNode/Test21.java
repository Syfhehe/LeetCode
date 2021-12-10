package Offer_ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Test21 {

  @Test
  void test() {
    Number20 testNumber20 = new Number20();
    String s1 = "abc";
    assertEquals(3, testNumber20.countSubstrings(s1));
    s1 = "aaa";
    assertEquals(6, testNumber20.countSubstrings(s1));
    s1 = "";
    assertEquals(0, testNumber20.countSubstrings(s1));
  }

}
