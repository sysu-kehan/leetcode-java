package problem802;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.eventualSafeNodes(new int[][]{
        {1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}
    }));
  }
}
