package problem101;

import bean.TreeNode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

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
  public boolean isSymmetric1(TreeNode root) {
    return root == null ? true : isSymmetric(root.left, root.right);
  }

  public boolean isSymmetric(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode node1 = queue.poll();
      TreeNode node2 = queue.poll();
      if (node1 == null && node2 == null) {
        continue;
      }
      if (node1 == null || node2 == null) {
        return false;
      }
      if (node1.val != node2.val) {
        return false;
      }
      queue.add(node1.left);
      queue.add(node2.right);
      queue.add(node1.right);
      queue.add(node2.left);
    }
    return true;
  }

  private boolean isSymmetric(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    if (left != null && right != null) {
      return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
    return false;
  }
}
