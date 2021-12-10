package Offer;

import java.util.ArrayList;
import java.util.List;

public class Number18 {

  public boolean isPalindrome(String s) {
    if (s.length() <= 1) {
      return true;
    }
    List<Character> list = new ArrayList<Character>();
    char[] array = s.toCharArray();
    for (int i = 0; i < array.length; i++) {
      Character ch = array[i];
      if (Character.isLetterOrDigit(ch)) {
        list.add(Character.toLowerCase(ch));
      }
    }

    int start = 0;
    int end = list.size() - 1;
    while (start < end) {
      if (list.get(start).equals(list.get(end))) {
        end--;
        start++;
      } else {
        return false;
      }
    }
    return true;

  }

}

