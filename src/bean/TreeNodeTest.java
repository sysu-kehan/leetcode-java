package bean;

import java.util.*;

public class TreeNodeTest {
  public static void main(String[] args) {
    TreeNode node1 = TreeNode.generateTree(new Integer[]{1, null, 2, null, null, 3});
    TreeNode node2 = TreeNode.generateTree(new Integer[]{10, 9, 8, 7, 6, 5, 4, null, null, null, null, null, null, null, 3});
    System.out.println(Arrays.toString(TreeNode.transArray(node1)));
    System.out.println(Arrays.toString(TreeNode.transArray(node2)));
  }
}
