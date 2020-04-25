package problem75;

class Solution {
  public void sortColors(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    int curPos = 0;
    while (curPos <= right) {
      if (nums[curPos] == 0 && left != curPos) {
        swap(nums, left, curPos);
        left++;
      } else if (nums[curPos] == 2) {
        swap(nums, right, curPos);
        right--;
      } else {
        curPos++;
      }
    }
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
