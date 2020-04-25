package problem9;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.isPalindrome(121));
    System.out.println(solution.isPalindrome(-121) == false);
    System.out.println(solution.isPalindrome(10) == false);
    System.out.println(solution.isPalindrome(0));
  }
}
