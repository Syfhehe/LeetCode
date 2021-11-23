package Offer;

public class Number2 {

  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int length = 0;
    int aLength = a.length() - 1;
    int bLength = b.length() - 1;
    int temp = 0, aInt, bInt;
    length = aLength > bLength ? aLength : bLength;
    // charAt返回的是acsii码的值，1是49.减去'0，就能得到实际值
    for (int i = length; i >= 0; i--) {
      aInt = aLength >= 0 ? a.charAt(aLength--) - '0' : 0;
      bInt = bLength >= 0 ? b.charAt(bLength--) - '0' : 0;
      int sum = aInt + bInt + temp;
      if (sum >= 2) {
        temp = 1;
      } else {
        temp = 0;
      }
      if (sum % 2 == 0) {
        sb.append("0");
      } else {
        sb.append("1");
      }
    }
    if (temp == 1) {
      sb.append(temp);
    }
    // reverse字符串翻转
    return sb.reverse().toString();
  }

}
