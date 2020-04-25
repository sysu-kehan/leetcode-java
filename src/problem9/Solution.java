package problem9;

class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0 || (x > 0 && x % 10 == 0)) {
      return false;
    }
    int tmp = x;
    int newValue = 0;
    while (tmp > 0) {
      newValue = newValue * 10 + tmp % 10;
      tmp /= 10;
    }
    return newValue == x;
  }
}
