package problem19;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode node1 = generateList(new int[]{1, 2, 3, 4, 5});
    printList(solution.removeNthFromEnd(node1, 2));
    ListNode node2 = generateList(new int[]{1, 2, 3, 4, 5});
    printList(solution.removeNthFromEnd(node2, 5));
    ListNode node3 = generateList(new int[]{1, 2, 3, 4, 5});
    printList(solution.removeNthFromEnd(node3, 1));
  }

  private static ListNode generateList(int[] array) {
    ListNode root = null, itr = null;
    for (int i = 0; i < array.length; i++) {
      if (root == null) {
        itr = root = new ListNode(array[i]);
      } else {
        itr.next = new ListNode(array[i]);
        itr = itr.next;
      }
    }
    return root;
  }

  private static void printList(ListNode head) {
    while (head.next != null) {
      System.out.print(head.val + "->");
      head = head.next;
    }
    System.out.println(head.val);
  }
}
