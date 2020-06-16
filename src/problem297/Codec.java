package problem297;

import bean.TreeNode;

import java.util.LinkedList;
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
public class Codec {

  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    if (root == null) {
      return "";
    }
    StringBuilder result = new StringBuilder();
    int count = 0;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    count++;
    while (count > 0) {
      TreeNode cur = queue.poll();
      if (cur != null) {
        count--;
        result.append(cur.val);
        queue.add(cur.left);
        if (cur.left != null) {
          count++;
        }
        queue.add(cur.right);
        if (cur.right != null) {
          count++;
        }
      } else {
        result.append("null");
        queue.add(null);
        queue.add(null);
      }
      if (count > 0) {
        result.append(",");
      }
    }
    return result.toString();
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    String[] array = data.split(",");
    TreeNode[] nodeArray = new TreeNode[array.length];
    for (int i = 0; i < array.length; i++) {
      nodeArray[i] = (array[i].equals("null") || array[i].equals("")) ? null : new TreeNode(Integer.parseInt(array[i]));
    }
    for (int i = 0; 2 * i + 1 < array.length; i++) {
      TreeNode cur = nodeArray[i];
      if (cur != null) {
        cur.left = nodeArray[2 * i + 1];
        cur.right = 2 * i + 2 < array.length ? nodeArray[2 * i + 2] : null;
      }
    }
    return nodeArray[0];
  }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
