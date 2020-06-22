package problem1481;

import java.util.*;

class Solution {

  public int findLeastNumOfUniqueInts(int[] arr, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : arr) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }
    List<Integer> list = new ArrayList<>(map.values());
    Collections.sort(list);
    int index = -1;
    for (int i = 0; i < list.size(); i++) {
      int count = list.get(i);
      if (count > k) {
        break;
      }
      k -= count;
      index = i;
    }
    return list.size() - index - 1;
  }
}
