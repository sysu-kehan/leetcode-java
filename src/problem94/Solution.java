package problem94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode node = root;
    while (node != null || !stack.isEmpty()) {
      while (node != null) {
        stack.push(node);
        node = node.left;
      }
      node = stack.pop();
      result.add(node.val);
      node = node.right;
    }
    return result;
  }

  public List<Integer> inorderTraversal1(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root != null) {
      result.addAll(inorderTraversal1(root.left));
      result.add(root.val);
      result.addAll(inorderTraversal1(root.right));
    }
    return result;
  }
}
