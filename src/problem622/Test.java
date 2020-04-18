package problem622;

public class Test {
  public static void main(String[] args) {
    MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3

    print(circularQueue.enQueue(1)); // 返回 true

    print(circularQueue.enQueue(2)); // 返回 true

    print(circularQueue.enQueue(3)); // 返回 true

    print(circularQueue.enQueue(4) == false); // 返回 false，队列已满

    print(circularQueue.Rear() == 3); // 返回 3

    print(circularQueue.isFull()); // 返回 true

    print(circularQueue.deQueue()); // 返回 true

    print(circularQueue.enQueue(4)); // 返回 true

    print(circularQueue.Rear() == 4); // 返回 4
  }

  private static void print(boolean result) {
    System.out.println(result);
  }
}
