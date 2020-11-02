package problem814;

import bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public TreeNode pruneTree(TreeNode root) {
    if (!isMatch(root)) {
      return null;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode parent = queue.poll();
      if (isMatch(parent.left)) {
        queue.add(parent.left);
      } else {
        parent.left = null;
      }
      if (isMatch(parent.right)) {
        queue.add(parent.right);
      } else {
        parent.right = null;
      }
    }
    return root;
  }

  private boolean isMatch(TreeNode node) {
    if (node == null) {
      return false;
    }
    return node.val == 1 || isMatch(node.left) || isMatch(node.right);
  }
}
