package Offer;

public class Number5 {

  public int maxProduct(String[] words) {
    int result = 0;
    int[] flags = new int[words.length];
    for (int i = 0; i < words.length; i++) {
      for (char ch : words[i].toCharArray()) {
        // ���Ǹ���д����������ch-'a',����0-25,1��λ��λ���Ǵ������flag�ĵ�ch-aλΪ1���ʹ����Ǹ���ĸ��λ�á�
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

