package Algorithm.Sort;

import java.util.Arrays;

//重点：
public class MergeSort {
  public static void main(String[] args) {
    int[] array = new int[] {8, 12, 21, 1, 3, 76, 89, 64, 33, 89, 100};
    mergeSort(array, 0, array.length - 1);
    System.out.println(Arrays.toString(array));
  }

  public static void mergeSort(int[] arr, int low, int high) {
    int mid = (high + low) / 2;
    if (low<high) {
      mergeSort(arr, low, mid);
      mergeSort(arr, mid + 1, high);
      merge(arr, low, mid, high);
    }
  }

  public static void merge(int[] arr, int low, int mid, int high) {
    int[] temp = new int[high - low + 1];
    int i = low;
    int j = mid + 1;
    int index = 0;
    while (i < mid && j <= high) {
      if (arr[i] <= arr[j]) {
        temp[index] = arr[i];
        i++;
        index++;
      } else {
        temp[index] = arr[j];
        j++;
        index++;
      }
    }
    // 处理多余数据
    while (i <= mid) {
      temp[index] = arr[i];
      i++;
      index++;
    }
    while (j <= high) {
      temp[index] = arr[j];
      j++;
      index++;
    }
    // 把临时数组中的数据重新存入原数组
    for (int k = 0; k < temp.length; k++) {
      arr[k + low] = temp[k];
    }

  }

}
