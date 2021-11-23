package Offer;

import org.junit.jupiter.api.Test;

class Number10Test {

  @Test
  void test() {
    Number10 testNumber10 = new Number10();
    int[] nums1 = new int[] {1,2,3};
    testNumber10.subarraySum(nums1, 3);
  }

}
