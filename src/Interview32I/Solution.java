package Interview32I;

import bean.TreeNode;

import java.util.*;

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
  public int[] levelOrder(TreeNode root) {
    if (root == null) {
      return new int[]{};
    }
    List<Integer> list = new ArrayList<>();
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
      list.add(node.val);
    }
    int[] result = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }
    return result;
  }
}
