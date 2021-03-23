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
      // �������еĵ�0����Ϊ��׼��
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

      // ����ȱ�׼��С������
      quickSort(arr, start, low);

      // ����ȱ�׼���������
      quickSort(arr, low + 1, end);
    }
    
  }

}
