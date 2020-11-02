package problem24;

import bean.ListNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode head0 = solution.swapPairs(ListNode.generateList(new int[]{1, 2, 3, 4, 5}));
    ListNode.printList(head0);
    ListNode head1 = solution.swapPairs(ListNode.generateList(new int[]{1, 2, 3, 4}));
    ListNode.printList(head1);
    ListNode head2 = solution.swapPairs(ListNode.generateList(new int[]{1, 2, 3}));
    ListNode.printList(head2);
    ListNode head3 = solution.swapPairs(ListNode.generateList(new int[]{1, 2}));
    ListNode.printList(head3);
  }
}
