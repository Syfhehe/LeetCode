package Leetcode;

import java.util.Arrays;

public class No16 {
  
  public static void main(String[] args) {
    int[] nums = new int[] {-1,2,1,-4};
    System.out.println(threeSumClosest(nums,1));
  }
  
  public static int threeSumClosest(int[] nums, int target) {
    int len = nums.length;
    Arrays.sort(nums); // ≈≈–Ú
    int min = nums[0] + nums[1] + nums[2];
    for (int i = 0; i < len; i++) {
      int L = i + 1;
      int R = len - 1;
      while (L < R) {
        int sum = nums[i] + nums[L] + nums[R];
        if (Math.abs(sum - target) < Math.abs(min - target)) min = sum;
        if (sum > target) {
          R--;
        } else {
          L++;
        }
      }
    }
    return min;
  }
}
