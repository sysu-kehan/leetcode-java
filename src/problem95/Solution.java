package problem95;

import bean.TreeNode;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
  public List<TreeNode> generateTrees(int n) {
    return n == 0 ? new ArrayList<>() : generateTrees(1, n);
  }

  private List<TreeNode> generateTrees(int begin, int end) {
    List<TreeNode> list = new ArrayList<>();
    if (begin > end) {
      list.add(null);
      return list;
    }
    for (int i = begin; i <= end; i++) {
      List<TreeNode> leftList = generateTrees(begin, i - 1);
      List<TreeNode> rightList = generateTrees(i + 1, end);
      for (TreeNode left : leftList) {
        for (TreeNode right: rightList) {
          list.add(new TreeNode(i, left, right));
        }
      }
    }
    return list;
  }
}
