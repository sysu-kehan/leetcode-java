package problem1408;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(
        Arrays.toString(solution.stringMatching(
            new String[]{"mass", "as", "hero", "superhero"}).toArray()
        )
    );
    System.out.println(
        Arrays.toString(solution.stringMatching(
            new String[]{"leetcode", "et", "code"}).toArray()
        )
    );
    System.out.println(
        Arrays.toString(solution.stringMatching(
            new String[]{"blue", "green", "bu"}).toArray()
        )
    );
  }
}
