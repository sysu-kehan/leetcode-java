package doubleweek30.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
  public int rangeSum(int[] nums, int n, int left, int right) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
          sum += nums[k];
        }
        list.add(sum);
      }
    }
    Collections.sort(list);
    int result = 0;
    int mod = (int)Math.pow(10, 9) + 7;
    for (int i = left - 1; i < right; i++) {
      result += list.get(i);
      result %= mod;
    }
    return result;
  }
}
