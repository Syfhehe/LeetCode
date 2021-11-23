package Offer;

import java.util.ArrayList;
import java.util.List;

public class Number15 {

  public List<Integer> findAnagrams(String s, String p) {

    List<Integer> resultList = new ArrayList<Integer>();
    if (p.length() > s.length()) {
      return resultList;
    }

    int[] counts = new int[26];

    for (int i = 0; i < p.length(); i++) {
      counts[p.charAt(i) - 'a']++;
      counts[s.charAt(i) - 'a']--;
    }

    if (areAllZero(counts)) {
      resultList.add(0);
    }

    for (int i = p.length(); i < s.length(); i++) {
      counts[s.charAt(i) - 'a']--;
      counts[s.charAt(i - p.length()) - 'a']++;
      if (areAllZero(counts)) {
        resultList.add(i - p.length() + 1);
      }
    }
    return resultList;

  }

  private boolean areAllZero(int[] counts) {
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] != 0) {
        return false;
      }
    }
    return true;
  }

}

