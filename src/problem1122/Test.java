package problem1122;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] arr11 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
    int[] arr12 = new int[]{2, 1, 4, 3, 9, 6};
    int[] result1 = solution.relativeSortArray(arr11, arr12);

    int[] temp = new int[10];
    Arrays.fill(temp, 0, 0, 100);
    System.out.println();
  }
}
