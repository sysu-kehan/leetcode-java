package doubleweek38.problem1;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(Arrays.toString(solution.frequencySort(new int[]{1, 1, 2, 2, 2, 3})));
    System.out.println(Arrays.toString(solution.frequencySort(new int[]{2, 3, 1, 3, 2})));
    System.out.println(Arrays.toString(solution.frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1})));
  }
}
