package problem1405;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public String longestDiverseString(int a, int b, int c) {
    List<Character> list = new ArrayList<>();
    while (a > 0 || b > 0 || c > 0) {
      if (a > 0) {
        list.add('a');
        a--;
      }
      if (b > 0) {
        list.add('b');
        b--;
      }
      if (c > 0) {
        list.add('c');
        c--;
      }
    }
    char x = list.get(list.size() - 1);
    int count = 1;
    for (int i = list.size() - 2; i >= 0 && list.get(i) == x; i--, count++);
    if (count >= 3) {
      List<Character> tmpList = list.subList(list.size() - (count - 2), list.size());
      list = list.subList(0, list.size() - (count - 2));
      List<Character> resultList = new ArrayList<>();
      int i = 0, pos = 0;
      while (i < list.size() - 2 && pos < tmpList.size()) {
        if (list.get(i) != tmpList.get(pos)) {
          resultList.add(tmpList.get(pos++));
          if (pos < tmpList.size()) {
            resultList.add(tmpList.get(pos++));
          }
        } else {
          resultList.add(list.get(i++));
          resultList.add(tmpList.get(pos++));
        }
        resultList.add(list.get(i++));
      }
      for (; i < list.size(); i++) {
        resultList.add(list.get(i));
      }
      list = resultList;
    }
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < list.size(); i++) {
      builder.append(list.get(i));
    }
    return builder.toString();
  }
}
