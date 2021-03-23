package DataStructure.Array;

import java.util.Arrays;

public class MyArray {

  private int[] elements;

  public MyArray() {
    elements = new int[] {};
  }

  public void add(int element) {
    int[] newArr = new int[elements.length + 1];
    for (int i = 0; i < elements.length; i++) {
      newArr[i] = elements[i];
    }
    newArr[elements.length] = element;
    elements = newArr;
  }

  public void delete(int index) {
    if (index < 0 || index > elements.length) {
      throw new RuntimeException("下标越界");
    }
    int[] newArr = new int[elements.length - 1];
    for (int i = 0; i < newArr.length; i++) {
      if (i >= index) {
        newArr[i] = elements[i + 1];
      } else
        newArr[i] = elements[i];
    }
    elements = newArr;
  }

  public void show() {
    System.out.println(Arrays.toString(elements));
  }

  public int get(int index) {
    return elements[index];
  }

  public void insert(int index, int element) {
    int[] newArr = new int[elements.length + 1];
    for (int i = 0; i < elements.length; i++) {
      if (index > i) {
        newArr[i] = elements[i];

      } else {
        newArr[i + 1] = elements[i];
      }
    }
    newArr[index] = element;
    elements = newArr;
  }
}
