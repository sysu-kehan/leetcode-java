package problem155;

import java.util.Arrays;

class MinStack {

  private int[] array;
  private int min;
  private int size = 0;
  private int length = 16;

  /** initialize your data structure here. */
  public MinStack() {
    array = new int[length];
  }

  public void push(int x) {
    array[size++] = x;
    if (size == 1) {
      min = x;
    } else {
      min = min < x ? min : x;
    }
    if (size >= length) {
      length = length << 1;
      array = Arrays.copyOf(array, length);
    }
  }

  public void pop() {
    if (size <= 0) {
      return;
    }
    if (size > 1 && min == array[size - 1]) {
      min = array[0];
      for (int i = 1; i < size - 1; i++) {
        if (array[i] < min) {
          min = array[i];
        }
      }
    }
    size--;
  }

  public int top() {
    return size >= 0 ? array[size - 1] : -1;
  }

  public int getMin() {
    return size >= 0 ? min : -1;
  }
}
