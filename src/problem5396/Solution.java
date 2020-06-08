package problem5396;

class Solution {
  public int maxPower(String s) {
    int max = 0;
    char cur = '\0';
    int count = 1;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != cur) {
        if (max < count) {
          max = count;
        }
        cur = s.charAt(i);
        count = 1;
      } else {
        count++;
      }
    }
    return Math.max(max, count);
  }
}
