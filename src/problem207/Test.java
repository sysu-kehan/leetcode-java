package problem207;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.canFinish(2, new int[][]{
        {1, 0}
    }));
    System.out.println(!solution.canFinish(2, new int[][]{
        {1, 0}, {0, 1}
    }));
  }
}
