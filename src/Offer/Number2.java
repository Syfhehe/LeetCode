package Offer;

public class Number2 {

  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int length = 0;
    int aLength = a.length() - 1;
    int bLength = b.length() - 1;
    int temp = 0, aInt, bInt;
    length = aLength > bLength ? aLength : bLength;
    // charAt���ص���acsii���ֵ��1��49.��ȥ'0�����ܵõ�ʵ��ֵ
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
    // reverse�ַ�����ת
    return sb.reverse().toString();
  }

}
