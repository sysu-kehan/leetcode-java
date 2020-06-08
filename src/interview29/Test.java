package interview29;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(Arrays.toString(solution.spiralOrder(new int[][]{
        {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
    })));
    System.out.println(Arrays.toString(solution.spiralOrder(new int[][]{
        {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}
    })));
  }
}
