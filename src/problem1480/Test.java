package problem1480;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(
        Arrays.toString(
            solution.runningSum(new int[]{1, 2, 3, 4})
        )
    );
    System.out.println(
        Arrays.toString(
            solution.runningSum(new int[]{1, 1, 1, 1, 1})
        )
    );
    System.out.println(
        Arrays.toString(
            solution.runningSum(new int[]{3, 1, 2, 10, 1})
        )
    );
  }
}
