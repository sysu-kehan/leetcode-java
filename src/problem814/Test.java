package problem814;

import bean.TreeNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    TreeNode node1 = solution.pruneTree(TreeNode.generateTree(new Integer[]{1, null, 0, null, null, 0, 1}));
    TreeNode node2 = solution.pruneTree(TreeNode.generateTree(new Integer[]{1, 0, 1, 0, 0, 0, 1}));
    System.out.println();
  }
}
