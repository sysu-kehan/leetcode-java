package problem1417;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public String reformat(String s) {
    Queue<Character> numberList = new LinkedList<>();
    Queue<Character> alphaList = new LinkedList<>();
    for (int i = 0; i < s.length(); i++) {
      char tmp = s.charAt(i);
      if (tmp >= '0' && tmp <= '9') {
        numberList.add(tmp);
      } else {
        alphaList.add(tmp);
      }
    }
    StringBuilder result = new StringBuilder();
    if (Math.abs(numberList.size() - alphaList.size()) <= 1) {
      while (!numberList.isEmpty() && !alphaList.isEmpty()) {
        result.append(numberList.poll());
        result.append(alphaList.poll());
      }
      while (!numberList.isEmpty()) {
        return result.toString() + numberList.poll();
      }
      while (!alphaList.isEmpty()) {
        return alphaList.poll() + result.toString();
      }
    }
    return result.toString();
  }
}
