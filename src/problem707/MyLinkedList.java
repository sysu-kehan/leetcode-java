package problem707;

class MyLinkedList {

  private Node head = null;
  private Node tail = null;
  private int size = 0;

  /** Initialize your data structure here. */
  public MyLinkedList() {

  }

  /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
  public int get(int index) {
    if (!isIndexValid(index)) {
      return -1;
    }
    Node n = getElementAtIndex(index);
    return n.val;
  }

  /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
  public void addAtHead(int val) {
    final Node h = head;
    final Node newNode = new Node(val, null, h);
    head = newNode;
    if (tail == null) {
      tail = newNode;
    } else {
      h.prev = newNode;
    }
    size++;
  }

  /** Append a node of value val to the last element of the linked list. */
  public void addAtTail(int val) {
    final Node t = tail;
    final Node newNode = new Node(val, t, null);
    tail = newNode;
    if (head == null) {
      head = newNode;
    } else {
      t.next = newNode;
    }
    size++;
  }

  /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
  public void addAtIndex(int index, int val) {
    if (!isIndexValidForAdd(index)) {
      return;
    }
    if (index == size) {
      addAtTail(val);
    } else {
      Node n = getElementAtIndex(index);
      final Node prev = n.prev;
      final Node newNode = new Node(val, prev, n);
      n.prev = newNode;
      if (prev == null) {
        head = newNode;
      } else {
        prev.next = newNode;
      }
      size++;
    }
  }

  /** Delete the index-th node in the linked list, if the index is valid. */
  public void deleteAtIndex(int index) {
    if (!isIndexValid(index)) {
      return;
    }
    Node n = getElementAtIndex(index);
    final Node prev = n.prev;
    final Node next = n.next;
    if (prev == null) {
      head = next;
    } else {
      prev.next = next;
      n.prev = null;
    }
    if (next == null) {
      tail = prev;
    } else {
      next.prev = prev;
      n.prev = null;
    }
    size--;
  }

  private Node getElementAtIndex(int index) {
    Node n;
    if (index < size >> 1) {
      n = head;
      for (int i = 0; i < index; n = n.next, i++);
    } else {
      n = tail;
      for (int i = size - 1; i > index; n = n.prev, i--);
    }
    return n;
  }

  private boolean isIndexValid(int index) {
    return index >= 0 && index < size;
  }

  private boolean isIndexValidForAdd(int index) {
    return index >= 0 && index <= size;
  }

  private class Node {
    int val;
    Node prev;
    Node next;
    public Node(int val, Node prev, Node next) {
      this.val = val;
      this.prev = prev;
      this.next = next;
    }
  }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
