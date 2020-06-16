package problem2;

import bean.ListNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode.printList(solution.addTwoNumbers(
        ListNode.generateList(new int[]{2, 4, 3}),
        ListNode.generateList(new int[]{5, 6, 4})
    ));
    ListNode.printList(solution.addTwoNumbers(
        ListNode.generateList(new int[]{2, 4, 5, 1}),
        ListNode.generateList(new int[]{5, 6, 4})
    ));
    ListNode.printList(solution.addTwoNumbers(
        ListNode.generateList(new int[]{9, 8}),
        ListNode.generateList(new int[]{1})
    ));
    ListNode.printList(solution.addTwoNumbers(
        ListNode.generateList(new int[]{5}),
        ListNode.generateList(new int[]{5})
    ));
  }
}
