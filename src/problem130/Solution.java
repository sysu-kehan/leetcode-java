package problem130;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

  private int height;
  private int width;
  private boolean[][] map;
  private char[][] board;

  public void solve(char[][] board) {
    if (board.length <= 0) {
      return;
    }
    height = board.length;
    width = board[0].length;
    map = new boolean[height][width];
    this.board = board;
    for (int i = 0; i < width; i++) {
      if (isValid(0, i)) {
        search(0, i);
      }
    }
    for (int i = 0; i < width; i++) {
      if (isValid(height - 1, i)) {
        search(height - 1, i);
      }
    }
    for (int i = 0; i < height; i++) {
      if (isValid(i, 0)) {
        search(i, 0);
      }
    }
    for (int i = 0; i < height; i++) {
      if (isValid(i, width - 1)) {
        search(i, width - 1);
      }
    }
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        board[i][j] = map[i][j] ? 'O' : 'X';
      }
    }
  }

  private void search(int x, int y) {
    Queue<Position> queue = new LinkedList<>();
    queue.add(new Position(x, y));
    map[x][y] = true;
    while (!queue.isEmpty()) {
      Position cur = queue.poll();
      if (isValid(cur.x + 1, cur.y)) {
        queue.add(new Position(cur.x + 1, cur.y));
        map[cur.x + 1][cur.y] = true;
      }
      if (isValid(cur.x, cur.y + 1)) {
        queue.add(new Position(cur.x, cur.y + 1));
        map[cur.x][cur.y + 1] = true;
      }
      if (isValid(cur.x - 1, cur.y)) {
        queue.add(new Position(cur.x - 1, cur.y));
        map[cur.x - 1][cur.y] = true;
      }
      if (isValid(cur.x, cur.y - 1)) {
        queue.add(new Position(cur.x, cur.y - 1));
        map[cur.x][cur.y - 1] = true;
      }
    }
  }

  private boolean isValid(int x, int y) {
    return x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == 'O' && !map[x][y];
  }

  private class Position {
    int x;
    int y;

    public Position(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}
