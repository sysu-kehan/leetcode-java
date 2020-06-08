package problem1122;

import java.util.*;

class Solution {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int[] counts = new int[1001];
    int[] result = new int[arr1.length];
    for (int num : arr1) {
      counts[num]++;
    }
    int index = 0;
    for (int num : arr2) {
      int count = counts[num];
      Arrays.fill(result, index, index + count, num);
      index += count;
      counts[num] = 0;
    }
    for (int i = 0; i < counts.length; i++) {
      int count = counts[i];
      if (count != 0) {
        Arrays.fill(result, index, index + count, i);
        index += count;
      }
    }
    return result;
  }

  public int[] relativeSortArray1(int[] arr1, int[] arr2) {
    Map<Integer, Integer> map = new LinkedHashMap<>();
    List<Integer> others = new LinkedList<>();
    for (int i = 0; i < arr2.length; i++) {
      map.put(arr2[i], 0);
    }
    for (int i = 0; i < arr1.length; i++) {
      int cur = arr1[i];
      if (map.containsKey(cur)) {
        map.put(cur, (map.get(cur)) + 1);
      } else {
        int j = 0;
        for (; j < others.size(); j++) {
          if (cur < others.get(j)) {
            break;
          }
        }
        others.add(j, cur);
      }
    }
    int[] result = new int[arr1.length];
    int index = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      Arrays.fill(result, index, index + entry.getValue(), entry.getKey());
      index += entry.getValue();
    }
    for (int i = 0; i < others.size(); i++, index++) {
      result[index] = others.get(i);
    }
    return result;
  }
}
