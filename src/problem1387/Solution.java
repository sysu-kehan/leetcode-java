package problem1387;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

  private Map<Integer, Integer> map = new HashMap<>();

  public int getKth(int lo, int hi, int k) {
    map.clear();
    map.put(1, 0);
    int length = hi - lo + 1;
    Number[] trans = new Number[length];
    for (int i = 0; i < length; i++) {
      trans[i] = new Number(lo + i);
    }
//    for (int i = 0; i < length; i++) {
//      trans[i] = new Number(hi - i);
//    }
    Arrays.sort(trans, (o1, o2) -> {
      if (o1.step > o2.step) {
        return 1;
      } else if (o1.step < o2.step) {
        return -1;
      } else {
        return o1.number - o2.number;
      }
    });
    return trans[k - 1].number;
  }

  private class Number {
    int number;
    int step;

    public Number(int number) {
      this.number = number;
      this.step = getStep(number);
    }
  }

  private int getStep(int number) {
    if (map.containsKey(number)) {
      return map.get(number);
    }
    int nextNumber = number % 2 == 0 ? number / 2 : 3 * number + 1;
    map.put(number, getStep(nextNumber) + 1);
    return map.get(number);
  }
}
