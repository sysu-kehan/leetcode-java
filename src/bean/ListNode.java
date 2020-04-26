package bean;

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }

  public static ListNode generateList(int[] array) {
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

  public static void printList(ListNode head) {
    while (head.next != null) {
      System.out.print(head.val + "->");
      head = head.next;
    }
    System.out.println(head.val);
  }
}
