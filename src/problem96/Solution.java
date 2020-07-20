package problem96;

class Solution {
  public int numTrees(int n) {
    int[] array = new int[n + 1];
    array[0] = 1;
    array[1] = 1;
    for (int i = 2; i <= n; i++) {
      int middle = i >> 1;
      for (int j = 0; j < middle; j++) {
        array[i] += array[j] * array[i - j - 1] * 2;
      }
      if (i % 2 == 1) {
        array[i] += array[middle] * array[middle];
      }
    }
    return array[n];
  }
}
