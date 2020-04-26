package problem33;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int result1 = solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
    System.out.println(result1 == 4);
    int result2 = solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3);
    System.out.println(result2 == -1);
    int result3 = solution.search(new int[]{6, 7, 1, 2, 3, 4, 5}, 6);
    System.out.println(result3 == 0);
  }
}
