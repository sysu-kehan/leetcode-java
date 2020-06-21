package problem1028;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public TreeNode recoverFromPreorder(String S) {
    List<Node> list = new ArrayList<>();
    int level = 0;
    StringBuilder number = new StringBuilder();
    boolean needClear = false;
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      if (c == '-') {
        if (needClear) {
          list.add(new Node(Integer.parseInt(number.toString()), level));
          number = new StringBuilder();
          level = 0;
          needClear = false;
        }
        level++;
      } else {
        needClear = true;
        number.append(c);
      }
    }
    list.add(new Node(Integer.parseInt(number.toString()), level));
    Stack<Node> stack = new Stack<>();
    Node first = list.get(0);
    TreeNode head = first.node;
    stack.push(first);
    for (int i = 1; i < list.size(); i++) {
      Node cur = list.get(i);
      while (!stack.isEmpty() && stack.peek().level >= cur.level) {
        stack.pop();
      }
      TreeNode node = stack.peek().node;
      if (node.left == null) {
        node.left = cur.node;
      } else {
        node.right = cur.node;
      }
      stack.push(cur);
    }
    return head;
  }

  private class Node {

    int level;
    TreeNode node;

    public Node(int value, int level) {
      this.level = level;
      this.node = new TreeNode(value);
    }
  }
}
