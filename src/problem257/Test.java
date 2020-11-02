package problem257;

import bean.TreeNode;

import java.util.List;

public class Test {

  public static void main(String[] args) {
    Solution solution = new Solution();
    TreeNode node1 = TreeNode.generateTree(new Integer[]{1, 2, 3, null, 5, null, null});
    List<String> list1 = solution.binaryTreePaths(node1);
    System.out.println();
  }
}
