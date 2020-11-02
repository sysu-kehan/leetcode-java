package problem15;

import java.util.List;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    List<List<Integer>> list1 = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    List<List<Integer>> list2 = solution.threeSum(new int[]{0, 0, 0, 0});
    System.out.println();
  }
}
