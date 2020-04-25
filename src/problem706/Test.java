package problem706;

public class Test {
  public static void main(String[] args) {
    MyHashMap hashMap = new MyHashMap();
    hashMap.put(1, 1);
    hashMap.put(2, 2);
    print(hashMap.get(1) == 1); // 返回 1
    print(hashMap.get(3) == -1); // 返回 -1 (未找到)
    hashMap.put(2, 1);  // 更新已有的值
    print(hashMap.get(2) == 1); // 返回 1
    hashMap.remove(2);  // 删除键为2的数据
    print(hashMap.get(2) == -1); // 返回 -1 (未找到)
  }

  private static void print(boolean result) {
    System.out.println(result);
  }
}
