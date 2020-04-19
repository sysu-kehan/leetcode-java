package bean;

import java.util.*;

public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int x) {
    val = x;
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
    TreeNode[] nodes = new TreeNode[array.length];
    for (int i = 0; i < array.length; i++) {
      nodes[i] = array[i] == null ? null : new TreeNode(array[i]);
    }
    //  计算树一共有几层
    int totalLevel = 0;
    for (int sum = 1; array.length > sum; totalLevel++, sum += Math.pow(2, totalLevel)) ;
    int[] levels = new int[totalLevel + 1];
    levels[0] = 1;
    for (int i = 1; i <= totalLevel; i++) {
      levels[i] = (int) Math.pow(2, i) + levels[i - 1];
    }
    //  构造根节点
    TreeNode root = nodes[0];
    int rootLeftChildIndex = 1;
    int rootRightChildIndex = rootLeftChildIndex + 1;
    root.left = rootLeftChildIndex < nodes.length ? nodes[rootLeftChildIndex] : null;
    root.right = rootRightChildIndex < nodes.length ? nodes[rootRightChildIndex] : null;

    int curLevel = 1;
    for (int i = 1; i < nodes.length; i++) {
      if (i + 1 > levels[curLevel]) {
        curLevel++;
      }
      if (nodes[i] != null && curLevel < totalLevel) {
        int curPos = i - levels[curLevel - 1];
        int childPos = curPos * 2;
        int leftChildIndex = levels[curLevel] + childPos;
        int rightChildIndex = leftChildIndex + 1;
        nodes[i].left = leftChildIndex < nodes.length ? nodes[leftChildIndex] : null;
        nodes[i].right = rightChildIndex < nodes.length ? nodes[rightChildIndex] : null;
      }
    }
    return root;
  }
}
