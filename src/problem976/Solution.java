package problem976;

import java.util.Arrays;

class Solution {
  public int largestPerimeter(int[] A) {
    Arrays.sort(A);
    int i = A.length - 3;
    for (; i >= 0 && A[i] + A[i + 1] <= A[i + 2]; i--);
    return i < 0 ? 0 : A[i] + A[i + 1] + A[i + 2];
  }
}
