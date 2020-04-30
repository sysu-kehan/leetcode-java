package problem110;

import bean.TreeNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(
        solution.isBalanced(TreeNode.generateTree(new Integer[]{3, 9, 20, null, null, 15, 7})));
    System.out.println(
        !solution.isBalanced(TreeNode.generateTree(new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4})));
  }
}
