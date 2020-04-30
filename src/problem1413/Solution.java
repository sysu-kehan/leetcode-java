package problem1413;

class Solution {
  public int minStartValue(int[] nums) {
    int min = Integer.MAX_VALUE;
    int sum = 0;
    for (int num : nums) {
      sum += num;
      min = Math.min(min, sum);
    }
    return Math.max(1, 1 - min);
  }
}
