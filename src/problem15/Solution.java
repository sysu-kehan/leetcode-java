package problem15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    List<List<Integer>> resultList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int target = -nums[i];
      int k = n - 1;
      for (int j = i + 1; j < n; j++) {
        if (j > i + 1 && nums[j] == nums[j - 1]) {
          continue;
        }
        for (; j < k && nums[j] + nums[k] > target; k--);
        if (j == k) {
          break;
        }
        if (nums[j] + nums[k] == target) {
          List<Integer> tmp = new ArrayList<>();
          tmp.add(nums[i]);
          tmp.add(nums[j]);
          tmp.add(nums[k]);
          resultList.add(tmp);
        }
      }
    }
    return resultList;
  }
}