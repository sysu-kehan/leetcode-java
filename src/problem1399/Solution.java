package problem1399;

import java.util.Arrays;

class Solution {
  public int countLargestGroup(int n) {
    int[] counts = new int[37];
    Arrays.fill(counts, 0);
    for (int i = 1; i <= n; i++) {
      int sum = 0;
      for (int j = i; j > 0; sum += j % 10, j /= 10);
      counts[sum]++;
    }
    Arrays.sort(counts);
    int count = 0;
    for (int i = counts.length - 1, max = counts[i]; i >= 0 && counts[i] == max; i--, count++);
    return count;
  }
}
