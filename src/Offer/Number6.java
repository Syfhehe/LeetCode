package Offer;

public class Number6 {

  public int[] twoSum(int[] numbers, int target) {
    
    int[] result = new int[2];
    int i = 0;
    int j = numbers.length - 1;

    while (i < j) {
      if (numbers[i] + numbers[j] < target) {
        i++;
      } else if (numbers[i] + numbers[j] > target) {
        j--;
      } else {
        return new int[] {i, j};
      }
    }

    return result;


  }


}

