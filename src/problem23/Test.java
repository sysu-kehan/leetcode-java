package problem23;

import bean.ListNode;

public class Test {

  public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode node1 = solution.mergeKLists(new ListNode[]{
        ListNode.generateList(new int[]{1, 4, 5}),
        ListNode.generateList(new int[]{1, 3, 4}),
        ListNode.generateList(new int[]{2, 6})
    });
    ListNode.printList(node1);
  }
}
