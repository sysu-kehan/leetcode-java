package problem5398;

import bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public int goodNodes(TreeNode root) {
    if (root == null) {
      return 0;
    }
    Queue<TreeNodeWithMax> queue = new LinkedList<>();
    int count = 0;
    queue.add(new TreeNodeWithMax(root, Integer.MIN_VALUE));
    while (!queue.isEmpty()) {
      TreeNodeWithMax cur = queue.poll();
      int max = cur.max;
      if (cur.node.val >= max) {
        max = cur.node.val;
        count++;
      }
      TreeNode left = cur.node.left;
      if (left != null) {
        queue.add(new TreeNodeWithMax(left, max));
      }
      TreeNode right = cur.node.right;
      if (right != null) {
        queue.add(new TreeNodeWithMax(right, max));
      }
    }
    return count;
  }

  private class TreeNodeWithMax {
    TreeNode node;
    int max;
    TreeNodeWithMax(TreeNode node, int max) {
      this.node = node;
      this.max = max;
    }
  }
}

