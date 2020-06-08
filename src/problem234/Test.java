package problem234;

import bean.ListNode;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode node1 = ListNode.generateList(new int[]{1, 2});
    ListNode.printList(node1);
    System.out.println(solution.isPalindrome(node1));
    ListNode.printList(node1);
    ListNode node2 = ListNode.generateList(new int[]{1, 2, 2, 1});
    ListNode.printList(node2);
    System.out.println(solution.isPalindrome(node2));
    ListNode.printList(node2);
    ListNode node3 = ListNode.generateList(new int[]{1, 2, 3, 4, 2, 2, 1});
    ListNode.printList(node3);
    System.out.println(solution.isPalindrome(node3));
    ListNode.printList(node3);
    System.out.println();
  }
}
