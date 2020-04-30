package problem1424;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(Arrays.toString(solution.findDiagonalOrder(generateData(new int[][]{
        {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
    }))));
    System.out.println(Arrays.toString(solution.findDiagonalOrder(generateData(new int[][]{
        {1, 2, 3, 4, 5}, {6, 7}, {8}, {9, 10, 11}, {12, 13, 14, 15, 16}
    }))));
    System.out.println(Arrays.toString(solution.findDiagonalOrder(generateData(new int[][]{
        {1, 2, 3}, {4}, {5, 6, 7}, {8}, {9, 10, 11}
    }))));
    System.out.println(Arrays.toString(solution.findDiagonalOrder(generateData(new int[][]{
        {1, 2, 3, 4, 5, 6}
    }))));
  }

  private static List<List<Integer>> generateData(int[][] nums) {
    List<List<Integer>> list = new ArrayList<>();
    for (int[] array : nums) {
      List<Integer> tmpList = new ArrayList<>();
      for (int i = 0; i < array.length; i++) {
        tmpList.add(array[i]);
      }
      list.add(tmpList);
    }
    return list;
  }
}
