package Offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Number11Test {

  @Test
  void test() {
    Number11 testNumber11 = new Number11();
    int[] nums1 = new int[] {0, 1};
    assertEquals(2, testNumber11.findMaxLength(nums1));
    int[] nums2 = new int[] {0, 1, 0};
    assertEquals(2, testNumber11.findMaxLength(nums2));

  }

}
