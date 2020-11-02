package problem513;

import bean.TreeNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.findBottomLeftValue(TreeNode.generateTree(new Integer[]{2, 1, 3})));
    System.out.println(solution.findBottomLeftValue(
        TreeNode.generateTree(new Integer[]{1, 2, 3, 4, null, 5, 6, null, null, null, null, 7})
        )
    );
  }
}
