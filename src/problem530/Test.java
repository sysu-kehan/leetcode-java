package problem530;

import bean.TreeNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(
        solution.getMinimumDifference(
            TreeNode.generateTree(new Integer[]{1, null, 3, null, null, 2, null})
        )
    );
  }
}
