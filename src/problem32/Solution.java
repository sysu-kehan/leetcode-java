package problem32;

class Solution {
  public int longestValidParentheses(String s) {
    int[] counts = new int[s.length()];
    int max = 0;
    for (int i = 1; i < counts.length; i++) {
      if (s.charAt(i) == ')') {
        if (s.charAt(i - 1) == '(') {
          counts[i] = (i - 2 >= 0 ? counts[i - 2] : 0) + 2;
        } else {
          if (i - counts[i - 1] - 1 >= 0 && s.charAt(i - counts[i - 1] - 1) == '(') {
            counts[i] = counts[i - 1] + (i - counts[i - 1] - 2 >= 0 ? counts[i - counts[i - 1] - 2] : 0) + 2;
          }
        }
        max = Math.max(max, counts[i]);
      }
    }
    return max;
  }
}
