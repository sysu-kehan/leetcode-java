package problem925;

class Solution {
  public boolean isLongPressedName(String name, String typed) {
    if (name.charAt(0) != typed.charAt(0)) {
      return false;
    }
    int i = 1, j = 1;
    for (; i < name.length(); i++) {
      char pre = name.charAt(i - 1);
      char cur = name.charAt(i);
      for (; j < typed.length(); j++) {
        if (typed.charAt(j) == cur) {
          j++;
          break;
        }
        if (typed.charAt(j) != pre) {
          return false;
        }
      }
      if (j >= typed.length() && typed.charAt(j - 1) != name.charAt(name.length() - 1)) {
        return false;
      }
    }
    for (; j < typed.length(); j++) {
      if (typed.charAt(j - 1) != typed.charAt(j)) {
        return false;
      }
    }
    return true;
  }
}
