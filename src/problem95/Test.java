package problem95;

import bean.TreeNode;

import java.util.*;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    printList(solution.generateTrees(5));
  }

  private static void printList(List<TreeNode> list) {
    Queue<TreeNode> queue = new LinkedList<>();
    List<Integer> printList = new ArrayList<>();
    for (TreeNode node : list) {
      queue.add(node);
      while (!queue.isEmpty()) {
        TreeNode cur = queue.poll();
        if (cur != null) {
          printList.add(cur.val);
          queue.add(cur.left);
          queue.add(cur.right);
        } else {
          printList.add(null);
        }
      }
      while (printList.get(printList.size() - 1) == null) {
        printList.remove(printList.size() - 1);
      }
      System.out.println(Arrays.toString(printList.toArray(new Integer[]{})));
      printList.clear();
    }
  }
}
