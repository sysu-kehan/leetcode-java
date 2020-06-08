package problem1394;

import java.util.Arrays;

class Solution {
  public int findLucky(int[] arr) {
    Arrays.sort(arr);
    for (int i = arr.length - 1; i >= 0;) {
      int cur = arr[i];
      int leftIndex = i - cur + 1;
      if (leftIndex >= 0 && arr[leftIndex] == cur && (leftIndex - 1 < 0 || arr[leftIndex - 1] != cur)) {
        return cur;
      }
      for (i--; i >= 0 && arr[i] == cur; i--);
    }
    return -1;
  }
}
