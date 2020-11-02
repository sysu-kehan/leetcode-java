package problem771;

class Solution {
  public int numJewelsInStones(String J, String S) {
    int[] counts = new int[58];
    for (int i = 0; i < S.length(); i++) {
      counts[S.charAt(i) - 'A']++;
    }
    int sum = 0;
    for (int i = 0; i < J.length(); i++) {
      sum += counts[J.charAt(i) - 'A'];
    }
    return sum;
  }
}
