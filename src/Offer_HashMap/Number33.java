package Offer_HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Number33 {

  public List<List<String>> groupAnagrams(String[] strs) {

    Map<String, List<String>> map = new HashMap<String, List<String>>();
    for (int i = 0; i < strs.length; i++) {
      String str = strs[i];
      char[] strArray = str.toCharArray();
      Arrays.sort(strArray);
      String newString = new String(strArray);
      map.putIfAbsent(newString, new LinkedList<String>());
      map.get(newString).add(str);
    }
    return new LinkedList<List<String>>(map.values());

  }
}
