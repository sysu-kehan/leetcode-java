package problem63;

class Solution {

  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int xBound = obstacleGrid.length;
    int yBound = obstacleGrid[0].length;
    if (obstacleGrid[xBound - 1][yBound - 1] == 1) {
      return 0;
    }
    int[] cur = new int[yBound];
    cur[yBound - 1] = 1;
    for (int i = xBound - 1; i >= 0; i--) {
      if (obstacleGrid[i][yBound - 1] == 1) {
        cur[yBound - 1] = 0;
      }
      for (int j = yBound - 2; j >= 0; j--) {
        cur[j] = obstacleGrid[i][j] == 0 ? cur[j] + cur[j + 1] : 0;
      }
    }
    return cur[0];
  }
}
