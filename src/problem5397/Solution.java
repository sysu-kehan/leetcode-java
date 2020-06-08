package problem5397;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> simplifiedFractions(int n) {
    List<String> result = new ArrayList<>();
    for (int i = 2; i <= n; i++) {
      for (int j = 1; j < i; j++) {
        boolean sign = true;
        for (int k = 2; k <= j; k++) {
          if (i % k == 0 && j % k == 0) {
            sign = false;
            break;
          }
        }
        if (sign) {
          result.add(j + "/" + i);
        }
      }
    }
    return result;
  }
}
