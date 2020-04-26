package problem19;

import bean.ListNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode node1 = ListNode.generateList(new int[]{1, 2, 3, 4, 5});
    ListNode.printList(solution.removeNthFromEnd(node1, 2));
    ListNode node2 = ListNode.generateList(new int[]{1, 2, 3, 4, 5});
    ListNode.printList(solution.removeNthFromEnd(node2, 5));
    ListNode node3 = ListNode.generateList(new int[]{1, 2, 3, 4, 5});
    ListNode.printList(solution.removeNthFromEnd(node3, 1));
  }
}
