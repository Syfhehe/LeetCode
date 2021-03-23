package Leetcode;

public class No9 {
  public static boolean isPalindrome(int x) {
    if (x < 0) return false;

    String str = String.valueOf(x);

    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(-121));
    System.out.println(isPalindrome(121));
    System.out.println(isPalindrome(-1221));
    System.out.println(isPalindrome(1221));
  }

}
