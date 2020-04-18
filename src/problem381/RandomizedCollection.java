package problem381;

import java.util.Arrays;

class RandomizedCollection {

  private int[] elements;
  private int size = 0;
  final static private int DEAFULT_LENGTH = 10;

  /** Initialize your data structure here. */
  public RandomizedCollection() {

  }

  /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
  public boolean insert(int val) {
    ensureCapacity(size + 1);
    elements[size++] = val;
    return true;
  }

  private void ensureCapacity(int minCapacity) {
    if (elements == null) {
      elements = new int[minCapacity > DEAFULT_LENGTH ? minCapacity : DEAFULT_LENGTH];
      return;
    }
    if (elements.length < minCapacity) {
      int newLength = minCapacity << 1;
      //  越界了
      if (newLength < 0) {
        newLength = Integer.MAX_VALUE;
      }
      elements = Arrays.copyOf(elements, newLength);
    }
  }

  /** Removes a value from the collection. Returns true if the collection contained the specified element. */
  public boolean remove(int val) {
    int index = getIndexByVal(val);
    if (index < 0) {
      return false;
    }
    System.arraycopy(elements, index + 1, elements, index, size - index - 1);
    size--;
    return true;
  }

  private int getIndexByVal(int val) {
    for (int i = 0; i < size; i++) {
      if (elements[i] == val) {
        return i;
      }
    }
    return -1;
  }

  /** Get a random element from the collection. */
  public int getRandom() {
    return elements[(int)Math.floor(Math.random() * size)];
  }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */