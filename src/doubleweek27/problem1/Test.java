package doubleweek27.problem1;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.canBeEqual(new int[]{7}, new int[]{7}));
    System.out.println(solution.canBeEqual(new int[]{1, 12}, new int[]{12, 1}));
    System.out.println(solution.canBeEqual(new int[]{3, 7, 9}, new int[]{3, 7, 11}));
    System.out.println(solution.canBeEqual(new int[]{1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1}));
  }
}
