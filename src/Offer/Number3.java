package Offer;

public class Number3 {

  public int[] countBits(int n) {

    int[] result = new int[n + 1];
    int sum = 0;
    // 一共要进行5次循环
    for (int i = 0; i <= n; i++) {
      // 每次循环计算i的二进制表示有几个1
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
    // 用i&(i-1),可以减少一位1
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
    // 整数1比i&(i-1)多一位1.
    for (int i = 1; i <= n; ++i) {
      result[i] = result[i & (i - 1)] + 1;
    }
    return result;
  }

  public int[] countBits3(int n) {
    int[] result = new int[n + 1];
    // 整数1比i&(i-1)多一位1.
    for (int i = 1; i <= n; ++i) {
      result[i] = result[i >> 1] + (1 & i);
    }
    return result;
  }

}

