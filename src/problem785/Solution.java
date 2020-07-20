package problem785;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
  public boolean isBipartite(int[][] graph) {
    int[] sign = new int[graph.length];
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    set1.add(0);
    while (!set1.isEmpty()) {
      Iterator<Integer> ite = set1.iterator();
      while (ite.hasNext()) {
        int cur = ite.next();
        if (sign[cur] == 1) {
          continue;
        }
        if (sign[cur] == 2) {
          return false;
        }
        sign[cur] = 1;
        for (int i : graph[cur]) {
          set2.add(i);
        }
      }
      set1.clear();
      ite = set2.iterator();
      while (ite.hasNext()) {
        int cur = ite.next();
        if (sign[cur] == 2) {
          continue;
        }
        if (sign[cur] == 1) {
          return false;
        }
        sign[cur] = 2;
        for (int i : graph[cur]) {
          set1.add(i);
        }
      }
      set2.clear();
      if (set1.isEmpty()) {
        for (int i = 0; i < sign.length; i++) {
          if (sign[i] == 0) {
            set1.add(i);
            break;
          }
        }
      }
    }
    return true;
  }
}
