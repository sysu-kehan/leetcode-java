package doubleweek38.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
  public int maxWidthOfVerticalArea(int[][] points) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < points.length; i++) {
      list.add(points[i][0]);
    }
    Collections.sort(list);
    int max = list.get(1) - list.get(0);
    for (int i = 1; i < list.size() - 1; i++) {
      max = Math.max(list.get(i + 1) - list.get(i), max);
    }
    return max;
  }
}
