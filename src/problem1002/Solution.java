package problem1002;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> commonChars(String[] A) {
    int[][] counts = new int[2][26];
    for (int i = 0; i < A[0].length(); i++) {
      counts[0][A[0].charAt(i) - 'a']++;
    }
    for (int i = 1; i < A.length; i++) {
      for (int j = 0; j < A[i].length(); j++) {
        counts[1][A[i].charAt(j) - 'a']++;
      }
      for (int j = 0; j < 26; j++) {
        counts[0][j] = Math.min(counts[0][j], counts[1][j]);
        counts[1][j] = 0;
      }
    }
    List<String> result = new ArrayList<>();
    for (int i = 0; i < 26; i++) {
      for (int j = 0; j < counts[0][i]; j++) {
        result.add((char) (i + (int) 'a') + "");
      }
    }
    return result;
  }
}
