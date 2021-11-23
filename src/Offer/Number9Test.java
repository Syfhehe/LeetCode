package Offer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Number9Test {

  @Test
  void test() {
    Number8 testNumber8 = new Number8();
    int[] nums1 = new int[] {2, 3, 1, 2, 4, 3};
    assertEquals(2, testNumber8.minSubArrayLen(7, nums1));
    int[] nums2 = new int[] {1, 4, 4};
    assertEquals(1, testNumber8.minSubArrayLen(4, nums2));
    int[] nums3 = new int[] {1, 1, 1, 1, 1, 1, 1, 1};
    assertEquals(0, testNumber8.minSubArrayLen(11, nums3));
  }

}
