package problem763;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> partitionLabels(String S) {
    int[] ends = new int[26];
    for (int i = 0; i < S.length(); i++) {
      ends[S.charAt(i) - 'a'] = i;
    }
    List<Integer> list = new ArrayList<>();
    for (int i = 0, start = 0, max = -1; i < S.length(); i++) {
      max = Math.max(max, ends[S.charAt(i) - 'a']);
      if (i == max) {
        list.add(max - start + 1);
        start = max + 1;
      }
    }
    return list;
  }
}
