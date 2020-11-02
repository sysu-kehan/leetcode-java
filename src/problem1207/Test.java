package problem1207;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    System.out.println(solution.uniqueOccurrences(new int[]{1, 2}));
    System.out.println(solution.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
  }
}
