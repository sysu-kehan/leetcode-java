package problem236;

import bean.TreeNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(
        solution.lowestCommonAncestor(
            TreeNode.generateTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4}),
            new TreeNode(5), new TreeNode(1)
        ).val
    );
    System.out.println(
        solution.lowestCommonAncestor(
            TreeNode.generateTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4}),
            new TreeNode(5), new TreeNode(4)
        ).val
    );
  }
}
