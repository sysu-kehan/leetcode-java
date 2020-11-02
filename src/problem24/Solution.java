package problem24;

import bean.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode swapPairs(ListNode head) {
    if (head != null && head.next != null) {
      ListNode pre = head;
      ListNode cur = pre.next;
      ListNode next = cur.next;
      head = cur;
      while (cur != null) {
        cur.next = pre;
        pre.next = (next != null && next.next != null) ? next.next : next;
        if (next != null && next.next != null) {
          pre = next;
          cur = pre.next;
          next = cur.next;
        } else {
          break;
        }
      }
    }
    return head;
  }
}
