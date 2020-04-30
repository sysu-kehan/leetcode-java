package problem617;

import bean.TreeNode;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(
        Arrays.toString(
            TreeNode.transArray(solution.mergeTrees(
                TreeNode.generateTree(new Integer[]{1, 3, 2, 5}),
                TreeNode.generateTree(new Integer[]{2, 1, 3, null, 4, null, 7})
            ))
        )
    );
  }
}
