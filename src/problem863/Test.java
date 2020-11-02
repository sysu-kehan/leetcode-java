package problem863;

import bean.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {

  public static void main(String[] args) {
    Solution solution = new Solution();
    TreeNode node1 = TreeNode.generateTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
    TreeNode target1 = searchTarget(node1, 5);
    List<Integer> list1 = solution.distanceK(node1, target1, 2);
    TreeNode node2 = TreeNode.generateTree(new Integer[]{0, 1, null, 3, 2});
    TreeNode target2 = searchTarget(node2, 2);
    List<Integer> list2 = solution.distanceK(node2, target2, 1);
    System.out.println();
  }

  private static TreeNode searchTarget(TreeNode root, int val) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode cur = queue.poll();
      if (cur.val == val) {
        return cur;
      }
      if (cur.left != null) {
        queue.add(cur.left);
      }
      if (cur.right != null) {
        queue.add(cur.right);
      }
    }
    return null;
  }
}
