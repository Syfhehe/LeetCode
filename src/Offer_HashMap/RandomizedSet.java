package Offer_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {
  /** Initialize your data structure here. */
  Map<Integer, Integer> map;
  ArrayList<Integer> nums;

  public RandomizedSet() {
    map = new HashMap<Integer, Integer>();
    nums = new ArrayList<Integer>();
  }

  /**
   * Inserts a value to the set. Returns true if the set did not already contain the specified
   * element.
   */
  public boolean insert(int val) {
    if (map.containsKey(val)) {
      return false;
    }
    map.put(val, nums.size());
    nums.add(val);
    return true;
  }

  /** Removes a value from the set. Returns true if the set contained the specified element. */
  public boolean remove(int val) {
    if (!map.containsKey(val)) {
      return false;
    }
    int location = map.get(val);
    map.put(nums.get(nums.size() - 1), location);
    map.remove(val);
    nums.set(location, nums.get(nums.size() - 1));
    nums.remove(nums.size() - 1);
    return true;
  }

  /** Get a random element from the set. */
  public int getRandom() {
    Random random = new Random();
    return nums.get(random.nextInt(nums.size()));
  }
}
