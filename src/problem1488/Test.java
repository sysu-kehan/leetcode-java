package problem1488;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(
        Arrays.toString(solution.avoidFlood(new int[]{1, 2, 3, 4}))
    );
    System.out.println(
        Arrays.toString(solution.avoidFlood(new int[]{1, 2, 0, 0, 2, 1}))
    );
    System.out.println(
        Arrays.toString(solution.avoidFlood(new int[]{1, 2, 0, 1, 2}))
    );
    System.out.println(
        Arrays.toString(solution.avoidFlood(new int[]{69, 0, 0, 0, 69}))
    );
    System.out.println(
        Arrays.toString(solution.avoidFlood(new int[]{10, 20, 20}))
    );
  }
}
