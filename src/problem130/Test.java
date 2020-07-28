package problem130;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
//    char[][] board1 = new char[][]{
//        {'X', 'X', 'X', 'X'},
//        {'X', 'O', 'O', 'X'},
//        {'X', 'X', 'O', 'X'},
//        {'X', 'O', 'X', 'X'}
//    };
//    solution.solve(board1);
//    print(board1);
//    char[][] board2 = new char[][]{};
//    solution.solve(board2);
//    print(board2);
    char[][] board3 = new char[][]{
        {'O', 'X', 'X', 'O', 'X'},
        {'X', 'O', 'O', 'X', 'O'},
        {'X', 'O', 'X', 'O', 'X'},
        {'O', 'X', 'O', 'O', 'O'},
        {'X', 'X', 'O', 'X', 'O'}
    };
    solution.solve(board3);
    print(board3);
  }

  private static void print(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      System.out.println(Arrays.toString(board[i]));
    }
  }
}
