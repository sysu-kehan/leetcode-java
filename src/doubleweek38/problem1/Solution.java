package doubleweek38.problem1;

class Solution {
  public int[] frequencySort(int[] nums) {
    int[] counts = new int[201];
    int[] results = new int[nums.length];
    int numsCount = 0;
    for (int i = 0; i < nums.length; i++) {
      if (counts[nums[i] + 100] == 0) {
        numsCount++;
      }
      counts[nums[i] + 100]++;
    }
    for (int i = 0, resultIndex = 0; i < numsCount; i++) {
      int index = -1;
      int min = Integer.MAX_VALUE;
      for (int j = counts.length - 1; j >= 0; j--) {
        if (counts[j] > 0 && counts[j] < min) {
          min = counts[j];
          index = j;
        }
      }
      counts[index] = 0;
      for (int j = 0; j < min; j++) {
        results[resultIndex] = index - 100;
        resultIndex++;
      }
    }
    return results;
  }
}
