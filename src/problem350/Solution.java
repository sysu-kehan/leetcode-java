package problem350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
    int[] nums1copy = Arrays.copyOf(nums1, nums1.length);
    int[] nums2copy = Arrays.copyOf(nums2, nums2.length);
    Arrays.sort(nums1copy);
    Arrays.sort(nums2copy);
    List<Integer> list = new ArrayList<>();
    for (int i = 0, j = 0; i < nums1copy.length; i++) {
      int cur = nums1copy[i];
      while (j < nums2copy.length && nums2copy[j] < cur) j++;
      if (j >= nums2copy.length) {
        break;
      }
      if (nums2copy[j] == cur) {
        list.add(cur);
        j++;
      }
    }
    int[] result = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }
    return result;
  }
}
