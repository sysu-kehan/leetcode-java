package doubleweek29.problem1;

class Solution {
  public double average(int[] salary) {
    int max = Math.max(salary[0], salary[1]);
    int min = Math.min(salary[0], salary[1]);
    double sum = 0;
    for (int i = 2; i < salary.length; i++) {
      int cur = salary[i];
      if (cur < min) {
        sum += min;
        min = cur;
      } else if (cur > max) {
        sum += max;
        max = cur;
      } else {
        sum += cur;
      }
    }
    return sum / (salary.length - 2);
  }
}
