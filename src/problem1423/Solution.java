package problem1423;

class Solution {
  public int maxScore(int[] cardPoints, int k) {
    int deleteCount = cardPoints.length - k;
    int sum = 0;
    for (int i = 0; i < cardPoints.length; i++) {
      sum += cardPoints[i];
    }
    if (deleteCount <= 0) {
      return sum;
    } else {
      int left = 0;
      int right = deleteCount - 1;
      int deleteNum = 0;
      for (int i = left; i <= right; i++) {
        deleteNum += cardPoints[i];
      }
      int min = deleteNum;
      for (left++, right++; right < cardPoints.length; left++, right++) {
        deleteNum = deleteNum - cardPoints[left - 1] + cardPoints[right];
        min = Math.min(min, deleteNum);
      }
      return sum - min - 1;
    }
  }
}
