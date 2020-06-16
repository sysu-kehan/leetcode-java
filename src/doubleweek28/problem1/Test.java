package doubleweek28.problem1;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(Arrays.toString(solution.finalPrices(new int[]{8, 4, 6, 2, 3})));
    System.out.println(Arrays.toString(solution.finalPrices(new int[]{1, 2, 3, 4, 5})));
    System.out.println(Arrays.toString(solution.finalPrices(new int[]{10, 1, 1, 6})));
  }
}
