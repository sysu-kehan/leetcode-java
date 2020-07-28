package doubleweek31.problem4;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.minNumberOperations(new int[]{1, 2, 3, 2, 1}));
    System.out.println(solution.minNumberOperations(new int[]{3, 1, 1, 2}));
    System.out.println(solution.minNumberOperations(new int[]{3, 1, 5, 4, 2}));
    System.out.println(solution.minNumberOperations(new int[]{1, 1, 1, 1}));
  }
}
