package problem142;

import bean.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
  public ListNode detectCycle(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode slow = head.next;
    ListNode quick = slow == null ? null : slow.next;
    while (slow != quick) {
      slow = slow == null ? null : slow.next;
      quick = quick == null ? null : quick.next;
      quick = quick == null ? null : quick.next;
    }
    if (slow == null) {
      return null;
    }
    ListNode meet = slow;
    while (head != meet) {
      head = head.next;
      meet = meet.next;
    }
    return meet;
  }
}
