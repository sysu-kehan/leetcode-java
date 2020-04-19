package problem94;

import bean.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    TreeNode node1 = TreeNode.generateTree(
        new Integer[]{6, 2, 8, 1, 4, null, null, null, null, 3, 7});
    List<Integer> result11 = solution.inorderTraversal(node1);
    List<Integer> result12 = solution.inorderTraversal1(node1);
    System.out.println(result11.toString());
    System.out.println(result12.toString());
    TreeNode node2 = TreeNode.generateTree(
        new Integer[]{1, null, 2, null, null, 3});
    List<Integer> result21 = solution.inorderTraversal(node2);
    List<Integer> result22 = solution.inorderTraversal1(node2);
    System.out.println(result21.toString());
    System.out.println(result22.toString());
  }
}
