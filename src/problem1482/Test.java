package problem1482;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.minDays(new int[]{1, 10, 3, 10, 2}, 3, 1));
    System.out.println(solution.minDays(new int[]{1, 10, 3, 10, 2}, 3, 2));
    System.out.println(solution.minDays(new int[]{7, 7, 7, 7, 12, 7, 7}, 2, 3));
    System.out.println(solution.minDays(new int[]{1000000000, 1000000000}, 1, 1));
    System.out.println(solution.minDays(new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5, 6}, 4, 2));
    System.out.println(solution.minDays(new int[]{5, 37, 55, 92, 22, 52, 31, 62, 99, 64, 92, 53, 34, 84, 93, 50, 28}, 8, 2));
  }
}
