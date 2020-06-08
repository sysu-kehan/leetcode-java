package problem1395;

class Solution {
  public int numTeams(int[] rating) {
    int count = 0;
    for (int i = 1; i < rating.length - 1; i++) {
      int mid = rating[i];
      int prevMin = 0;
      int prevMax = 0;
      int postMin = 0;
      int postMax = 0;
      for (int j = i - 1; j >= 0; j--) {
        if (rating[j] > mid) {
          prevMax++;
        } else if (rating[j] < mid) {
          prevMin++;
        }
      }
      for (int j = i + 1; j < rating.length; j++) {
        if (rating[j] > mid) {
          postMax++;
        } else if (rating[j] < mid) {
          postMin++;
        }
      }
      count = count + prevMax * postMin + prevMin * postMax;
    }
    return count;
  }

  public int numTeams1(int[] rating) {
    int count = 0;
    for (int i = 0; i < rating.length; i++) {
      for (int j = i + 1; j < rating.length; j++) {
        if (rating[i] == rating[j]) {
          continue;
        }
        for (int k = j + 1; k < rating.length; k++) {
          if (rating[i] < rating[j] && rating[j] < rating[k]) {
            count++;
          }
          if (rating[i] > rating[j] && rating[j] > rating[k]) {
            count++;
          }
        }
      }
    }
    return count;
  }
}
