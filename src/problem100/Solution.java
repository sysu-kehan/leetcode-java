package problem100;

import bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

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
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(p);
    queue.add(q);
    while (!queue.isEmpty()) {
      TreeNode node1 = queue.poll();
      TreeNode node2 = queue.poll();
      if (node1 == null && node2 == null) {
        continue;
      }
      if (node1 == null || node2 == null) {
        return false;
      }
      if (node1.val != node2.val) {
        return false;
      }
      queue.add(node1.left);
      queue.add(node2.left);
      queue.add(node1.right);
      queue.add(node2.right);
    }
    return true;
  }
}
