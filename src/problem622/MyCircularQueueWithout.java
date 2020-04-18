package problem622;

class MyCircularQueueWithout {

  private int[] elements;
  private int size = 0;

  /** Initialize your data structure here. Set the size of the queue to be k. */
  public MyCircularQueueWithout(int k) {
    elements = new int[k];
  }

  /** Insert an element into the circular queue. Return true if the operation is successful. */
  public boolean enQueue(int value) {
    if (isFull()) {
      return false;
    }
    elements[size++] = value;
    return true;
  }

  /** Delete an element from the circular queue. Return true if the operation is successful. */
  public boolean deQueue() {
    if (isEmpty()) {
      return false;
    }
    System.arraycopy(elements, 1, elements, 0, size - 1);
    size--;
    return true;
  }

  /** Get the front item from the queue. */
  public int Front() {
    return isEmpty() ? -1 : elements[0];
  }

  /** Get the last item from the queue. */
  public int Rear() {
    return isEmpty() ? -1 : elements[size - 1];
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
