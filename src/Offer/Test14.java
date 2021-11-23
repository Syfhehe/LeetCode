package Offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Test14 {

  @Test
  void test() {
    Number14 testNumber14 = new Number14();
    String s1 = "ab";
    String s2 = "eidbaooo";
    assertEquals(true, testNumber14.checkInclusion(s1, s2));

    s2 = "eidboaoo";
    assertEquals(false, testNumber14.checkInclusion(s1, s2));

  }

}
