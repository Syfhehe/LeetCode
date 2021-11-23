package Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number7 {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> resultList = new ArrayList<List<Integer>>();

    if (nums.length >= 3) {
      Arrays.sort(nums);
      int i = 0;
      while (i < nums.length - 2) {
        int value = 0 - nums[i];
        int j = i + 1;
        int k = nums.length - 1;
        while (j < k) {
          if (nums[j] + nums[k] < value) {
            ++j;
          } else if (nums[j] + nums[k] > value) {
            --k;
          } else {
            resultList.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k])));
            int temp2 = nums[j];
            while (nums[j] == temp2 && j < k) {
              ++j;
            }
          }
        }
        int temp1 = nums[i];
        while (nums[i] == temp1 && i < nums.length - 2) {
          ++i;
        }
      }
    }
    return resultList;
  }

}

