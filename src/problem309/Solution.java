package problem309;

class Solution {
  public int maxProfit(int[] prices) {
    if (prices.length <= 0) {
      return 0;
    }
    int profit0 = -prices[0], profit1 = 0, profit2 = 0;
    for (int i = 1; i < prices.length; i++) {
      int profit0temp = Math.max(profit0, profit2 - prices[i]);
      int profit1temp = profit0 + prices[i];
      int profit2temp = Math.max(profit1, profit2);
      profit0 = profit0temp;
      profit1 = profit1temp;
      profit2 = profit2temp;
    }
    return Math.max(profit1, profit2);
  }
}
