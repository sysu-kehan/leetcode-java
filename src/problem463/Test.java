package problem463;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(
        solution.islandPerimeter(new int[][]{
            {0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}
        })
    );
  }
}
