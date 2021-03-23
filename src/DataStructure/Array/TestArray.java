package DataStructure.Array;

import java.util.Arrays;

public class TestArray {
  public static void main(String[] args) {
    // 数组创建
    int[] arr1 = new int[3];
    int[] arr2 = new int[] {1, 2, 3, 4, 5};
    int[] arr3 = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr3));
    // 数组长度
    int length = arr2.length;

    // 为数组添加一位
    int[] newArr = new int[length + 1];
    for (int i = 0; i < arr2.length; i++) {
      newArr[i] = arr2[i];
    }
    newArr[arr2.length] = 6;
    System.out.println(Arrays.toString(newArr));

    // 删除数组中的一个元素
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
