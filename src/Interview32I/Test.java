package Interview32I;

import bean.TreeNode;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    TreeNode node1 = TreeNode.generateTree(new Integer[]{3, 9, 20, null, null, 15, 7});
    System.out.println(Arrays.toString(solution.levelOrder(node1)));
  }
}
