package problem225;

public class Test {
  public static void main(String[] args) {
    MyStack obj = new MyStack();
    obj.push(1);
    System.out.println(obj.top() == 1);
    System.out.println(obj.pop() == 1);
    System.out.println(obj.empty());
    obj.push(1);
    obj.push(2);
    obj.push(3);
    System.out.println(obj.top() == 3);
    System.out.println(obj.empty() == false);
    System.out.println(obj.pop() == 3);
    System.out.println(obj.pop() == 2);
    System.out.println(obj.top() == 1);
    System.out.println(obj.pop() == 1);
    System.out.println(obj.empty());
  }
}
