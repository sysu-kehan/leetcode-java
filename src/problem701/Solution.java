package problem701;

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
  public TreeNode insertIntoBST(TreeNode root, int val) {
    if (root == null) {
      return new TreeNode(val);
    }
    if (val > root.val) {
      root.right = insertIntoBST(root.right, val);
    } else if (val < root.val) {
      root.left = insertIntoBST(root.left, val);
    }
    return root;
  }
  public TreeNode insertIntoBST1(TreeNode root, int val) {
    TreeNode node = root;
    TreeNode newNode = new TreeNode(val);
    if (node == null) {
      return newNode;
    }
    while (node.val != val) {
      if (val > node.val) {
        if (node.right == null) {
          node.right = newNode;
          break;
        } else {
          node = node.right;
        }
      } else {
        if (node.left == null) {
          node.left = newNode;
          break;
        } else {
          node = node.left;
        }
      }
    }
    return root;
  }
}
