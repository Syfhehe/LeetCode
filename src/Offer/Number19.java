package Offer;

import java.util.ArrayList;
import java.util.List;

public class Number19 {

  public boolean validPalindrome(String s) {
    Boolean flagStart = true;
    Boolean flagEnd = true;

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
        if (flagStart && (start < end)) {
          flagStart = false;
          start++;
        } else if (flagEnd && (start < end)) {
          flagEnd = false;
          start--;
          end--;
        } else {
          return false;
        }
      }
    }
    return true;

  }

}

