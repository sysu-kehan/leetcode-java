package problem919;

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
class CBTInserter {

  private List<Integer> nodeList;

  public CBTInserter(TreeNode root) {
    nodeList = new ArrayList<>();
    if (root != null) {
      Queue<TreeNode> queue = new ArrayDeque<>();
      queue.add(root);
      while (!queue.isEmpty()) {
        TreeNode node = queue.poll();
        nodeList.add(node.val);
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
    }
  }

  public int insert(int v) {
    int index = nodeList.size();
    nodeList.add(v);
    int level = 0;
    //  计算插入节点属于树的哪一层
    for (int sum = 1; index > sum - 1; level++, sum += Math.pow(2, level));
    //  处于第0层，没有父节点
    if (level == 0) {
      return -1;
    }
    //  计算插入节点属于层的第几个节点
    int pos = index - ((int)Math.pow(2, level) - 1);
    //  计算插入节点的父节点是上一层的第几个
    int parentPos = pos / 2;
    //  计算上一层的起始下标
    int parentBeginIndex = (int)Math.pow(2, level - 1) - 1;
    //  计算插入节点的父节点下标
    return nodeList.get(parentBeginIndex + parentPos);
  }

  public TreeNode get_root() {
    if (nodeList.isEmpty()) {
      return null;
    }
    Queue<TreeNode> queue = new ArrayDeque<>();
    TreeNode root = new TreeNode(nodeList.get(0));
    queue.add(root);
    for (int i = 1; i < nodeList.size(); i++) {
      TreeNode node = queue.poll();
      node.left = new TreeNode(nodeList.get(i));
      queue.add(node.left);
      i++;
      if (i < nodeList.size()) {
        node.right = new TreeNode(nodeList.get(i));
        queue.add(node.right);
      }
    }
    return root;
  }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */
