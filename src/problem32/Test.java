package problem32;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.longestValidParentheses("(()"));
    System.out.println(solution.longestValidParentheses(")()())"));
    System.out.println(solution.longestValidParentheses("("));
  }
}
