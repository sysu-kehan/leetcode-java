package problem1387;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.getKth(12, 15, 2));
    System.out.println(solution.getKth(1, 1, 1));
    System.out.println(solution.getKth(7, 11, 4));
    System.out.println(solution.getKth(10, 20, 5));
    System.out.println(solution.getKth(1, 1000, 777));
  }
}
