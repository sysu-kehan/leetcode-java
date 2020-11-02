package problem344;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    char[] test1 = new char[]{'h', 'e', 'l', 'l', 'o'};
    solution.reverseString(test1);
    System.out.println(Arrays.toString(test1));
  }
}
