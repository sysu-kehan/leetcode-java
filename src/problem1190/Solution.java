package problem1190;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
  public String reverseParentheses(String s) {
    Stack<Character> stack = new Stack<>();
    char[] strs = s.toCharArray();
    for (int i = 0; i < strs.length; i++) {
      char c = strs[i];
      if (c == ')') {
        Queue<Character> queue = new LinkedList<>();
        while (stack.peek() != '(') {
          queue.add(stack.pop());
        }
        stack.pop();
        while (!queue.isEmpty()) {
          stack.push(queue.poll());
        }
      } else {
        stack.push(c);
      }
    }
    Stack<Character> temp = new Stack<>();
    while (!stack.isEmpty()) {
      temp.add(stack.pop());
    }
    StringBuilder result = new StringBuilder();
    while (!temp.isEmpty()) {
      result.append(temp.pop());
    }
    return result.toString();
  }
}
