package problem5386;

import java.util.Arrays;

class Solution {
  public boolean checkIfCanBreak(String s1, String s2) {
    char[] a1 = s1.toCharArray();
    Arrays.sort(a1);
    char[] a2 = s2.toCharArray();
    Arrays.sort(a2);
    int i = 0;
    for (; i < a1.length; i++) {
      if (a1[i] < a2[i]) {
        break;
      }
    }
    if (i != a1.length) {
      i = 0;
      for (; i < a1.length; i++) {
        if (a2[i] < a1[i]) {
          break;
        }
      }
      if (i != a1.length) {
        return false;
      }
    }
    return true;
  }
}
