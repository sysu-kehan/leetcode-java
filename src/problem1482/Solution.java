package problem1482;

class Solution {
  public int minDays(int[] bloomDay, int m, int k) {
    if (m * k > bloomDay.length) {
      return -1;
    }
    int ans = -1;
    for (int left = 0, right = (int)1e9; left <= right;) {
      int mid = (left + right) >> 1;
      if (check(bloomDay, mid, m, k)) {
        ans = mid;
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return ans;
  }

  private boolean check(int[] bloomDay, int mid, int m, int k) {
    int count = 0;
    int cur = 0;
    for (int i = 0; i < bloomDay.length; i++) {
      if (bloomDay[i] <= mid) {
        cur++;
      } else {
        cur = 0;
      }
      if (cur == k) {
        count++;
        cur = 0;
      }
      if (count >= m) {
        return true;
      }
    }
    return false;
  }
}
