package problem222;

import bean.TreeNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.countNodes(TreeNode.generateTree(new Integer[]{1, 2, 3, 4, 5, 6, null})));
  }
}
