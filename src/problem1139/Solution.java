package problem1139;

class Solution {
  public int largest1BorderedSquare(int[][] grid) {
    int height = grid.length;
    int width = grid[0].length;
    int maxLength = 0;
    int beginX = 0, beginY = 0;
    outer:
    for (; beginX < height; beginX++) {
      for (beginY = 0; beginY < width; beginY++) {
        if (grid[beginX][beginY] == 1) {
          maxLength = 1;
          break outer;
        }
      }
    }
    for (int i = beginX; i < height; i++) {
      for (int j = beginY; j < width; j++) {
        if (grid[i][j] == 1 && i + maxLength < height && j + maxLength < width) {
          for (int length = maxLength; i + length < height && j + length < width; length++) {
            int result = check(i, j, i + length, j + length, grid);
            if (result == 0) {
              maxLength = length + 1;
            } else if (result == 2) {
              break;
            }
          }
        }
      }
    }
    return maxLength * maxLength;
  }

  private int check(int beginX, int beginY, int endX, int endY, int[][] grid) {
    for (int i = beginX; i <= endX; i++) {
      if (grid[i][beginY] != 1) {
        return 2;
      }
    }
    for (int i = beginX; i <= endX; i++) {
      if (grid[i][endY] != 1) {
        return 1;
      }
    }
    for (int i = beginY; i <= endY; i++) {
      if (grid[beginX][i] != 1) {
        return 2;
      }
    }
    for (int i = beginY; i <= endY; i++) {
      if (grid[endX][i] != 1) {
        return 1;
      }
    }
    return 0;
  }
}
