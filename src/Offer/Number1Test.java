package Offer;

import org.junit.jupiter.api.Test;

class Number1Test {

  @Test
  void test() {
    int a = -2147483648;
    //��aΪ-2147483648ʱ��a�ľ���ֵ����-2147483648
    a = Math.abs(a);
    int b = 1;
    Number1 number1 = new Number1();
    System.out.println(number1.divide2(a, b));
  }

}
