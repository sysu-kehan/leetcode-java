package problem21;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode root = null;
    ListNode itr = null;
    while (l1 != null && l2 != null) {
      ListNode next;
      if (l1.val < l2.val) {
        next = l1;
        l1 = l1.next;
      } else {
        next = l2;
        l2 = l2.next;
      }
      if (root == null) {
        root = itr = next;
      } else {
        itr.next = next;
        itr = itr.next;
      }
    }
    if (root == null) {
      root = l1 != null ? l1 : l2;
    } else {
      itr.next = l1 != null ? l1 : l2;
    }
    return root;
  }
}
