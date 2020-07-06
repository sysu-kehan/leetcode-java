package doubleweek29.problem3;

class Solution {
  public int longestSubarray(int[] nums) {
    int cur = 0;
    int max = 0;
    int index = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        if (index == -1) {
          index = i;
        } else {
          cur = i - index - 1;
          index = i;
        }
      } else {
        cur++;
      }
      max = Math.max(max, index >= 0 ? cur : cur - 1);
    }
    return max;
  }
}
