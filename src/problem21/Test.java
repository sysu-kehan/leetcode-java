package problem21;

import bean.ListNode;

public class Test {
  public static void main(String[] args) {
    ListNode test1 = new Solution().mergeTwoLists(
        ListNode.generateList(new int[]{1, 2, 4}), ListNode.generateList(new int[]{1, 3, 4}));
    ListNode.printList(test1);
  }
}
