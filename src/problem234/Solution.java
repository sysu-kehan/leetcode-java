package problem234;

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
  public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) {
      return true;
    }
    int count = 0;
    ListNode node = head;
    while (node != null) {
      count++;
      node = node.next;
    }
    int tailBeginCount = (count + 1) / 2;
    ListNode tailBeginNode = head;
    for (int i = 0; i < tailBeginCount; i++) {
      tailBeginNode = tailBeginNode.next;
    }
    ListNode newTailBeginNode = reserveList(tailBeginNode);
    for (ListNode headBegin = head, tailBegin = newTailBeginNode;
         headBegin != null && tailBegin != null;
         headBegin = headBegin.next, tailBegin = tailBegin.next) {
      if (headBegin.val != tailBegin.val) {
        reserveList(newTailBeginNode);
        return false;
      }
    }
    reserveList(newTailBeginNode);
    return true;
  }

  private ListNode reserveList(ListNode node) {
    ListNode cur = node;
    ListNode next = node.next;
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
