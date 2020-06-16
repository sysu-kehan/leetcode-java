package problem2;

import bean.ListNode;

class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int val, carry = 0;
    ListNode head = new ListNode(0);
    ListNode ite = head;
    for (ListNode node1 = l1, node2 = l2; node1 != null || node2 != null; ite = ite.next) {
      val = (node1 != null ? node1.val : 0) + (node2 != null ? node2.val : 0) + carry;
      carry = val / 10;
      ite.next = new ListNode(val % 10);
      if (node1 != null) {
        node1 = node1.next;
      }
      if (node2 != null) {
        node2 = node2.next;
      }
    }
    if (carry > 0) {
      ite.next = new ListNode(1);
    }
    return head.next;
  }

  public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    } else if (l2 == null) {
      return l1;
    }
    ListNode node1 = l1, node2 = l2, iter1 = l1, iter2 = l2;
    int count = 0;
    while (iter1 != null && iter2 != null) {
      iter1 = iter1.next;
      iter2 = iter2.next;
      count++;
    }
    ListNode begin;
    if (iter1 == null) {
      begin = node2;
      for (; iter2 != null; node2 = node2.next, iter2 = iter2.next, count++);
    } else {
      begin = node1;
      for (; iter1 != null; node1 = node1.next, iter1 = iter1.next, count++);
    }
    int[] array = new int[count];
    int index = 0;
    for (; begin != node1 && begin != node2; array[index] = begin.val, begin = begin.next, index++);
    for (; node1 != null; array[index] = node1.val + node2.val, node1 = node1.next, node2 = node2.next, index++);
    for (int i = array.length - 1; i > 0; i--) {
      if (array[i] >= 10) {
        array[i - 1]++;
        array[i] -= 10;
      }
    }
    ListNode result = array[0] >= 10 ? new ListNode(1) : new ListNode(array[0]);
    if (array[0] >= 10) {
      array[0] -= 10;
    }
    ListNode ite = result;
    for (int i = 0; i < array.length; ite.next = new ListNode(array[i]), ite = ite.next, i++);
    return result;
  }
}
