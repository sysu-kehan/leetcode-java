package interview1611;

class Solution {
  public int[] divingBoard(int shorter, int longer, int k) {
    if (k == 0) {
      return new int[]{};
    }
    if (shorter == longer) {
      return new int[]{shorter * k};
    }
    int[] result = new int[k + 1];
    int base = shorter * k;
    int diff = longer - shorter;
    for (int i = 0; i <= k; i++) {
      result[i] = base + diff * i;
    }
    return result;
  }
}
