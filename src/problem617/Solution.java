package problem617;

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
  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    if (t1 != null && t2 != null) {
      TreeNode newNode = new TreeNode(t1.val + t2.val);
      newNode.left = mergeTrees(t1.left, t2.left);
      newNode.right = mergeTrees(t1.right, t2.right);
      return newNode;
    }
    return t1 != null ? t1 : t2;
  }
}
