package problem33;

class Solution {
  public int search(int[] nums, int target) {
    return nums.length > 0 ? search(nums, 0, nums.length - 1, target) : -1;
  }

  private int search(int[] nums, int left, int right, int target) {
    if (left + 1 < right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      if (nums[left] <= nums[mid - 1]) {
        if (target >= nums[left] && target <= nums[mid - 1]) {
          return search(nums, left, mid - 1, target);
        } else {
          return search(nums, mid + 1, right, target);
        }
      } else {
        if (target >= nums[mid + 1] && target <= nums[right]) {
          return search(nums, mid + 1, right, target);
        } else {
          return search(nums, left, mid - 1, target);
        }
      }
    }
    return nums[left] == target ? left : nums[right] == target ? right : -1;
  }
}
