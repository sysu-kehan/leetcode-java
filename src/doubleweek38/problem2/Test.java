package doubleweek38.problem2;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.maxWidthOfVerticalArea(new int[][]{
        {8, 7}, {9, 9}, {7, 4}, {9, 7}
    }));
    System.out.println(solution.maxWidthOfVerticalArea(new int[][]{
        {3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}
    }));
  }
}
