package offer11;

class Solution {
  public int minArray(int[] numbers) {
    int temp = numbers[0];
    for (int i = 0; i + 1 < numbers.length; i++) {
      if (numbers[i] > numbers[i + 1]) {
        return numbers[i + 1];
      }
    }
    return temp;
  }
}
