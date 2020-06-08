package problem740;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.deleteAndEarn(new int[]{3}));
    System.out.println(solution.deleteAndEarn(new int[]{3, 4}));
    System.out.println(solution.deleteAndEarn(new int[]{3, 4, 2}));
    System.out.println(solution.deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    int[] test1 = new int[]{6, 5, 10, 2, 8, 6, 6, 5, 2, 9, 9, 4, 6, 3, 3, 7, 7, 8, 9, 5};
    System.out.println(solution.deleteAndEarn(test1));
  }
}
