package problem287;

class Solution {
  public int findDuplicate(int[] nums) {
    int slowIndex = 0;
    int fastIndex = 0;
    do {
      slowIndex = nums[slowIndex];
      fastIndex = nums[nums[fastIndex]];
    } while (slowIndex != fastIndex);
    int meetIndex = 0;
    while (meetIndex != slowIndex) {
      meetIndex = nums[meetIndex];
      slowIndex = nums[slowIndex];
    }
    return meetIndex;
  }
}
