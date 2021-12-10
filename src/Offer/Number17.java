package Offer;

import java.util.HashMap;
import java.util.Map;

public class Number17 {

  public String minWindow(String s, String t) {

    Map<Character, Integer> tMap = new HashMap<Character, Integer>();
    for (char ch : t.toCharArray()) {
      tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
    }

    int count = tMap.size();
    int start = 0, end = 0, minStart = 0, minEnd = 0;
    int minLength = Integer.MAX_VALUE;
    while (end < s.length() || (count == 0 && end == s.length())) {
      if (count > 0) {
        char endCh = s.charAt(end);
        if (tMap.containsKey(endCh)) {
          tMap.put(endCh, tMap.getOrDefault(endCh, 0) - 1);
          if (tMap.get(endCh) == 0) {
            count--;
          }
        }
        end++;
      } else {
        if (end - start < minLength) {
          minLength = end - start;
          minStart = start;
          minEnd = end;
        }
        char startCh = s.charAt(start);
        if (tMap.containsKey(startCh)) {
          tMap.put(startCh, tMap.getOrDefault(startCh, 0) + 1);
          if (tMap.get(startCh) == 1) {
            count++;
          }
        }
        start++;
      }

    }

    return minLength < Integer.MAX_VALUE ? s.substring(minStart, minEnd) : "";

  }

}

