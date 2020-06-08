package problem5398;

import bean.TreeNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.goodNodes(TreeNode.generateTree(new Integer[]{3, 1, 4, 3, null, 1, 5})));
    System.out.println(solution.goodNodes(TreeNode.generateTree(new Integer[]{3, 3, null, 4, 2})));
    System.out.println(solution.goodNodes(TreeNode.generateTree(new Integer[]{1})));
  }
}
