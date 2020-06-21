package problem125;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
    System.out.println(solution.isPalindrome("race a car"));
    System.out.println(solution.isPalindrome(""));
    System.out.println(solution.isPalindrome("a"));
    System.out.println(solution.isPalindrome("aa"));
    System.out.println(solution.isPalindrome("ab"));
    System.out.println(solution.isPalindrome("`l;`` 1o1 ??;l`"));
  }
}
