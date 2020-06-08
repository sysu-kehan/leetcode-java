package problem152;

class Solution {
  public int maxProduct(int[] nums) {
    int min = nums[0], max = nums[0], result = nums[0];
    for (int i = 1; i < nums.length; i++) {
      int temp = Math.min(Math.min(max * nums[i], min * nums[i]), nums[i]);
      max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
      min = temp;
      result = Math.max(result, max);
    }
    return result;
  }
}
