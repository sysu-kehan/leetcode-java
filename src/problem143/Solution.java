package problem143;

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
  public void reorderList(ListNode head) {
    if (head != null && head.next != null) {
      ListNode mid = getMidNode(head);
      ListNode anoHead = mid.next;
      ListNode reserveAnoHead = reserveList(anoHead);
      mid.next = null;
      ListNode node1 = head;
      ListNode node2 = reserveAnoHead;
      while (node1 != null && node2 != null) {
        ListNode nextNode1 = node1.next;
        node1.next = node2;
        node1 = nextNode1;
        ListNode nextNode2 = node2.next;
        node2.next = node1;
        node2 = nextNode2;
      }
    }
  }

  private ListNode getMidNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  private ListNode reserveList(ListNode head) {
    ListNode pre = null;
    ListNode cur = head;
    ListNode next = cur.next;
    while (next != null) {
      cur.next = pre;
      pre = cur;
      cur = next;
      next = next.next;
    }
    cur.next = pre;
    return cur;
  }
}
