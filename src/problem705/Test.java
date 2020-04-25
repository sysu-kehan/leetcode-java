package problem705;

public class Test {
  public static void main(String[] args) {
    MyHashSet hashSet = new MyHashSet();
    hashSet.add(1);
    hashSet.add(2);
    print(hashSet.contains(1));  // 返回 true
    print(hashSet.contains(3) == false);  // 返回 false (未找到)
    hashSet.add(2);
    print(hashSet.contains(2));  // 返回 true
    hashSet.remove(2);
    print(hashSet.contains(2) == false);  // 返回  false (已经被删除)
  }

  private static void print(boolean result) {
    System.out.println(result);
  }
}
