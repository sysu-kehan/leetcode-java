package problem53;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    System.out.println(solution.maxSubArray(new int[]{1, 2, -1, -2, 2, 1, -2, 1}));
  }
}
