package Algorithm.Sort;

import java.util.Arrays;

public class RadixSort {
  public static void main(String[] args) {
    int[] array = new int[] {8, 12, 21, 1, 3, 76, 89, 64, 33, 89, 100, 12, 21212, 1221, 1721};
    radixQueueSort(array);
    System.out.println(Arrays.toString(array));
  }

  public static void radixQueueSort(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    // �λ��
    int maxLength = (max + "").length();
    // Ͱ
    DataStructure.Queue.MyQueue[] temp = new DataStructure.Queue.MyQueue[10];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = new DataStructure.Queue.MyQueue();
    }
    // ��¼Ͱ��ÿһ������
    for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
      // �Ž�Ͱ��
      for (int j = 0; j < arr.length; j++) {
        int ys = arr[j] / n % 10;
        temp[ys].add(arr[j]);
      }
      // ��Ͱ��ȡ����
      int s = 0;
      for (int k = 0; k < temp.length; k++) {
        while (!temp[k].isEmpty()) {
          arr[s] = temp[k].poll();
          s++;
        }
      }
    }
  }

  public static void radixSort(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    // �λ��
    int maxLength = (max + "").length();
    // Ͱ
    int[][] temp = new int[10][arr.length];
    // ��¼Ͱ��ÿһ������
    int[] counts = new int[10];
    for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
      // �Ž�Ͱ��
      for (int j = 0; j < arr.length; j++) {
        int ys = arr[j] / n % 10;
        temp[ys][counts[ys]] = arr[j];
        counts[ys]++;
      }
      // ��Ͱ��ȡ����
      int s = 0;
      for (int k = 0; k < counts.length; k++) {
        if (counts[k] != 0) {
          for (int l = 0; l < counts[k]; l++) {
            arr[s] = temp[k][l];
            s++;
          }
          // �´���countҪΪ0
          counts[k] = 0;
        }
      }
    }
  }

}
