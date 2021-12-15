package Offer_HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Test32 {

  @Test
  void test() {
    String s = "anagram", t = "nagaram";
    Number32 test = new Number32();
    assertEquals(test.isAnagram(s, t), true);
    s = "rat";t = "car";
    assertEquals(test.isAnagram(s, t), false);

  }

}
