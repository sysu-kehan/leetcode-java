package problem1365;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] sortNums = Arrays.copyOf(nums, nums.length);
    Arrays.sort(sortNums);
    Map<Integer, Integer> map = new HashMap<>();
    int[] counts = new int[sortNums.length];
    counts[0] = 0;
    map.put(sortNums[0], counts[0]);
    for (int i = 1; i < sortNums.length; i++) {
      int pre = sortNums[i - 1];
      int cur = sortNums[i];
      if (pre == cur) {
        counts[i] = counts[i - 1];
      } else {
        counts[i] = i;
      }
      map.put(cur, counts[i]);
    }
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      result[i] = map.get(nums[i]);
    }
    return result;
  }
}
