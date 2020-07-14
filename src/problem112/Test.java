package problem112;

import bean.TreeNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.hasPathSum(
        TreeNode.generateTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, null, 1}),
        22
    ));
  }
}
