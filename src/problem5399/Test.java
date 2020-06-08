package problem5399;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.largestNumber(new int[]{4, 3, 2, 5, 6, 7, 2, 5, 5}, 9));
    System.out.println(solution.largestNumber(new int[]{7, 6, 5, 5, 5, 6, 8, 7, 8}, 12));
    System.out.println(solution.largestNumber(new int[]{2, 4, 6, 2, 4, 6, 4, 4, 4}, 5));
    System.out.println(solution.largestNumber(new int[]{6, 10, 15, 40, 40, 40, 40, 40, 40}, 47));
  }
}
