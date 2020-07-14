package problem315;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

  private Map<Integer, Integer> map;

  public List<Integer> countSmaller(int[] nums) {
    map = new HashMap<>();
    map.put(nums[nums.length - 1], 0);
    for (int i = nums.length - 2; i >= 0; i--) {
      int cur = nums[i];

    }
    return null;
  }
}
