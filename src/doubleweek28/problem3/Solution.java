package doubleweek28.problem3;

class Solution {
  public int minSumOfLengths(int[] arr, int target) {
    int[][] res = new int[arr.length + 1][3];
    for (int i = 0; i < res.length; i++) {
      res[i][0] = arr.length - 1;
      res[i][1] = arr.length + 1;
      res[i][2] = arr.length + 1;
    }
    for (int begin = 0, end = 0, cur = 0; end < arr.length; end++) {
      cur += arr[end];
      while (cur > target && begin != end) {
        cur -= arr[begin];
        begin++;
      }
      if (cur == target) {
        res[begin][0] = end;
        res[begin][1] = end - begin + 1;
        res[begin][2] = end - begin + 1;
      }
    }
    for (int i = res.length - 2; i >= 0; i--) {
      res[i][1] = Math.min(res[i + 1][1], res[i][1]);
    }
    int min = arr.length + 1;
    for (int i = 0; i < res.length; i++) {
      min = Math.min(res[i][2] + res[res[i][0] + 1][1], min);
    }
    return min == arr.length + 1 ? -1 : min;
  }
}
