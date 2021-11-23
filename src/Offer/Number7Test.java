package Offer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Number7Test {

  @Test
  void test() {
    Number7 testNumber7 = new Number7();
    int[] nums1 = new int[] {-1, 0, 1, 2, -1, -4};
    assertEquals(2, testNumber7.threeSum(nums1).size());
    int[] nums2 = new int[] {0, 0, 0};
    assertEquals(1, testNumber7.threeSum(nums2).size());
    int[] nums3 = new int[] {-1, 0, 1, 0};
    assertEquals(1, testNumber7.threeSum(nums3).size());
  }

}
