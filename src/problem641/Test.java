package problem641;

public class Test {
  public static void main(String[] args) {
    MyCircularDeque circularDeque = new MyCircularDeque(3); // 设置容量大小为3
    print(circularDeque.insertLast(1));			        // 返回 true
    print(circularDeque.insertLast(2));			        // 返回 true
    print(circularDeque.insertFront(3));			        // 返回 true
    print(circularDeque.insertFront(4) == false);			        // 已经满了，返回 false
    print(circularDeque.getRear() == 2);  				// 返回 2
    print(circularDeque.isFull());				        // 返回 true
    print(circularDeque.deleteLast());			        // 返回 true
    print(circularDeque.insertFront(4));			        // 返回 true
    print(circularDeque.getFront() == 4);				// 返回 4
  }

  private static void print(boolean result) {
    System.out.println(result);
  }

  private static void print(int result) {
    System.out.println(result);
  }
}
