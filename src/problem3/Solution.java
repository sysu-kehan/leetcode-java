package problem3;

class Solution {

  public int lengthOfLongestSubstring(String s) {
    int[] sign = new int[256];
    int left = 0, right = -1, result = 0;
    while (right + 1 < s.length()) {
      if (sign[s.charAt(right + 1)] == 0) {
        sign[s.charAt(++right)]++;
        result = Math.max(result, right - left + 1);
      } else {
        sign[s.charAt(left++)]--;
      }
    }
    return result;
  }

  public int lengthOfLongestSubstring1(String s) {
    char[] array = s.toCharArray();
    StringBuilder pre = new StringBuilder();
    int result = 0;
    for (int i = 0; i < array.length; i++) {
      if (result > array.length - i + pre.length()) {
        break;
      }
      char cur = array[i];
      int index = pre.indexOf(cur + "");
      if (index >= 0) {
        pre.delete(0, index + 1);
      }
      pre.append(cur);
      result = Math.max(result, pre.length());
    }
    return result;
  }
}
