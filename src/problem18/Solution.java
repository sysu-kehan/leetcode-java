package problem18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    int length = nums.length;
    Arrays.sort(nums);
    List<List<Integer>> resultList = new ArrayList<>();
    for (int i = 0; i < length; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      for (int j = i + 1; j < length; j++) {
        if (j > i + 1 && nums[j] == nums[j - 1]) {
          continue;
        }
        int loopTarget = target - nums[i] - nums[j];
        int l = length - 1;
        for (int k = j + 1; k < length; k++) {
          if (k > j + 1 && nums[k] == nums[k - 1]) {
            continue;
          }
          for (; k < l && nums[k] + nums[l] > loopTarget; l--);
          if (k == l) {
            break;
          }
          if (nums[k] + nums[l] == loopTarget) {
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            list.add(nums[j]);
            list.add(nums[k]);
            list.add(nums[l]);
            resultList.add(list);
          }
        }
      }
    }
    return resultList;
  }
}
