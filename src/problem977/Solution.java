package problem977;

import java.util.Arrays;

class Solution {
  public int[] sortedSquares(int[] A) {
    int[] results = new int[A.length];
    for (int i = 0; i < A.length; i++) {
      results[i] = A[i] * A[i];
    }
    Arrays.sort(results);
    return results;
  }
}