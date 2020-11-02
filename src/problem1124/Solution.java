package problem1124;

import java.util.Stack;

class Solution {
  public int longestWPI(int[] hours) {
    int[] counts = new int[hours.length];
    counts[0] = hours[0] > 8 ? 1 : -1;
    for (int i = 1; i < hours.length; i++) {
      counts[i] = counts[i - 1] + (hours[i] > 8 ? 1 : -1);
    }
    for (int i = counts.length - 1; i >= 0; i--) {
      if (counts[i] > 0) {
        return i + 1;
      } else if (counts[i] == 0) {
        return i;
      }
    }
    return 0;
  }
}
