package problem101;

import bean.TreeNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    TreeNode node1 = TreeNode.generateTree(new Integer[]{1, 2, 2, 3, 4, 4, 3});
    System.out.println(solution.isSymmetric(node1));
    TreeNode node2 = TreeNode.generateTree(new Integer[]{1, 2, 2, null, 3, null, 3});
    System.out.println(solution.isSymmetric(node2) == false);
    TreeNode node3 = TreeNode.generateTree(new Integer[]{1, 2, 3});
    System.out.println(solution.isSymmetric(node3) == false);
  }
}
