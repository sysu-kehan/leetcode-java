package problem1403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<Integer> minSubsequence(int[] nums) {
    Arrays.sort(nums);
    int sum = 0;
    for (int i : nums) {
      sum += i;
    }
    List<Integer> list = new ArrayList<>();
    int halfSum = 0;
    int half = sum >> 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      list.add(nums[i]);
      halfSum += nums[i];
      if (halfSum > half) {
        break;
      }
    }
    return list;
  }
}
