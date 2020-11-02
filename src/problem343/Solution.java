package problem343;

class Solution {
  public int integerBreak(int n) {
    if (n <= 3) {
      return n - 1;
    }
    int[] array = new int[n + 1];
    array[2] = 2;
    array[3] = 3;
    for (int i = 4; i <= n; i++) {
      int max = Integer.MIN_VALUE;
      for (int j = 2; i - j >= j; j++) {
        int cur = array[j] * array[i - j];
        max = Math.max(cur, max);
      }
      array[i] = max;
    }
    return array[n];
  }
}
