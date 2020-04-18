package problem381;

public class Test {
  public static void main(String[] args) {
    RandomizedCollection obj = new RandomizedCollection();
    print(obj.insert(2) == true);
    print(obj.insert(3) == true);
    print(obj.remove(4) == false);
    print(obj.insert(3) == true);
    print(obj.insert(4) == true);
    print(obj.remove(2) == true);
    print(obj.remove(2) == false);
    print(obj.getRandom());
    print(obj.getRandom());
    print(obj.getRandom());
    print(obj.getRandom());
    print(obj.getRandom());
    print(obj.getRandom());
  }

  private static void print(boolean result) {
    System.out.println(result);
  }

  private static void print(int result) {
    System.out.println(result);
  }
}
