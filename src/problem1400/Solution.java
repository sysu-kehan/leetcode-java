package problem1400;

import java.util.Arrays;

class Solution {
  public boolean canConstruct(String s, int k) {
    if (s.length() < k) {
      return false;
    }
    int[] array = new int[26];
    Arrays.fill(array, 0);
    for (char tmp : s.toCharArray()) {
      array[tmp - 'a']++;
    }
    int odd = 0;
    for (int i = 0; i < 26; i++) {
      if (array[i] % 2 == 1) {
        odd++;
      }
    }
    return odd <= k;
  }
}
