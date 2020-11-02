package problem513;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
  public int findBottomLeftValue(TreeNode root) {
    List<TreeNode> list = new ArrayList<>();
    list.add(root);
    while (hasNextNode(list)) {
      List<TreeNode> tempList = new ArrayList<>();
      for (TreeNode node : list) {
        if (node.left != null) {
          tempList.add(node.left);
        }
        if (node.right != null) {
          tempList.add(node.right);
        }
      }
      list = tempList;
    }
    return list.get(0).val;
  }

  private boolean hasNextNode(List<TreeNode> list) {
    for (TreeNode node : list) {
      if (node.left != null || node.right != null) {
        return true;
      }
    }
    return false;
  }

}
