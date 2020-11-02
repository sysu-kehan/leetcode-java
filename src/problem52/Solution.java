package problem52;

import java.util.ArrayList;
import java.util.List;

class Solution {

  private int count;

  public int totalNQueens(int n) {
    count = 0;
    solve(new ArrayList<>(), n);
    return count;
  }

  private void solve(List<String> map, int col) {
    if (map.size() == col) {
      count++;
    } else {
      for (int i = 0; i < col; i++) {
        if (isLegal(map, i)) {
          List<String> copyMap = new ArrayList<>(map);
          StringBuffer newLine = new StringBuffer();
          for (int j = 0; j < col; j++) {
            newLine.append(i == j ? 'Q' : '.');
          }
          copyMap.add(newLine.toString());
          solve(copyMap, col);
        }
      }
    }
  }

  private boolean isLegal(List<String> map, int pos) {
    int height = map.size();
    for (int i = 0; i < map.size(); i++) {
      String line = map.get(i);
      int diff = height - i;
      if (line.charAt(pos) == 'Q') {
        return false;
      }
      if (pos + diff < line.length() && line.charAt(pos + diff) == 'Q') {
        return false;
      }
      if (pos - diff >= 0 && line.charAt(pos - diff) == 'Q') {
        return false;
      }
    }
    return true;
  }
}
