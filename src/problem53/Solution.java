package problem53;

class Solution {

  public int maxSubArray(int[] nums) {
    return getResult(nums, 0, nums.length - 1).mSum;
  }

  private Status getResult(int[] nums, int begin, int end) {
    if (begin == end) {
      int a = nums[begin];
      return new Status(a, a, a, a);
    }
    int middle = (begin + end) >> 1;
    Status left = getResult(nums, begin, middle);
    Status right = getResult(nums, middle + 1, end);
    return new Status(
        Math.max(left.lSum, left.iSum + right.lSum),
        Math.max(right.rSum, left.rSum + right.iSum),
        Math.max(Math.max(left.mSum, right.mSum), left.rSum + right.lSum),
        left.iSum + right.iSum
    );
  }

  private class Status {
    int lSum;
    int rSum;
    int mSum;
    int iSum;

    public Status(int lSum, int rSum, int mSum, int iSum) {
      this.lSum = lSum;
      this.rSum = rSum;
      this.mSum = mSum;
      this.iSum = iSum;
    }
  }
}

//  public int maxSubArray(int[] nums) {
//    int pre = nums[0];
//    int max = nums[0];
//    for (int i = 1; i < nums.length; i++) {
//      pre = Math.max(pre + nums[i], nums[i]);
//      max = Math.max(max, pre);
//    }
//    return max;
//  }