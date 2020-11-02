package problem257;

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

  private List<String> resultList = new ArrayList<>();

  public List<String> binaryTreePaths(TreeNode root) {
    if (root == null) {
      return resultList;
    }
    search(root.val + "", root);
    return resultList;
  }

  private void search(String path, TreeNode node) {
    if (node.left == null && node.right == null) {
      resultList.add(path);
    }
    if (node.left != null) {
      search(path + "->" + node.left.val, node.left);
    }
    if (node.right != null) {
      search(path + "->" + node.right.val, node.right);
    }
  }
}
