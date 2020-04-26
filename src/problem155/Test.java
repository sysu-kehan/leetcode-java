package problem155;

public class Test {
  public static void main(String[] args) {
    MinStack minStack = new MinStack();
    for (int i = 0; i <= 16; i++) {
      minStack.push(-2);
    }
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    System.out.println(minStack.getMin() == -3);
    minStack.pop();
    System.out.println(minStack.top() == 0);
    System.out.println(minStack.getMin() == -2);
  }
}
