package problem110;

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
  public boolean isBalanced(TreeNode root) {
    return getDeep(root) != -1;
  }

  private int getDeep(TreeNode node) {
    if (node == null) {
      return 0;
    }
    int leftDeep = getDeep(node.left);
    if (leftDeep == -1) {
      return -1;
    }
    int rightDeep = getDeep(node.right);
    if (rightDeep == -1) {
      return -1;
    }
    return Math.abs(rightDeep - leftDeep) > 1 ? -1 : Math.max(rightDeep, leftDeep) + 1;
  }
}
