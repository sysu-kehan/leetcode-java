package problem75;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums1 = new int[]{2, 0, 2, 1, 1, 0};
    solution.sortColors(nums1);
    System.out.println(Arrays.toString(nums1));
  }
}
