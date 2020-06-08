package problem1190;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.reverseParentheses("(abcd)"));
    System.out.println(solution.reverseParentheses("(u(love)i)"));
    System.out.println(solution.reverseParentheses("(ed(et(oc))el)"));
    System.out.println(solution.reverseParentheses("a(bcdefghijkl(mno)p)q"));
  }
}
