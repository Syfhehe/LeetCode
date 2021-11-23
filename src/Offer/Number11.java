package Offer;

import java.util.HashMap;
import java.util.Map;

public class Number11 {

  public int findMaxLength(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        nums[i] = -1;
      }
    }
    // key:前n个item的和，n。
    Map<Integer, Integer> findmaxMap = new HashMap<Integer, Integer>();
    int sum = 0;
    int result = 0;
    findmaxMap.put(0, -1);
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (findmaxMap.containsKey(sum)) {
        result = Math.max(result, i - findmaxMap.get(sum));
      } else {
        findmaxMap.put(sum, i);
      }
    }
    return result;
  }

}

