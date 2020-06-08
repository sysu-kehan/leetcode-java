package interview42;

class Solution {
  public int maxSubArray(int[] nums) {
    int pre = nums[0];
    int result = nums[0];
    for (int i = 1; i < nums.length; i++) {
      pre = Math.max(pre + nums[i], nums[i]);
      result = Math.max(result, pre);
    }
    return result;
  }
}
