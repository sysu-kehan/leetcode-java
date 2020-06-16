package problem1014;

class Solution {

  public int maxScoreSightseeingPair(int[] A) {
    int max = A[0];
    int result = A[0] + A[1] - 1;
    for (int i = 1; i < A.length; i++) {
      result = Math.max(result, max + A[i] - i);
      max = Math.max(max, A[i] + i);
    }
    return result;
  }

  public int maxScoreSightseeingPair1(int[] A) {
    int length = A.length;
    int[][] array = new int[length][2];
    array[length - 1][0] = A[length - 1];
    array[length - 1][1] = length - 1;
    for (int i = length - 2, max = A[length - 1], maxIndex = length - 1; i >= 0; i--) {
      int cur = A[i];
      if (cur >= max) {
        max = cur;
        maxIndex = i;
      }
      array[i][0] = max;
      array[i][1] = maxIndex;
    }
    int result = Integer.MIN_VALUE;
    for (int i = 0; i < length - 1; i++) {
      for (int j = array[i + 1][1]; j > i; j--) {
        result = Math.max(result, A[i] + A[j] - (j - i));
      }
    }
    return result;
  }
}
