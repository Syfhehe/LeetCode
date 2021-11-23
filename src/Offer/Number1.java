package Offer;

public class Number1 {

  public int divide1(int a, int b) {
    // Ψһ����Խ���������ǣ�-2^31/-1
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
    // ��������뱻�����ķ��Ų�һ�£������Ҫ�Ӹ�����
    return negative == 1 ? -result : result;
  }

  public int divide2(int a, int b) {
    if (a == Integer.MIN_VALUE && b == -1) return Integer.MAX_VALUE;
    int sign = (a > 0) ^ (b > 0) ? -1 : 1;
    a = Math.abs(a);
    b = Math.abs(b);
    int res = 0;
    for (int i = 31; i >= 0; i--) {
      // ���ȣ����ƵĻ�������ô��Ҳ����Խ��
      // ��Σ��޷������Ƶ�Ŀ���ǣ��� -2147483648 ���� 2147483648

      // ע�⣬���ﲻ���� (a >>> i) >= b ��Ӧ���� (a >>> i) - b >= 0
      // ���Ҳ��Ϊ�˱��� b = -2147483648����� b = -2147483648
      // ��ô (a >>> i) >= b ��ԶΪ true������ (a >>> i) - b >= 0 Ϊ false
      if ((a >>> i) - b >= 0) { // a >= (b << i)
        a -= (b << i);
        res += (1 << i);
      }
    }
    // bug �޸�����Ϊ����ʹ�ó˺ţ����Խ��˺Ż�����Ŀ�����
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
