package problem129;

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

  private int count;

  public int sumNumbers(TreeNode root) {
    count = 0;
    if (root != null) {
      search(root, "");
    }
    return count;
  }

  private void search(TreeNode node, String cur) {
    if (node.left == null && node.right == null) {
      count += Integer.parseInt(cur + node.val);
    }
    if (node.left != null) {
      search(node.left, cur + node.val);
    }
    if (node.right != null) {
      search(node.right, cur + node.val);
    }
  }
}
