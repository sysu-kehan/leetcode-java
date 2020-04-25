package problem706;

class MyHashMap {

  private Node[] nodes;
  final static private int DEFAULT_LENGTH = 2048;

  /** Initialize your data structure here. */
  public MyHashMap() {
    nodes = new Node[DEFAULT_LENGTH];
  }

  /** value will always be non-negative. */
  public void put(int key, int value) {
    Node newNode = new Node(key, value);
    int index = key & (DEFAULT_LENGTH - 1);
    if (nodes[index] == null) {
      nodes[index] = newNode;
    } else {
      Node cur = nodes[index];
      if (cur.key == key) {
        cur.val = value;
        return;
      }
      for (Node next = cur.next; next != null; cur = next, next = next.next) {
        if (next.key == key) {
          next.val = value;
          return;
        }
      }
      cur.next = newNode;
    }
  }

  /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
  public int get(int key) {
    int index = key & (DEFAULT_LENGTH - 1);
    for (Node cur = nodes[index]; cur != null; cur = cur.next) {
      if (cur.key == key) {
        return cur.val;
      }
    }
    return -1;
  }

  /** Removes the mapping of the specified value key if this map contains a mapping for the key */
  public void remove(int key) {
    int index = key & (DEFAULT_LENGTH - 1);
    if (nodes[index] != null) {
      Node cur = nodes[index];
      if (cur.key == key) {
        nodes[index] = cur.next;
        return;
      }
      for (Node next = cur.next; next != null; cur = next, next = next.next) {
        if (next.key == key) {
          cur.next = next.next;
          return;
        }
      }
    }
  }

  private class Node {
    int key;
    int val;
    Node next;

    Node(int key, int val) {
      this.key = key;
      this.val = val;
    }
  }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */