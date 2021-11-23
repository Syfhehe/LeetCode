package Offer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Number5Test {

  @Test
  void test() {
    Number5 testNumber5 = new Number5();
    String[] strings1 = {"abcw", "baz", "foo", "bar", "fxyz", "abcdef"};
    assertEquals(testNumber5.maxProduct(strings1), 16);
    String[] strings2 = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
    assertEquals(testNumber5.maxProduct(strings2), 4);
  }

}
