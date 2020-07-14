package problem120;

import java.util.ArrayList;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.minimumTotal(generateList(new int[][]{
        {2}, {3, 4}, {5, 6, 7}, {4, 1, 8, 3}
    })));
  }

  private static List<List<Integer>> generateList(int[][] array) {
    List<List<Integer>> list = new ArrayList<>();
    for (int[] arr : array) {
      List<Integer> temp = new ArrayList<>();
      for (int i : arr) {
        temp.add(i);
      }
      list.add(temp);
    }
    return list;
  }
}
