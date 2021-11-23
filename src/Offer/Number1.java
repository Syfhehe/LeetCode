package Offer;

public class Number1 {

  public int divide1(int a, int b) {
    // 唯一可能越界的情况就是，-2^31/-1
    if (a == Integer.MIN_VALUE && b == -1) {
      return Integer.MAX_VALUE;
    }
    int negative = 2;
    if (a > 0) {
      negative--;
      a = -a;
    }
    if (b > 0) {
      negative--;
      b = -b;
    }
    int result = divideCore(a, b);
    // 如果除数与被除数的符号不一致，最后结果要加个负号
    return negative == 1 ? -result : result;
  }

  public int divide2(int a, int b) {
    if (a == Integer.MIN_VALUE && b == -1) return Integer.MAX_VALUE;
    int sign = (a > 0) ^ (b > 0) ? -1 : 1;
    a = Math.abs(a);
    b = Math.abs(b);
    int res = 0;
    for (int i = 31; i >= 0; i--) {
      // 首先，右移的话，再怎么着也不会越界
      // 其次，无符号右移的目的是：将 -2147483648 看成 2147483648

      // 注意，这里不能是 (a >>> i) >= b 而应该是 (a >>> i) - b >= 0
      // 这个也是为了避免 b = -2147483648，如果 b = -2147483648
      // 那么 (a >>> i) >= b 永远为 true，但是 (a >>> i) - b >= 0 为 false
      if ((a >>> i) - b >= 0) { // a >= (b << i)
        a -= (b << i);
        res += (1 << i);
      }
    }
    // bug 修复：因为不能使用乘号，所以将乘号换成三目运算符
    return sign == 1 ? res : -res;
  }

  private int divideCore(int a, int b) {
    int result = 0;
    while (a <= b) {
      int value = b;
      int quotient = 1;
      while (value >= Integer.MIN_VALUE && a <= value + value) {
        quotient += quotient;
        value += value;
      }
      result += quotient;
      a -= value;
    }
    return result;
  }

}
