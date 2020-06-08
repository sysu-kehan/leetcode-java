package problem523;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
    System.out.println(solution.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
    System.out.println(solution.checkSubarraySum(new int[]{0, 1, 0}, 0));
  }
}
