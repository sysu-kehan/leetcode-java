package Interview32III;

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
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root != null) {
      Queue<TreeNode> curQueue = new ArrayDeque<>();
      Queue<TreeNode> nextQueue = new ArrayDeque<>();
      curQueue.add(root);
      List<Integer> list = new ArrayList<>();
      while (!curQueue.isEmpty()) {
        TreeNode node = curQueue.poll();
        if (node.left != null) {
          nextQueue.add(node.left);
        }
        if (node.right != null) {
          nextQueue.add(node.right);
        }
        list.add(node.val);
        if (curQueue.isEmpty()) {
          if (!nextQueue.isEmpty()) {
            curQueue.addAll(nextQueue);
            nextQueue.clear();
          }
          List<Integer> tempList = new ArrayList<>();
          tempList.addAll(list);
          if (result.size() % 2 != 0) {
            Collections.reverse(tempList);
          }
          result.add(tempList);
          list.clear();
        }
      }
    }
    return result;
  }
}
