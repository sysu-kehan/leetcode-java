package problem145;

import bean.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
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
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> result = new LinkedList<>();
    Stack<TreeNode> stack = new Stack<>();
    if (root != null) {
      stack.push(root);
    }
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      result.add(0, node.val);
      if (node.left != null) {
        stack.push(node.left);
      }
      if (node.right != null) {
        stack.push(node.right);
      }
    }
    return result;
  }

  public List<Integer> postorderTraversal1(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root != null) {
      result.addAll(postorderTraversal1(root.left));
      result.addAll(postorderTraversal1(root.right));
      result.add(root.val);
    }
    return result;
  }
}
