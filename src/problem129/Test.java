package problem129;

import bean.TreeNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.sumNumbers(TreeNode.generateTree(new Integer[]{1, 2, 3})));
    System.out.println(solution.sumNumbers(TreeNode.generateTree(new Integer[]{4, 9, 0, 5, 1})));
    System.out.println(solution.sumNumbers(TreeNode.generateTree(new Integer[]{})));
  }
}
