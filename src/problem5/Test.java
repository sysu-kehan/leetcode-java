package problem5;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.longestPalindrome("babad"));
    System.out.println(solution.longestPalindrome("cbbd"));
    System.out.println(solution.longestPalindrome(""));
    System.out.println(solution.longestPalindrome("a"));
  }
}
