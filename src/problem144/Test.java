package problem144;

import bean.TreeNode;

import java.util.List;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    TreeNode node1 = TreeNode.generateTree(
        new Integer[]{6, 2, 8, 1, 4, null, null, null, null, 3, 7});
    List<Integer> result11 = solution.preorderTraversal(node1);
    List<Integer> result12 = solution.preorderTraversal1(node1);
    List<Integer> result13 = solution.preorderTraversal2(node1);
    System.out.println(result11.toString());
    System.out.println(result12.toString());
    System.out.println(result13.toString());
    TreeNode node2 = TreeNode.generateTree(
        new Integer[]{1, null, 2, null, null, 3});
    List<Integer> result21 = solution.preorderTraversal(node2);
    List<Integer> result22 = solution.preorderTraversal1(node2);
    List<Integer> result23 = solution.preorderTraversal2(node2);
    System.out.println(result21.toString());
    System.out.println(result22.toString());
    System.out.println(result23.toString());
  }
}
