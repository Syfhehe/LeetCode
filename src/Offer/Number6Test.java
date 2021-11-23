package Offer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Number6Test {

  @Test
  void test() {
    Number6 testNumber6 = new Number6();
    int[] nums1 = {1, 2, 4, 6, 10};
    assertEquals(1, testNumber6.twoSum(nums1, 8)[0]);
    assertEquals(3, testNumber6.twoSum(nums1, 8)[1]);

    int[] nums2 = {2, 3, 4};
    assertEquals(0, testNumber6.twoSum(nums2, 6)[0]);
    assertEquals(2, testNumber6.twoSum(nums2, 6)[1]);

    int[] nums3 = {-1, 0};
    assertEquals(0, testNumber6.twoSum(nums3, -1)[0]);
    assertEquals(1, testNumber6.twoSum(nums3, -1)[1]);
  }

}
