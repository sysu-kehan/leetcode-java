package problem5387;

import java.util.ArrayList;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.numberWays(getList(new int[][]{
        {3, 4}, {4, 5}, {5}
    })));
    System.out.println(solution.numberWays(getList(new int[][]{
        {3, 5, 1}, {3, 5}
    })));
    System.out.println(solution.numberWays(getList(new int[][]{
        {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}
    })));
    System.out.println(solution.numberWays(getList(new int[][]{
        {1, 2, 3}, {2, 3, 5, 6}, {1, 3, 7, 9}, {1, 8, 9}, {2, 5, 7}
    })));
    System.out.println(solution.numberWays(getList(new int[][]{
        {2, 12, 18, 20, 24, 26, 30},
        {1, 2, 4, 5, 8, 9, 10, 11, 13, 15, 16, 17, 19, 20, 21, 22, 24, 26, 28, 29},
        {9, 10, 13, 14, 18, 27},
        {1, 2, 3, 7, 9, 15, 16, 18, 28},
        {2, 3, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 26, 27, 30},
        {2, 11, 14, 25},
        {2, 3, 5, 6, 7, 8, 9, 11, 13, 16, 17, 18, 19, 20, 21, 22, 24, 26, 27, 28, 29, 30}
    })));
  }

  private static List<List<Integer>> getList(int[][] array) {
    List<List<Integer>> list = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      List<Integer> tmpList = new ArrayList<>();
      for (int j = 0; j < array[i].length; j++) {
        tmpList.add(array[i][j]);
      }
      list.add(tmpList);
    }
    return list;
  }
}
