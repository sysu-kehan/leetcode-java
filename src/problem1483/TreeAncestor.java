package problem1483;

class TreeAncestor {

  private int[][] dp;

  public TreeAncestor(int n, int[] parent) {
    int length = (int) (Math.log(n) / Math.log(2)) + 1;
    dp = new int[n][length];
    for (int i = 0; i < n; i++) {
      dp[i][0] = parent[i];
    }
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < length; j++) {
        if (dp[i][j - 1] != -1) {
          dp[i][j] = dp[dp[i][j - 1]][j - 1];
        } else {
          dp[i][j] = -1;
        }
      }
    }
  }

  public int getKthAncestor(int node, int k) {
    if (k == 0 || node == -1) {
      return node;
    }
    int p = (int) (Math.log(k) / Math.log(2));
    return getKthAncestor(dp[node][p], k - (1 << p));
  }
}

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */
