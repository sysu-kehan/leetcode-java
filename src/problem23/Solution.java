package problem23;

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
  public ListNode mergeKLists(ListNode[] lists) {
    if (lists == null || lists.length == 0) {
      return null;
    }
    int length = lists.length;
    while (length > 1) {
      int newLength = (length + 1) / 2;
      for (int i = 0; i + newLength < length; i++) {
        lists[i] = merge(lists[i], lists[i + newLength]);
      }
      length = newLength;
    }
    return lists[0];
  }

  private ListNode merge(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) {
      return null;
    }
    ListNode root = null, itr = null;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        if (root == null) {
          root = itr = l1;
        } else {
          itr.next = l1;
          itr = itr.next;
        }
        l1 = l1.next;
      } else {
        if (root == null) {
          root = itr = l2;
        } else {
          itr.next = l2;
          itr = itr.next;
        }
        l2 = l2.next;
      }
    }
    if (l1 != null) {
      if (root == null) {
        root = l1;
      } else {
        itr.next = l1;
      }
    }
    if (l2 != null) {
      if (root == null) {
        root = l2;
      } else {
        itr.next = l2;
      }
    }
    return root;
  }
}
