package Algorithm.Sort;

import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    int[] array = new int[] {8, 12, 21, 1, 3, 76, 89, 64, 33, 89, 100};
    quickSort(array, 0, array.length-1);
    System.out.println(Arrays.toString(array));
  }

  public static void quickSort(int[] arr, int start, int end) {
    if (start < end) {
      // 把数组中的第0个作为标准数
      int selectNum = arr[start];
      int low = start;
      int high = end;
      while (low < high) {
        while (low < high && selectNum <= arr[high]) {
          high--;
        }
        arr[low] = arr[high];
        while (low < high && selectNum >= arr[low]) {
          low++;
        }
        arr[high] = arr[low];
      }
      arr[low] = selectNum;

      // 处理比标准数小的数字
      quickSort(arr, start, low);

      // 处理比标准数大的数字
      quickSort(arr, low + 1, end);
    }
    
  }

}
