package problem1207;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
  public boolean uniqueOccurrences(int[] arr) {
    Arrays.sort(arr);
    Set<Integer> set = new HashSet<>();
    int count = 1;
    for (int i = 1; i < arr.length; i++) {
      int cur = arr[i];
      int pre = arr[i - 1];
      if (cur != pre) {
        if (set.contains(count)) {
          return false;
        } else {
          set.add(count);
        }
        count = 1;
      } else {
        count++;
      }
    }
    return !set.contains(count);
  }
}
