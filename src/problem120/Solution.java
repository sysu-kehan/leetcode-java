package problem120;

import java.util.List;

class Solution {

  public int minimumTotal(List<List<Integer>> triangle) {
    Integer[] result = triangle.get(triangle.size() - 1).toArray(new Integer[]{});
    for (int i = triangle.size() - 2; i >= 0; i--) {
      List<Integer> list = triangle.get(i);
      for (int j = 0; j < list.size(); j++) {
        result[j] = list.get(j) + Math.min(result[j], result[j + 1]);
      }
    }
    return result[0];
  }
}
