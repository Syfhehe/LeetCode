package Offer;

public class Number9 {

  public int numSubarrayProductLessThanK(int[] nums, int k) {
    long product = 1;
    int left = 0;
    int count = 0;
    for (int right = 0; right < nums.length; ++right) {
      product *= nums[right];
      while (left <= right && product >= k) {
        product /= nums[left++];
      }
      count += right >= left ? right - left + 1 : 0;
    }
    return count;
  }

}

