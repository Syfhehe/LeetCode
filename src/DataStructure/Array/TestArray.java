package DataStructure.Array;

import java.util.Arrays;

public class TestArray {
  public static void main(String[] args) {
    // ���鴴��
    int[] arr1 = new int[3];
    int[] arr2 = new int[] {1, 2, 3, 4, 5};
    int[] arr3 = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr3));
    // ���鳤��
    int length = arr2.length;

    // Ϊ�������һλ
    int[] newArr = new int[length + 1];
    for (int i = 0; i < arr2.length; i++) {
      newArr[i] = arr2[i];
    }
    newArr[arr2.length] = 6;
    System.out.println(Arrays.toString(newArr));

    // ɾ�������е�һ��Ԫ��
    int dist = 3;
    int[] newArr1 = new int[length - 1];
    for (int i = 0; i < newArr1.length; i++) {
      if (i >= dist) {
        newArr1[i] = arr2[i + 1];
      } else
        newArr1[i] = arr2[i];
    }
    System.out.println(Arrays.toString(newArr1));

  }
}
