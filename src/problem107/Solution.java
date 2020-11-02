package problem107;

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
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> resultList = new ArrayList<>();
    List<TreeNode> list = new ArrayList<>();
    list.add(root);
    while (!isAllNull(list)) {
      List<Integer> integerList = new ArrayList<>();
      List<TreeNode> nextList = new ArrayList<>();
      for (TreeNode node : list) {
        if (node != null) {
          nextList.add(node.left);
          nextList.add(node.right);
          integerList.add(node.val);
        }
      }
      resultList.add(0, integerList);
      list = nextList;
    }
    return resultList;
  }

  private boolean isAllNull(List<TreeNode> list) {
    for (TreeNode node : list) {
      if (node != null) {
        return false;
      }
    }
    return true;
  }
}

