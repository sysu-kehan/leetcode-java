package problem198;

class Solution {
  public int rob(int[] nums) {
    int using = 0, avoid = 0;
    for (int i = 0; i < nums.length; i++) {
      int temp = using;
      using = Math.max(nums[i] + avoid, using);
      avoid = temp;
    }
    return Math.max(using, avoid);
  }
}
