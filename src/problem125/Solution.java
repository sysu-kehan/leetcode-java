package problem125;

class Solution {
  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
      while (i < j && !isDigitalOrAlpha(s.charAt(i))) {
        i++;
      }
      while (j > i && !isDigitalOrAlpha(s.charAt(j))) {
        j--;
      }
      if (j == i) {
        return true;
      }
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
    }
    return true;
  }

  private boolean isDigitalOrAlpha(char c) {
    return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
  }
}
