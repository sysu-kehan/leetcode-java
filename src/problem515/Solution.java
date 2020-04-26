package problem515;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
  public List<Integer> largestValues(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    Queue<TreeNode> queue1 = new LinkedList<>();
    Queue<TreeNode> queue2 = new LinkedList<>();
    queue1.add(root);
    while (!queue1.isEmpty()) {
      int max = Integer.MIN_VALUE;
      while (!queue1.isEmpty()) {
        TreeNode node = queue1.poll();
        if (node.left != null) {
          queue2.add(node.left);
        }
        if (node.right != null) {
          queue2.add(node.right);
        }
        if (max <= node.val) {
          max = node.val;
        }
      }
      result.add(max);
      if (!queue2.isEmpty()) {
        queue1.addAll(queue2);
        queue2.clear();
      }
    }
    return result;
  }
}
