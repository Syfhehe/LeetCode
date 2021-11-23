package Offer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Number4Test {

  @Test
  void test() {
    Number4 testNumber4 = new Number4();
    int[] nums1 = {2, 2, 3, 2};
    assertEquals(testNumber4.singleNumber(nums1), 3);
    int[] nums2 = {0, 1, 0, 1, 0, 1, 100};
    assertEquals(testNumber4.singleNumber(nums2), 100);

  }

}
