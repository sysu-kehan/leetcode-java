package problem114;

import bean.TreeNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    TreeNode node1 = TreeNode.generateTree(new Integer[]{1, 2, 5, 3, 4, null, 6});
    solution.flatten(node1);
    System.out.println();
  }
}
