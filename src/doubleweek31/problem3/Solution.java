package doubleweek31.problem3;

class Solution {
  public int numSplits(String s) {
    int[] array1 = new int[26];
    int[] array2 = new int[26];
    int diff1 = 0;
    int diff2 = 0;
    for (int i = 0; i < s.length(); i++) {
      int index = s.charAt(i) - 'a';
      if (array2[index] == 0) {
        diff2++;
      }
      array2[index]++;
    }
    int count = 0;
    for (int i = 0; i < s.length() - 1; i++) {
      int index = s.charAt(i) - 'a';
      if (array1[index] == 0) {
        diff1++;
      }
      array1[index]++;
      array2[index]--;
      if (array2[index] == 0) {
        diff2--;
      }
      if (diff1 == diff2) {
        count++;
      }
    }
    return count;
  }
}
