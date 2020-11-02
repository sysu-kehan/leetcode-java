package problem1;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    int length = nums.length;
    for (int i = 0; i < length; i++) {
      for (int j = length - 1; i < j; j--) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return new int[]{};
  }
}
