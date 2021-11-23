package Offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Number12Test {

  @Test
  void test() {
    Number12 testNumber12 = new Number12();
    int[] nums1 = new int[] {1, 7, 3, 6, 5, 6};
    assertEquals(3, testNumber12.pivotIndex(nums1));
    int[] nums2 = new int[] {1, 2, 3};
    assertEquals(-1, testNumber12.pivotIndex(nums2));

  }

}
