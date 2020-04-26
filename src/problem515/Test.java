package problem515;

import bean.TreeNode;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(
        Arrays.toString(
            solution.largestValues(TreeNode.generateTree(new Integer[]{1, 3, 2, 5, 3, null, 9})).toArray()
        )
    );
    System.out.println(
        Arrays.toString(
            solution.largestValues(TreeNode.generateTree(new Integer[]{})).toArray()
        )
    );
  }
}
