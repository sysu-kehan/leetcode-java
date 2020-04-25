package problem114;

import bean.TreeNode;

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
  public void flatten(TreeNode root) {
    while (root != null) {
      TreeNode left = root.left;
      if (left != null) {
        final TreeNode right = root.right;
        root.right = left;
        root.left = null;
        while (left.right != null) {
          left = left.right;
        }
        left.right = right;
      }
      root = root.right;
    }
  }
}
