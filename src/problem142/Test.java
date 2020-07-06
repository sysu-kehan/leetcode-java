package problem142;

import bean.ListNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode head1 = ListNode.generateList(new int[]{3, 2, 0, -4});
    ListNode two1 = head1.next;
    ListNode tail1 = head1;
    while (tail1.next != null) {
      tail1 = tail1.next;
    }
    tail1.next = two1;
    ListNode result1 = solution.detectCycle(head1);
    System.out.println(result1 == null ? -1 : result1.val);
    ListNode head2 = ListNode.generateList(new int[]{1, 2});
    head2.next = head2;
    ListNode result2 = solution.detectCycle(head2);
    System.out.println(result2 == null ? -1 : result2.val);
    ListNode head3 = ListNode.generateList(new int[]{1});
    ListNode result3 = solution.detectCycle(head3);
    System.out.println(result3 == null ? -1 : result3.val);
  }
}
