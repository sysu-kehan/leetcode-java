package problem20;

import java.util.Stack;

class Solution {
  public boolean isValid(String s) {
    if (s == null || s.length() <= 0) {
      return true;
    }
    Stack<Character> stack = new Stack<>();
    final char[] left = new char[]{'(', '[', '{'};
    final char[] right = new char[]{')', ']', '}'};
    for (int i = 0; i < s.length(); i++) {
      char tmp = s.charAt(i);
      if (tmp == left[0] || tmp == left[1] || tmp == left[2]) {
        stack.push(tmp);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        char top = stack.pop();
        for (int j = 0; j <= 2; j++) {
          if (tmp == right[j]) {
            if (top == left[j]) {
              break;
            } else {
              return false;
            }
          }
        }
      }
    }
    return stack.isEmpty();
  }
}
