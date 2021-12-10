package Offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Test17 {

  @Test
  void test() {
    Number17 testNumber17 = new Number17();
    String s1 = "ADOBECODEBANC", t1 = "ABC";
    String s2 = "aa", t2 = "aa";
    String s3 = "a", t3 = "aa";
    String s4 = "bbaa", t4 = "aba";
    String s5 = "aaflslflsldkalskaaa", t5 = "aaa";
    String s6 = "ab", t6 = "a";
    String s7 = "acbbaca", t7 = "aba";

    assertEquals("baca", testNumber17.minWindow(s7, t7));

    assertEquals("a", testNumber17.minWindow(s6, t6));

    assertEquals("BANC", testNumber17.minWindow(s1, t1));
    assertEquals("aa", testNumber17.minWindow(s2, t2));
    assertEquals("", testNumber17.minWindow(s3, t3));
    assertEquals("baa", testNumber17.minWindow(s4, t4));
    assertEquals("aaa", testNumber17.minWindow(s5, t5));

  }

}
