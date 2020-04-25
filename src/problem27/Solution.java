package problem27;

class Solution {
  public int removeElement(int[] nums, int val) {
    if (nums == null || nums.length <= 0) {
      return -1;
    }
    int i = 0, j = nums.length - 1;
    while (i <= j) {
      if (nums[i] == val) {
        nums[i] = nums[j];
        j--;
      } else {
        i++;
      }
    }
    return i;
  }
}
