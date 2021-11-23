package Offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Number2Test {

  @Test
  void test() {
    Number2 number2 = new Number2();
//    assertEquals("10000", number2.addBinary("1011", "101"));
    assertEquals("101", number2.addBinary("11", "10"));
  }

}
