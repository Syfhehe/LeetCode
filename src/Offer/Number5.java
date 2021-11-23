package Offer;

public class Number5 {

  public int maxProduct(String[] words) {
    int result = 0;
    int[] flags = new int[words.length];
    for (int i = 0; i < words.length; i++) {
      for (char ch : words[i].toCharArray()) {
        // 不是高手写不出来啊，ch-'a',就是0-25,1移位几位就是代表这个flag的第ch-a位为1，就代表那个字母的位置。
        flags[i] |= 1 << (ch - 'a');
      }
    }

    for (int i = 0; i < words.length; i++) {
      for (int j = 0; j < words.length; j++) {
        if ((flags[i] & flags[j]) == 0) {
          int prod = words[i].length() * words[j].length();
          result = Math.max(prod, result);
        }
      }
    }

    return result;

  }


}

