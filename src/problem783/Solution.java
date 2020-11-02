package problem783;

import bean.TreeNode;

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
  public int minDiffInBST(TreeNode root) {
    int left = root.left == null ? Integer.MAX_VALUE : root.val - getMax(root.left);
    int right = root.right == null ? Integer.MAX_VALUE : getMin(root.right) - root.val;
    int leftMin = root.left == null ? Integer.MAX_VALUE : minDiffInBST(root.left);
    int rightMin = root.right == null ? Integer.MAX_VALUE : minDiffInBST(root.right);
    return Math.min(Math.min(left, right), Math.min(leftMin, rightMin));
  }

  private int getMax(TreeNode root) {
    TreeNode node = root;
    while (node.right != null) {
      node = node.right;
    }
    return node.val;
  }

  private int getMin(TreeNode root) {
    TreeNode node = root;
    while (node.left != null) {
      node = node.left;
    }
    return node.val;
  }
}
