package Offer;

import java.util.HashMap;
import java.util.Map;

public class Number16 {

  public int lengthOfLongestSubstring(String s) {

    if (s.length() == 0) {
      return 0;
    }
    int longestLen = 1;
    int iValue;
    int jValue;
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < s.length(); i++) {
      map = new HashMap<Character, Integer>();
      iValue = map.getOrDefault(s.charAt(i), 0);
      if (iValue != 0) {
        continue;
      }
      map.put(s.charAt(i), 1);
      for (int j = i + 1; j < s.length(); j++) {
        jValue = map.getOrDefault(s.charAt(j), 0);
        if (jValue != 0) {
          break;
        }
        map.put(s.charAt(j), 1);
        longestLen = Math.max(longestLen, j - i + 1);
      }
    }
    return longestLen;

  }

}

