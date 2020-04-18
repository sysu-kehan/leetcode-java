package problem622;

class MyCircularQueue {

  private int[] elements;
  private int size = 0;
  private int head = 0;
  private int tail = 0;

  /** Initialize your data structure here. Set the size of the queue to be k. */
  public MyCircularQueue(int k) {
    elements = new int[k];
  }

  /** Insert an element into the circular queue. Return true if the operation is successful. */
  public boolean enQueue(int value) {
    if (isFull()) {
      return false;
    }
    elements[tail++] = value;
    if (tail >= elements.length) {
      tail = 0;
    }
    size++;
    return true;
  }

  /** Delete an element from the circular queue. Return true if the operation is successful. */
  public boolean deQueue() {
    if (isEmpty()) {
      return false;
    }
    head = head == elements.length - 1 ? 0 : head + 1;
    size--;
    return true;
  }

  /** Get the front item from the queue. */
  public int Front() {
    return isEmpty() ? -1 : elements[head];
  }

  /** Get the last item from the queue. */
  public int Rear() {
    return isEmpty() ? -1 : elements[tail == 0 ? elements.length - 1 : tail - 1];
  }

  /** Checks whether the circular queue is empty or not. */
  public boolean isEmpty() {
    return size == 0;
  }

  /** Checks whether the circular queue is full or not. */
  public boolean isFull() {
    return size == elements.length;
  }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
