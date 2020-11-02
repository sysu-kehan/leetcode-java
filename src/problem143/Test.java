package problem143;

import bean.ListNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode head1 = ListNode.generateList(new int[]{1, 2, 3, 4});
    solution.reorderList(head1);
    ListNode.printList(head1);
    ListNode head2 = ListNode.generateList(new int[]{1, 2, 3, 4, 5});
    solution.reorderList(head2);
    ListNode.printList(head2);
    ListNode head3 = ListNode.generateList(new int[]{1, 2});
    solution.reorderList(head3);
    ListNode.printList(head3);
    ListNode head4 = ListNode.generateList(new int[]{1});
    solution.reorderList(head4);
    ListNode.printList(head4);
  }
}
