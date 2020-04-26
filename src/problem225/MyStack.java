package problem225;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

  private Queue<Integer> queue;

  /** Initialize your data structure here. */
  public MyStack() {
    queue = new LinkedList<>();
  }

  /** Push element x onto stack. */
  public void push(int x) {
    queue.add(x);
  }

  /** Removes the element on top of the stack and returns that element. */
  public int pop() {
    if (queue.isEmpty()) {
      return -1;
    }
    int size = queue.size();
    for (int i = 0; i < size - 1; i++) {
      queue.add(queue.poll());
    }
    return queue.poll();
  }

  /** Get the top element. */
  public int top() {
    if (queue.isEmpty()) {
      return -1;
    }
    int size = queue.size();
    for (int i = 0; i < size - 1; i++) {
      queue.add(queue.poll());
    }
    int top = queue.peek();
    queue.add(queue.poll());
    return top;
  }

  /** Returns whether the stack is empty. */
  public boolean empty() {
    return queue.isEmpty();
  }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
