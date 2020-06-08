package doubleweek27.problem2;

import java.util.Arrays;

class Solution {
  public boolean hasAllCodes(String s, int k) {
    char[] binary = new char[k];
    Arrays.fill(binary, '0');
    String sign = getString(binary);
    String cur = sign;
    do {
      if (s.contains(cur)) {
        for (int i = k - 1; i >= 0; i--) {
          if (binary[i] == '0') {
            binary[i] = '1';
            break;
          } else {
            binary[i] = '0';
          }
        }
      } else {
        return false;
      }
      cur = getString(binary);
    } while (!cur.equals(sign));
    return true;
  }

  private String getString(char[] result) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < result.length; i++) {
      stringBuilder.append(result[i]);
    }
    return stringBuilder.toString();
  }
}
