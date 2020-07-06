package problem141;

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
public class Solution {
  public boolean hasCycle(ListNode head) {
    if (head == null) {
      return false;
    }
    ListNode slow = head.next;
    ListNode quick = slow == null ? null : slow.next;
    while (slow != quick) {
      slow = slow == null ? null : slow.next;
      quick = quick == null ? null : quick.next;
      quick = quick == null ? null : quick.next;
    }
    return slow != null;
  }
}
