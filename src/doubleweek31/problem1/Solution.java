package doubleweek31.problem1;

class Solution {
  public int countOdds(int low, int high) {
    int count = 0;
    for (int i = low % 2 == 1 ? low : low + 1; i <= high; i += 2) {
      count++;
    }
    return count;
  }
}
