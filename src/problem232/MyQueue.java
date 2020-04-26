package problem232;

import java.util.Stack;

class MyQueue {

  private Stack<Integer> push;
  private Stack<Integer> pop;

  /** Initialize your data structure here. */
  public MyQueue() {
    push = new Stack<>();
    pop = new Stack<>();
  }

  /** Push element x to the back of queue. */
  public void push(int x) {
    push.push(x);
  }

  /** Removes the element from in front of queue and returns that element. */
  public int pop() {
    if (empty()) {
      return -1;
    }
    if (pop.isEmpty()) {
      while (!push.isEmpty()) {
        pop.push(push.pop());
      }
    }
    return pop.pop();
  }

  /** Get the front element. */
  public int peek() {
    if (empty()) {
      return -1;
    }
    if (pop.isEmpty()) {
      while (!push.isEmpty()) {
        pop.push(push.pop());
      }
    }
    return pop.peek();
  }

  /** Returns whether the queue is empty. */
  public boolean empty() {
    return push.isEmpty() && pop.isEmpty();
  }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
