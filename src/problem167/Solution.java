package problem167;

class Solution {

  public int[] twoSum(int[] numbers, int target) {
    for (int beginIndex = 0, endIndex = numbers.length - 1; beginIndex < endIndex; ) {
      int sum = numbers[beginIndex] + numbers[endIndex];
      if (sum == target) {
        return new int[]{beginIndex + 1, endIndex + 1};
      } else if (sum < target) {
        beginIndex++;
      } else {
        endIndex--;
      }
    }
    return new int[]{};
  }
}
