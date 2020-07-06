package problem378;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.kthSmallest(new int[][]{
        {1, 5, 9}, {10, 11, 13}, {12, 13, 15}
    }, 8));
  }
}
