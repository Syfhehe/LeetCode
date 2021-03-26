package Algorithm.Sort;

import java.util.Arrays;

public class HeapSort {

  public static void main(String[] args) {
    int[] arr = {9, 6, 8, 7, 0, 1, 10, 4, 2};
    heapSort(arr);
    System.out.println(Arrays.toString(arr));

  }

  public static void heapSort(int[] arr) {
    int start = (arr.length - 1) / 2;
    for (int i = start; i >= 0; i--) {
      maxHeap(arr, arr.length, i);
    }

    for (int i = arr.length - 1; i > 0; i--) {
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;
      maxHeap(arr, i, 0);
    }

  }

  public static void maxHeap(int[] arr, int size, int index) {

    int leftNode = 2 * index + 1;
    int rightNode = 2 * index + 2;
    int max = index;

    if (leftNode < size && arr[max] < arr[leftNode]) {
      max = leftNode;
    }
    if (rightNode < size && arr[max] < arr[rightNode]) {
      max = rightNode;
    }

    if (max != index) {
      int temp = arr[index];
      arr[index] = arr[max];
      arr[max] = temp;
      // 交换位置后可能会破坏之前排好的堆 所以还需要排序
      maxHeap(arr, size, max);
    }

  }

}
