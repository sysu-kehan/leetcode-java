package problem1404;

class Solution {
  public int numSteps(String s) {
    char[] array = s.toCharArray();
    int right = array.length - 1;
    int count = 0;
    while (right > 0) {
      if (array[right] == '0') {
        right--;
        count++;
      } else {
        count += 2;
        for (right--; right >= 0;) {
          if (array[right] == '1') {
            count++;
            right--;
          } else {
            break;
          }
        }
        if (right < 0) {
          return count;
        }
        array[right] = '1';
      }
    }
    return count;
  }
}
