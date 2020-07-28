package problem154;

class Solution {
  public int findMin(int[] nums) {
    int temp = nums[0];
    for (int i = 0; i + 1 < nums.length; i++) {
      if (nums[i] > nums[i + 1]) {
        return nums[i + 1];
      }
    }
    return temp;
  }
}
