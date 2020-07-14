package doubleweek30.problem3;

import java.util.Arrays;

class Solution {
  public int minDifference(int[] nums) {
    if (nums.length <= 4) {
      return 0;
    }
    Arrays.sort(nums);
    int min = Integer.MAX_VALUE;
    for (int diff = nums.length - 4, i = diff; i < nums.length; i++) {
      int curDiff = nums[i] - nums[i - diff];
      if (curDiff < min) {
        min = curDiff;
        if (min <= 0) {
          break;
        }
      }
    }
    return min;
  }
}
