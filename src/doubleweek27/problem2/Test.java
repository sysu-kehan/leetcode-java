package doubleweek27.problem2;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.hasAllCodes("00110110", 2));
    System.out.println(solution.hasAllCodes("00110", 2));
    System.out.println(solution.hasAllCodes("0110", 1));
    System.out.println(solution.hasAllCodes("0110", 2));
    System.out.println(solution.hasAllCodes("0000000001011100", 4));
  }
}
