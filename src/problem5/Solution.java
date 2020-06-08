package problem5;

class Solution {

  private char[] array;

  public String longestPalindrome(String s) {
    if (s.length() <= 1) {
      return s;
    }
    array = s.toCharArray();
    int left = 0, right = 0, length = 0, middle = array.length >> 1;
    for (int i = 0; i < array.length - 1; i++) {
      if (i > middle && (array.length - i - 1) * 2 + 1 <= length) {
        break;
      }
      int[] result1 = expand(i, i);
      int[] result2 = array[i] == array[i + 1] ? expand(i, i + 1) : new int[]{0, -1};
      int length1 = result1[1] - result1[0] + 1;
      int length2 = result2[1] - result2[0] + 1;
      if (Math.max(length1, length2) > length) {
        if (length1 > length2) {
          left = result1[0];
          right = result1[1];
          length = length1;
        } else {
          left = result2[0];
          right = result2[1];
          length = length2;
        }
      }
    }
    return s.substring(left, right + 1);
  }

  private int[] expand(int left, int right) {
    for (; left - 1 >= 0 && right + 1 < array.length && array[left - 1] == array[right + 1]; left--, right++) ;
    return new int[]{left, right};
  }
}

//  public String longestPalindrome1(String s) {
//    char[] array = s.toCharArray();
//    int length = array.length;
//    String maxStr = "";
//    boolean[][] result = new boolean[length][length];
//    for (int size = 0; size < length; size++) {
//      for (int begin = 0; begin < length; begin++) {
//        int end = begin + size;
//        if (end >= array.length) {
//          break;
//        }
//        result[begin][end] = size > 1 ?
//            result[begin + 1][end - 1] && array[begin] == array[end] : array[begin] == array[end];
//        if (result[begin][end] && size + 1 > maxStr.length()) {
//          maxStr = s.substring(begin, end + 1);
//        }
//      }
//    }
//    return maxStr;
//  }
