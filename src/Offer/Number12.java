package Offer;

public class Number12 {

  public int pivotIndex(int[] nums) {
    int all = 0;
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      all += nums[i];
    }
    for (int i = 0; i < nums.length; i++) {
      if (sum * 2 + nums[i] == all) {
        return i;
      }
      sum += nums[i];
    }
    return -1;
  }

}

