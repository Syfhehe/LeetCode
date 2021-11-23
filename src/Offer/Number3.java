package Offer;

public class Number3 {

  public int[] countBits(int n) {

    int[] result = new int[n + 1];
    int sum = 0;
    // һ��Ҫ����5��ѭ��
    for (int i = 0; i <= n; i++) {
      // ÿ��ѭ������i�Ķ����Ʊ�ʾ�м���1
      for (int j = 0; j < Integer.toBinaryString(i).length(); j++) {
        if (Integer.toBinaryString(i).charAt(j) - '1' == 0) {
          sum++;
        }
      }
      result[i] = sum;
      sum = 0;
    }
    return result;
  }

  public int[] countBits1(int n) {
    int[] result = new int[n + 1];
    // ��i&(i-1),���Լ���һλ1
    for (int i = 0; i <= n; ++i) {
      int j = i;
      while (j != 0) {
        result[i]++;
        j = j & (j - 1);
      }
    }
    return result;
  }

  public int[] countBits2(int n) {
    int[] result = new int[n + 1];
    // ����1��i&(i-1)��һλ1.
    for (int i = 1; i <= n; ++i) {
      result[i] = result[i & (i - 1)] + 1;
    }
    return result;
  }

  public int[] countBits3(int n) {
    int[] result = new int[n + 1];
    // ����1��i&(i-1)��һλ1.
    for (int i = 1; i <= n; ++i) {
      result[i] = result[i >> 1] + (1 & i);
    }
    return result;
  }

}

