package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class No6 {
  public static String convert1(String s, int numRows) {
    if (numRows == 1) return s;

    List<StringBuilder> rows = new ArrayList<>();
    for (int i = 0; i < Math.min(numRows, s.length()); i++)
      rows.add(new StringBuilder());

    int curRow = 0;
    boolean goingDown = false;

    for (char c : s.toCharArray()) {
      rows.get(curRow).append(c);
      if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
      curRow += goingDown ? 1 : -1;
    }

    StringBuilder ret = new StringBuilder();
    for (StringBuilder row : rows)
      ret.append(row);
    return ret.toString();
  }

  public static String convert2(String s, int numRows) {
    int length = s.length();

    if (numRows == 1 || numRows >= length) {
      return s;
    }
    StringBuilder ret = new StringBuilder();


    for (int k = 0; 2 * k * (numRows - 1) < length; k++) {
      ret.append(s.charAt(2 * k * (numRows - 1)));
    }

    for (int i = 1; i < numRows - 1; i++) {      
      for (int k = 0; k < length; k++) {
        if (k % 2 != 0 && (k + 1) * (numRows - 1) - i < length)
          ret.append((s.charAt((k + 1) * (numRows - 1) - i)));
        else if (k % 2 == 0 && k * (numRows - 1) + i < length) {
          ret.append((s.charAt(k * (numRows - 1) + i)));
        }
      }
    }

    for (int k = 0; (2 * k + 1) * (numRows - 1) < length; k++) {
      ret.append((s.charAt((2 * k + 1) * (numRows - 1))));
    }
    return ret.toString();
  }

  public static void main(String[] args) {
    System.out.println(convert1("PAYPALISHIRING", 4));
    System.out.println(convert2("PAYPALISHIRING", 4));
    System.out.println(convert1("ABCDE", 3));
    System.out.println(convert2("ABCDE", 3));
    System.out.println(convert1("ABCDEF", 5));
    System.out.println(convert2("ABCDEF", 5));
    System.out.println(convert1("PAYPALISHIRING", 3));
    System.out.println(convert2("PAYPALISHIRING", 3));
  }



}
