package Offer;

import org.junit.jupiter.api.Test;

class Number3Test {

  @Test
  void test() {
    Number3 number3 = new Number3();
    for (int i = 0; i < 6; i++) {
      System.out.println(number3.countBits3(5)[i]);
    }
  }

}
