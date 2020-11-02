package problem1365;

import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(
        Arrays.toString(solution.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}))
    );
  }
}
