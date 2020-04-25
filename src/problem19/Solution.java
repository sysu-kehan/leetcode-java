package problem19;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode left = head, right = head;
    for (int count = 0; count < n; count++) {
      right = right.next;
    }
    if (right == null) {
      return left.next;
    }
    while (right.next != null) {
      left = left.next;
      right = right.next;
    }
    left.next = left.next.next;
    return head;
  }
}
