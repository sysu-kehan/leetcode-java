package interview0401;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.findWhetherExistsPath(
        3, new int[][]{{0, 1}, {0, 2}, {1, 2}, {1, 2}}, 0, 2));
    System.out.println(solution.findWhetherExistsPath(
        5, new int[][]{{0, 1}, {0, 2}, {0, 4}, {0, 4}, {0, 1}, {1, 3}, {1, 4}, {1, 3}, {2, 3}, {3, 4}},
        0, 4));
    System.out.println(solution.findWhetherExistsPath(
        5, new int[][]{{0, 1}, {0, 4}, {0, 4}, {0, 1}, {1, 3}, {1, 4}, {1, 3}, {2, 3}, {3, 4}},
        0, 2));
  }
}
