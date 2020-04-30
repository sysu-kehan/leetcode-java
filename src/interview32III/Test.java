package interview32III;

import bean.TreeNode;

import java.util.List;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    TreeNode node1 = TreeNode.generateTree(new Integer[]{3, 9, 20, null, null, 15, 7});
    List<List<Integer>> result = solution.levelOrder(node1);
    System.out.println();
  }
}
