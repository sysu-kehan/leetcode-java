package problem863;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

  public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
    List<Integer> resultList = findNodes(target, K);
    int dis = K - 1;
    TreeNode node = target;
    while (dis >= 0 && root != node) {
      TreeNode parent = findParent(root, node);
      if (dis == 0) {
        resultList.add(parent.val);
      } else {
        if (parent.left == node) {
          resultList.addAll(findNodes(parent.right, dis - 1));
        } else {
          resultList.addAll(findNodes(parent.left, dis - 1));
        }
      }
      node = parent;
      dis--;
    }
    return resultList;
  }

  private TreeNode findParent(TreeNode root, TreeNode child) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node.left == child || node.right == child) {
        return node;
      }
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
    return null;
  }

  private List<Integer> findNodes(TreeNode begin, int distance) {
    List<Integer> result = new ArrayList<>();
    if (begin == null) {
      return result;
    }
    if (distance == 0) {
      result.add(begin.val);
      return result;
    }
    result.addAll(findNodes(begin.left, distance - 1));
    result.addAll(findNodes(begin.right, distance - 1));
    return result;
  }
}
