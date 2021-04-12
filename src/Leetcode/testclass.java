package Leetcode;

import java.util.List;

public class testclass {

  public static void main(String[] args) {
    No22 generateParenthesis = new No22();
    List<String> ans = generateParenthesis.generateParenthesis(3);
    System.out.println(ans.toString());
  }
}
