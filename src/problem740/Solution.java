package problem740;

class Solution {
  public int deleteAndEarn(int[] nums) {
    int[] count = new int[10001];
    for (int num : nums) {
      count[num]++;
    }
    int avoid = 0, using = 0;
    for (int i = 0, pre = -1; i < count.length; i++) {
      if (count[i] > 0) {
        int max = Math.max(avoid, using);
        if (i - 1 == pre) {
          using = avoid + i * count[i];
          avoid = max;
        } else {
          using = max + i * count[i];
          avoid = max;
        }
        pre = i;
      }
    }
    return Math.max(avoid, using);
  }
}
