package doubleweek31.problem4;

class Solution {
  public int minNumberOperations(int[] target) {
    boolean sign = true;
    int count = 0;
    while (sign) {
      sign = false;
      int beginIndex = -1;
      for (int i = 0; i < target.length; i++) {
        if (target[i] > 0 && beginIndex < 0) {
          beginIndex = i;
          sign = true;
        }
        if (target[i] == 0 && beginIndex >= 0) {
          count += minNumberOperations(target, beginIndex, i - 1);
          beginIndex = -1;
        }
      }
      if (beginIndex >= 0) {
        count += minNumberOperations(target, beginIndex, target.length - 1);
      }
    }
    return count;
  }

  private int minNumberOperations(int[] target, int beginIndex, int endIndex) {
    int min = Integer.MAX_VALUE;
    for (int i = beginIndex; i <= endIndex; i++) {
      if (target[i] < min) {
        min = target[i];
      }
    }
    for (int i = beginIndex; i <= endIndex; target[i] -= min, i++);
    return min;
  }
}
