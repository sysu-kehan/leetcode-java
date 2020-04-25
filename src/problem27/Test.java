package problem27;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums1 = new int[]{2, 2, 3};
    int val1 = 2;
    int length1 = solution.removeElement(nums1, val1);
    System.out.println(Arrays.toString(Arrays.copyOf(nums1, length1)));
    int[] nums2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
    int val2 = 2;
    int length2 = solution.removeElement(nums2, val2);
    System.out.println(Arrays.toString(Arrays.copyOf(nums2, length2)));
  }
}
