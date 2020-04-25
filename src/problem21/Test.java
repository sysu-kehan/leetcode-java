package problem21;

public class Test {
  public static void main(String[] args) {
    ListNode test1 = new Solution().mergeTwoLists(
        generateList(new int[]{1, 2, 4}), generateList(new int[]{1, 3, 4}));
    System.out.println();
  }

  private static ListNode generateList(int[] array) {
    if (array == null || array.length == 0) {
      return null;
    }
    ListNode root = new ListNode(array[0]);
    ListNode itr = root;
    for (int i = 1; i < array.length; i++) {
      itr.next = new ListNode(array[i]);
      itr = itr.next;
    }
    return root;
  }
}
