package problem1422;

class Solution {
  public int maxScore(String s) {
    int[] scores = new int[s.length() - 1];
    int result = s.charAt(0) == '0' ? 1 : 0;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == '1') {
        result++;
      }
    }
    scores[0] = result;
    for (int i = 1; i < s.length() - 1; i++) {
      scores[i] = s.charAt(i) == '1' ? scores[i - 1] - 1 : scores[i - 1] + 1;
    }
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] > max) {
        max = scores[i];
      }
    }
    return max;
  }
}
