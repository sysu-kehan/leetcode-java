package bean;

import java.util.*;

public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int x) {
    val = x;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public static Integer[] transArray(TreeNode root) {
    if (root == null) {
      return new Integer[]{};
    }
    List<Integer> result = new LinkedList<>();
    Map<Integer, ArrayList<TreeNode>> map = new HashMap<>();
    ArrayList<TreeNode> list = new ArrayList<>();
    list.add(root);
    int level = 0;
    map.put(level, list);
    while (!isListFullofNull(map.get(level))) {
      ArrayList<TreeNode> curList = map.get(level);
      level++;
      ArrayList<TreeNode> nextLevelList = new ArrayList<>();
      for (int i = 0; i < curList.size(); i++) {
        TreeNode node = curList.get(i);
        if (node != null) {
          nextLevelList.add(node.left);
          nextLevelList.add(node.right);
        } else {
          nextLevelList.add(null);
          nextLevelList.add(null);
        }
      }
      map.put(level, nextLevelList);
    }
    for (int i = 0; i < level; i++) {
      ArrayList<TreeNode> curList = map.get(i);
      for (int j = 0; j < curList.size(); j++) {
        TreeNode node = curList.get(j);
        result.add(node != null ? node.val : null);
      }
    }
    int lastIndex = result.size() - 1;
    for (; result.get(lastIndex) == null; lastIndex--) ;
    return result.subList(0, lastIndex + 1).toArray(new Integer[]{});
  }

  private static boolean isListFullofNull(List<TreeNode> list) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) != null) {
        return false;
      }
    }
    return true;
  }

  public static TreeNode generateTree(Integer[] array) {
    if (array.length <= 0) {
      return null;
    }
    TreeNode[] nodes = new TreeNode[array.length + 1];
    for (int i = 0; i < array.length; i++) {
      nodes[i + 1] = array[i] == null ? null : new TreeNode(array[i]);
    }
    int length = nodes.length;
    for (int i = 1; i * 2 < length; i++) {
      if (nodes[i] != null) {
        nodes[i].left = nodes[i * 2];
        nodes[i].right = i * 2 + 1 < length ? nodes[i * 2 + 1] : null;
      }
    }
    return nodes[1];
  }
}
