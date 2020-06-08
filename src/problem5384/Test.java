package problem5384;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(
        Arrays.toString(
            solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3).toArray()
        )
    );
    System.out.println(
        Arrays.toString(
            solution.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1).toArray()
        )
    );
    System.out.println(
        Arrays.toString(
            solution.kidsWithCandies(new int[]{12, 1, 12}, 10).toArray()
        )
    );
  }
}
