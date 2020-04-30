package problem1419;

class Solution {
  public int minNumberOfFrogs(String croakOfFrogs) {
    int[] counts = new int[5];
    int max = 0;
    for (char tmp : croakOfFrogs.toCharArray()) {
      int index;
      switch (tmp) {
        case 'c':
          index = 0;
          max = Math.max(max, counts[0] - counts[4]);
          break;
        case 'r':
          index = 1;
          break;
        case 'o':
          index = 2;
          break;
        case 'a':
          index = 3;
          break;
        default:
          index = 4;
          max = Math.max(max, counts[0] - counts[4]);
          break;
      }
      counts[index]++;
      if (index != 0 && counts[index] > counts[index - 1]) {
        return -1;
      }
    }
    return counts[0] == counts[1] && counts[1] == counts[2]
        && counts[2] == counts[3] && counts[3] == counts[4] ? max : -1;
  }
}
