package problem1414;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public int findMinFibonacciNumbers(int k) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(1);
    for (int i = 2, sum = 0; sum < k; i++) {
      sum = list.get(i - 2) + list.get(i - 1);
      list.add(sum);
    }
    int index = list.size() - 1;
    int count = 0;
    while (k > 0) {
      for (; list.get(index) > k; index--);
      count++;
      k -= list.get(index);
    }
    return count;
  }
}
