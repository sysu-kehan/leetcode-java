package doubleweek29.problem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public int minNumberOfSemesters(int n, int[][] dependencies, int k) {
    int[][] map1 = new int[n + 1][n + 1];
    String allZero = Arrays.toString(new int[n + 1]);
    int[] important = new int[n + 1];
    for (int i = 0; i < dependencies.length; i++) {
      int x = dependencies[i][1];
      int y = dependencies[i][0];
      important[y]++;
      map1[x][y] = 1;
    }
    List<Integer> temp = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    int count = 0;
    while (result.size() < n) {
      for (int i = 1; i <= n; i++) {
        for (int j : result) {
          map1[i][j] = 0;
        }
      }
      for (int i = 1; i <= n; i++) {
        if (!result.contains(i) && Arrays.toString(map1[i]).equals(allZero)) {
          temp.add(i);
        }
      }
      if (temp.size() > k) {
        temp.sort((o1, o2) -> important[o2] - important[o1]);
        temp = temp.subList(0, k);
      }
      result.addAll(temp);
      temp.clear();
      count++;
    }
    return count;
  }
}
