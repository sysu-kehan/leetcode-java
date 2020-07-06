package doubleweek29.problem3;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.longestSubarray(new int[]{1, 1, 0, 1}));
    System.out.println(solution.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
    System.out.println(solution.longestSubarray(new int[]{1, 1, 1}));
    System.out.println(solution.longestSubarray(new int[]{1, 1, 0, 0, 1, 1, 1, 0, 1}));
    System.out.println(solution.longestSubarray(new int[]{0, 0, 0}));
  }
}
