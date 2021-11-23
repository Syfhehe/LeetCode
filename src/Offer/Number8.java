package Offer;

public class Number8 {

  public int minSubArrayLen(int target, int[] nums) {
    int result = 0;
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum = 0;
      int j = i;
      while (j < nums.length) {
        while (sum < target && j < nums.length) {
          sum += nums[j];
          j++;
        }
        if (sum >= target) {
          result = (result == 0) ? j - i : Math.min(result, j - i);
          break;
        }
      }
    }
    return result;
  }

}

