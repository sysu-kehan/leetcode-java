package problem700;

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

  public TreeNode searchBST(TreeNode root, int val) {
    while (root != null && root.val != val) {
      root = val > root.val ? root.right : root.left;
    }
    return root;
  }

  public TreeNode searchBST1(TreeNode root, int val) {
    if (root == null) {
      return null;
    }
    if (root.val == val) {
      return root;
    }
    return val > root.val ? searchBST1(root.right, val) : searchBST1(root.left, val);
  }
}
