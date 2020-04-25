package problem705;

class MyHashSet {

  private Node[] nodes;
  final static private int DEFAULT_LENGTH = 2048;

  /**
   * Initialize your data structure here.
   */
  public MyHashSet() {
    nodes = new Node[DEFAULT_LENGTH];
  }

  public void add(int key) {
    Node newNode = new Node(key);
    int index = key & (DEFAULT_LENGTH - 1);
    if (nodes[index] == null) {
      nodes[index] = newNode;
    } else {
      Node cur = nodes[index];
      if (cur.val == key) {
        return;
      }
      for (Node next = cur.next; next != null; cur = next, next = next.next) {
        if (next.val == key) {
          return;
        }
      }
      cur.next = newNode;
    }
  }

  public void remove(int key) {
    int index = key & (DEFAULT_LENGTH - 1);
    if (nodes[index] != null) {
      Node cur = nodes[index];
      if (cur.val == key) {
        nodes[index] = cur.next;
        return;
      }
      for (Node next = cur.next; next != null; cur = next, next = next.next) {
        if (next.val == key) {
          cur.next = next.next;
          return;
        }
      }
    }
  }

  /**
   * Returns true if this set contains the specified element
   */
  public boolean contains(int key) {
    int index = key & (DEFAULT_LENGTH - 1);
    for (Node cur = nodes[index]; cur != null; cur = cur.next) {
      if (cur.val == key) {
        return true;
      }
    }
    return false;
  }

  private class Node {
    int val;
    Node next;

    Node(int val) {
      this.val = val;
    }
  }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
