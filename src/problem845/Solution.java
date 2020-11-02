package problem845;

class Solution {
  public int longestMountain(int[] A) {
    int beginIndex = 0;
    boolean up = true;
    int endIndex = -1;
    int result = 0;
    for (int i = 1; i < A.length; i++) {
      int cur = A[i];
      int pre = A[i - 1];
      if (cur >= pre) {
        if (up) {
          if (cur == pre) {
            beginIndex = i;
          }
        } else {
          endIndex = i - 1;
          result = Math.max(result, endIndex - beginIndex + 1);
          beginIndex = cur == pre ? i : i - 1;
          up = true;
          endIndex = -1;
        }
      } else {
        if (up) {
          if (beginIndex == i - 1) {
            beginIndex = i;
          } else {
            up = false;
          }
        }
      }
    }
    return up ? result : Math.max(result, A.length - beginIndex);
  }
}
