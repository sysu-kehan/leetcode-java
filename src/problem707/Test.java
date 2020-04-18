package problem707;

public class Test {
  public static void main(String[] args) {
    MyLinkedList obj = new MyLinkedList();
    print(obj.get(0) == -1);
    obj.addAtHead(1);
    obj.addAtTail(2);
    obj.addAtIndex(1, 3);
    obj.addAtIndex(3, 4);
    print(obj.get(0) == 1);
    print(obj.get(1) == 3);
    print(obj.get(2) == 2);
    print(obj.get(3) == 4);
    obj.deleteAtIndex(0);
    print(obj.get(0) == 3);
    obj.deleteAtIndex(1);
    print(obj.get(1) == 4);
    obj.deleteAtIndex(1);
    print(obj.get(1) == -1);
  }
  private static void print(boolean result) {
    System.out.println(result);
  }
}
