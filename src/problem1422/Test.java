package problem1422;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.maxScore("011101") == 5);
    System.out.println(solution.maxScore("00111") == 5);
    System.out.println(solution.maxScore("1111") == 3);
  }
}
