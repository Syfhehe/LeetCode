package Leetcode;

public class No8 {

  public static int myAtoi(String s) {
    int result = 0;
    s = s.trim();
    StringBuilder sBuilder = new StringBuilder();
    int length = s.length();
    int flag = 1;

    if (s.length() == 0) return 0;

    char firstChar = s.charAt(0);
    if (!Character.isDigit(firstChar) && firstChar != '+' && firstChar != '-')
      return 0;
    else if (Character.isDigit(firstChar)) {
      sBuilder.append(String.valueOf(firstChar));
    } else if (firstChar == '+') {
      flag = 1;
    } else if (firstChar == '-') {
      flag = -1;
    }

    for (int i = 1; i < length; i++) {
      char c = s.charAt(i);
      if (Character.isDigit(c)) {
        sBuilder.append(String.valueOf(c));
      } else {
        break;
      }
    }

    String newStr = sBuilder.toString().replaceAll("^(0+)", "");
    try {
      if (newStr.length() > 10) {
        if (flag > 0) {
          return Integer.MAX_VALUE;
        } else {
          return Integer.MIN_VALUE;
        }
      }
      if (flag > 0) {
        result = (int) Math.min((long) Integer.MAX_VALUE, Long.parseLong(newStr));
      } else {
        result = (int) Math.max((long) Integer.MIN_VALUE, Long.parseLong(newStr) * flag);
      }
    } catch (Exception e) {
      return 0;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(myAtoi("123"));
    System.out.println(myAtoi("-123"));
    System.out.println(myAtoi("-123 asdasd"));
    System.out.println(myAtoi("words and 987"));
    System.out.println(myAtoi("words and -987"));
    System.out.println(myAtoi("words and -987 1212"));
    System.out.println(myAtoi("91283472332"));
    System.out.println(myAtoi("-91283472332"));
    System.out.println(myAtoi("+-12"));
    System.out.println(myAtoi("+ -12"));
    System.out.println(myAtoi(" "));
    System.out.println(myAtoi(""));
    System.out.println(myAtoi("  0000000000012345678"));
    System.out.println(myAtoi("-2147483648"));
    System.out.println(myAtoi("20000000000000000000"));
  }

}
