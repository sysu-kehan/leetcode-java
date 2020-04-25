package problem976;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.largestPerimeter(new int[]{2, 1, 2}) == 5);
    System.out.println(solution.largestPerimeter(new int[]{1, 2, 1}) == 0);
    System.out.println(solution.largestPerimeter(new int[]{3, 2, 3, 4}) == 10);
    System.out.println(solution.largestPerimeter(new int[]{3, 6, 2, 3}) == 8);
  }
}
