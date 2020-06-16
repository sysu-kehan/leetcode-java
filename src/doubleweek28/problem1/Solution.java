package doubleweek28.problem1;

class Solution {
  public int[] finalPrices(int[] prices) {
    int[] result = new int[prices.length];
    for (int i = 0; i < prices.length; i++) {
      int cur = prices[i];
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[j] <= cur) {
          cur -= prices[j];
          break;
        }
      }
      result[i] = cur;
    }
    return result;
  }
}
