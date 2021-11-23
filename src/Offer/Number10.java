package Offer;

import java.util.HashMap;
import java.util.Map;

public class Number10 {

  public int subarraySum(int[] nums, int k) {
    //key:前n个item的和，和出现的次数。
    Map<Integer, Integer> sumToCountMap = new HashMap<Integer, Integer>();
    sumToCountMap.put(0, 1);
    int sum = 0;
    int count = 0;
    for (int num : nums) {
      sum += num;
      count += sumToCountMap.getOrDefault(sum - k, 0);
      sumToCountMap.put(sum, sumToCountMap.getOrDefault(sum, 0) + 1);
    }
    return count;
  }

}

