package problem206;

import bean.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode cur = head;
    ListNode next = head.next;
    ListNode prev = null;
    while (cur != null) {
      cur.next = prev;
      prev = cur;
      cur = next;
      next = cur != null ? cur.next : null;
    }
    return prev;
  }
}
