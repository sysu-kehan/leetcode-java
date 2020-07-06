package problem236;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    List<TreeNode> pList = listParent(root, p);
    List<TreeNode> qList = listParent(root, q);
    for (TreeNode node : pList) {
      if (qList.contains(node)) {
        return node;
      }
    }
    return null;
  }

  private List<TreeNode> listParent(TreeNode parent, TreeNode node) {
    if (parent.val == node.val) {
      List<TreeNode> result = new ArrayList<>();
      result.add(parent);
      return result;
    }
    if (parent.left != null) {
      List<TreeNode> left = listParent(parent.left, node);
      if (left != null) {
        left.add(parent);
        return left;
      }
    }
    if (parent.right != null) {
      List<TreeNode> right = listParent(parent.right, node);
      if (right != null) {
        right.add(parent);
        return right;
      }
    }
    return null;
  }
}
