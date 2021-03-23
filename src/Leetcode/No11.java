package Leetcode;

public class No11 {

  public static int maxArea(int[] height) {
    int area;
    int maxArea = 0;
    for (int i = 0; i < height.length; i++) {
      for (int j = height.length - 1; j > i; j--) {
        area = Math.min(height[i], height[j]) * (j - i);
        maxArea = Math.max(maxArea, area);
      }
    }
    return maxArea;
  }

  public static void main(String[] args) {
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    System.out.println(maxArea(height));
    int[] height2 = {4, 3, 2, 1, 4};
    System.out.println(maxArea(height2));

  }
}
