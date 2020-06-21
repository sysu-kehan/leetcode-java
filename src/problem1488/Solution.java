package problem1488;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] avoidFlood(int[] rains) {
    int[] ans = new int[rains.length];
    Map<Integer, Integer> full = new HashMap<>();
    for (int i = 0; i < rains.length; i++) {
      int rain = rains[i];
      if (rain > 0) {
        ans[i] = -1;
        if (full.containsKey(rain)) {
          int day = full.get(rain);
          boolean sign = false;
          for (int j = day + 1; j < i; j++) {
            if (ans[j] == 0) {
              ans[j] = rain;
              full.put(rain, i);
              sign = true;
              break;
            }
          }
          if (!sign) {
            return new int[]{};
          }
        } else {
          full.put(rain, i);
        }
      } else {
        ans[i] = 0;
      }
    }
    for (int i = 0; i < ans.length; i++) {
      if (ans[i] == 0) {
        ans[i] = 1;
      }
    }
    return ans;
  }
}
