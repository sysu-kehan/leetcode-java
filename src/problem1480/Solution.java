package problem1480;

class Solution {
  public int[] runningSum(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0, sum = 0; i < nums.length; i++) {
      sum += nums[i];
      result[i] = sum;
    }
    return result;
  }
}
