package problem144;

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

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new LinkedList<>();
    Stack<TreeNode> stack = new Stack<>();
    if (root != null) {
      stack.push(root);
    }
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      result.add(node.val);
      if (node.right != null) {
        stack.push(node.right);
      }
      if (node.left != null) {
        stack.push(node.left);
      }
    }
    return result;
  }

  public List<Integer> preorderTraversal2(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode node = root;
    while (node != null || !stack.isEmpty()) {
      while (node != null) {
        result.add(node.val);
        stack.add(node.right);
        node = node.left;
      }
      node = stack.pop();
    }
    return result;
  }

  public List<Integer> preorderTraversal1(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root != null) {
      result.add(root.val);
      result.addAll(preorderTraversal1(root.left));
      result.addAll(preorderTraversal1(root.right));
    }
    return result;
  }
}
