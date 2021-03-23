package Algorithm.Sort;

import java.util.Arrays;

public class InsertSort {
  public static void main(String[] args) {
    int[] array = new int[] {8, 12, 21, 1, 3, 76, 89, 64, 33, 89, 100};
    insertSort(array);
    System.out.println(Arrays.toString(array));
  }

  public static void insertSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {
        int temp = arr[i];
        int j;
        for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
          arr[j + 1] = arr[j];
        }
        arr[j + 1] = temp;
      }
    }
  }

}
