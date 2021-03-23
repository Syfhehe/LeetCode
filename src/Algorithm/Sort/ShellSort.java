package Algorithm.Sort;

import java.util.Arrays;

public class ShellSort {
  public static void main(String[] args) {
    int[] array = new int[] {8, 12, 21, 1, 3, 76, 89, 64, 33, 89, 100};
    shellSort(array);
    System.out.println(Arrays.toString(array));
  }

  public static void shellSort(int[] arr) {
    for (int d = arr.length / 2; d >= 1; d /= 2) {
      for (int i = d; i < arr.length; i++) {
        // 遍历本组元素
        for (int j = i - d; j >= 0; j -= d) {
          if (arr[j] > arr[j + d]) {
            int temp = arr[j];
            arr[j] = arr[j + d];
            arr[j + d] = temp;
          }
        }
      }
    }
  }

}
