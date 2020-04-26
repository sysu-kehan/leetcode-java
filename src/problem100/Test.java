package problem100;

import bean.TreeNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    TreeNode node11 = TreeNode.generateTree(new Integer[]{1, 2, 3});
    TreeNode node12 = TreeNode.generateTree(new Integer[]{1, 2, 3});
    System.out.println(solution.isSameTree(node11, node12));
    TreeNode node21 = TreeNode.generateTree(new Integer[]{1, 2});
    TreeNode node22 = TreeNode.generateTree(new Integer[]{1, null, 2});
    System.out.println(solution.isSameTree(node21, node22) == false);
    TreeNode node31 = TreeNode.generateTree(new Integer[]{1, 2, 1});
    TreeNode node32 = TreeNode.generateTree(new Integer[]{1, 1, 2});
    System.out.println(solution.isSameTree(node31, node32) == false);
  }
}
