package problem1028;

import bean.TreeNode;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(
        Arrays.toString(
            TreeNode.transArray(
                solution.recoverFromPreorder("1-2--3--4-5--6--7")
            )
        )
    );
    System.out.println(
        Arrays.toString(
            TreeNode.transArray(
                solution.recoverFromPreorder("1-2--3---4-5--6---7")
            )
        )
    );
    System.out.println(
        Arrays.toString(
            TreeNode.transArray(
                solution.recoverFromPreorder("1-401--349---90--88")
            )
        )
    );
  }
}
