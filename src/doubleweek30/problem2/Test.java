package doubleweek30.problem2;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.rangeSum(new int[]{1, 2, 3, 4}, 4, 1, 5));
    System.out.println(solution.rangeSum(new int[]{1, 2, 3, 4}, 4, 3, 4));
    System.out.println(solution.rangeSum(new int[]{1, 2, 3, 4}, 4, 1, 10));
  }
}
