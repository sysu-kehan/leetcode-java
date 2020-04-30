package problem1424;

import java.util.*;

class Solution {
  public int[] findDiagonalOrder(List<List<Integer>> nums) {
    Map<Integer, Stack<Integer>> map = new TreeMap<>();
    int length = 0;
    for (int i = 0; i < nums.size(); i++) {
      List<Integer> list = nums.get(i);
      for (int j = 0; j < list.size(); j++) {
        int key = i + j;
        int value = list.get(j);
        length++;
        if (map.containsKey(key)) {
          map.get(key).push(value);
        } else {
          Stack<Integer> stack = new Stack<>();
          stack.push(value);
          map.put(key, stack);
        }
      }
    }
    int[] result = new int[length];
    int count = 0;
    for (Stack<Integer> stack : map.values()) {
      while (!stack.isEmpty()) {
        result[count++] = stack.pop();
      }
    }
    return result;
  }
}
