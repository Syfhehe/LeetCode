package Algorithm.Sort;

import java.util.Arrays;

public class SelectedSort {
  public static void main(String[] args) {
    int[] array = new int[] {8, 12, 21, 1, 3, 76, 89, 64, 33, 89, 100};
    selectSort(array);
    System.out.println(Arrays.toString(array));
  }

  public static void selectSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minIndex] < arr[j]) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
      }
    }

  }

}
