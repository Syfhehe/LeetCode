package Offer;

public class Number4 {

  public int singleNumber(int[] nums) {
    int result = 0;
    int[] bitSum = new int[32];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < bitSum.length; j++) {
        bitSum[j] += (nums[i] >> (31 - j)) & 1;
      }
    }

    for (int i = 0; i < bitSum.length; i++) {
      if (bitSum[i] % 3 == 1) {
        result += 1 << (31 - i);
      }
    }
    return result;
  }


}

