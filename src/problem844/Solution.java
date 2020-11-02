package problem844;

import java.util.Stack;

class Solution {
  public boolean backspaceCompare(String S, String T) {
    Stack<Character> stackS = new Stack<>();
    Stack<Character> stackT = new Stack<>();
    for (int i = 0; i < S.length(); i++) {
      char s = S.charAt(i);
      if (s == '#' && !stackS.isEmpty()) {
        stackS.pop();
      }
      if (s != '#') {
        stackS.push(s);
      }
    }
    for (int i = 0; i < T.length(); i++) {
      char t = T.charAt(i);
      if (t == '#' && !stackT.isEmpty()) {
        stackT.pop();
      }
      if (t != '#') {
        stackT.push(t);
      }
    }
    while (!stackS.isEmpty() && !stackT.isEmpty()) {
      char s = stackS.pop();
      char t = stackT.pop();
      if (s != t) {
        return false;
      }
    }
    return stackS.isEmpty() && stackT.isEmpty();
  }
}
