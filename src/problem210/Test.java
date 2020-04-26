package problem210;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] result1 = solution.findOrder(2, new int[][]{
        {1, 0}
    });
    System.out.println(Arrays.toString(result1));
    int[] result2 = solution.findOrder(4, new int[][]{
        {1, 0}, {2, 0}, {3, 1}, {3, 2}
    });
    System.out.println(Arrays.toString(result2));
  }
}
