package problem107;

import bean.TreeNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    solution.levelOrderBottom(TreeNode.generateTree(new Integer[]{3, 9, 20, null, null, 15, 7}));
  }
}
