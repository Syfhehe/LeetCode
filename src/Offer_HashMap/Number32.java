package Offer_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Number32 {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length() || s.equals(t)) {
      return false;
    }
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < s.length(); i++) {
      map.put(s.charAt(i) - 'a', map.getOrDefault(s.charAt(i) - 'a', 0) + 1);
    }

    for (int i = 0; i < t.length(); i++) {
      map.put(t.charAt(i) - 'a', map.getOrDefault(t.charAt(i) - 'a', 0) - 1);
      if (map.get(t.charAt(i) - 'a') < 0) {
        return false;
      }
    }
    return true;

  }

}
