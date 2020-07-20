package problem35;

class Solution {
  public int searchInsert(int[] nums, int target) {
    int beginIndex = 0;
    int endIndex = nums.length - 1;
    while (beginIndex <= endIndex) {
      int mid = beginIndex + endIndex >> 1;
      int middle = nums[mid];
      if (target == middle) {
        return mid;
      }
      if (target > middle) {
        beginIndex = mid + 1;
      } else {
        endIndex = mid - 1;
      }
    }
    return beginIndex;
  }
}
