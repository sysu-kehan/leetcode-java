package problem141;

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
    System.out.println(solution.hasCycle(head1));
    ListNode head2 = ListNode.generateList(new int[]{1, 2});
    head2.next = head2;
    System.out.println(solution.hasCycle(head2));
    ListNode head3 = ListNode.generateList(new int[]{1});
    System.out.println(solution.hasCycle(head3));
  }
}
