package problem1137;

class Solution {
  public int tribonacci(int n) {
    int[] array = new int[]{0, 1, 1};
    for (int i = 3; i <= n; array[i % 3] = array[0] + array[1] + array[2], i++);
    return array[n % 3];
  }
}
