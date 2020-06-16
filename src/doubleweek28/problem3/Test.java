package doubleweek28.problem3;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.minSumOfLengths(new int[]{3, 2, 2, 4, 3}, 3));
    System.out.println(solution.minSumOfLengths(new int[]{7, 3, 4, 7}, 7));
    System.out.println(solution.minSumOfLengths(new int[]{4, 3, 2, 6, 2, 3, 4}, 6));
    System.out.println(solution.minSumOfLengths(new int[]{5, 5, 4, 4, 5}, 3));
    System.out.println(solution.minSumOfLengths(new int[]{3, 1, 1, 1, 5, 1, 2, 1}, 3));
    int[] test = new int[100000];
    for (int i = 0; i < 100000; i++) {
      test[i] = 1000;
    }
    System.out.println(solution.minSumOfLengths(test, 50000000));
    System.out.println(solution.minSumOfLengths(new int[]{31, 1, 1, 18, 15, 3, 15, 14}, 33));
  }
}
