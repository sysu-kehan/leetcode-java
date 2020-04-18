package problem641;

class MyCircularDeque {

  private int[] elements;
  private int head = 0;
  private int tail = 0;
  private int size = 0;

  /** Initialize your data structure here. Set the size of the deque to be k. */
  public MyCircularDeque(int k) {
    elements = new int[k];
  }

  /** Adds an item at the front of Deque. Return true if the operation is successful. */
  public boolean insertFront(int value) {
    if (isFull()) {
      return false;
    }
    head = head == 0 ? elements.length - 1 : head - 1;
    elements[head] = value;
    size++;
    return true;
  }

  /** Adds an item at the rear of Deque. Return true if the operation is successful. */
  public boolean insertLast(int value) {
    if (isFull()) {
      return false;
    }
    elements[tail] = value;
    tail = tail == elements.length - 1 ? 0 : tail + 1;
    size++;
    return true;
  }

  /** Deletes an item from the front of Deque. Return true if the operation is successful. */
  public boolean deleteFront() {
    if (isEmpty()) {
      return false;
    }
    head = head == elements.length - 1 ? 0 : head + 1;
    size--;
    return true;
  }

  /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
  public boolean deleteLast() {
    if (isEmpty()) {
      return false;
    }
    tail = tail == 0 ? elements.length - 1 : tail - 1;
    size--;
    return true;
  }

  /** Get the front item from the deque. */
  public int getFront() {
    return isEmpty() ? -1 : elements[head];
  }

  /** Get the last item from the deque. */
  public int getRear() {
    return isEmpty() ? -1 : elements[tail == 0 ? elements.length - 1 : tail - 1];
  }

  /** Checks whether the circular deque is empty or not. */
  public boolean isEmpty() {
    return size == 0;
  }

  /** Checks whether the circular deque is full or not. */
  public boolean isFull() {
    return size == elements.length;
  }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
