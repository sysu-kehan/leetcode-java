package doubleweek31.problem2;

class Solution {
  public int numOfSubarrays(int[] arr) {
    int length = arr.length;
    int[] first = new int[length];
    int count = 0;
    for (int i = 0; i < length; i++) {
      if (arr[i] % 2 == 1) {
        count = (count + 1) % (int)(Math.pow(10, 9) + 7);
      }
    }
    first[0] = arr[0];
    for (int i = 1; i < length; i++) {
      first[i] = first[i - 1] + arr[i];
      if (first[i] % 2 == 1) {
        count = (count + 1) % (int)(Math.pow(10, 9) + 7);
      }
    }
    for (int begin = 1; begin < length; begin++) {
      for (int end = begin + 1; end < length; end++) {
        if ((first[end] - first[begin - 1]) % 2 == 1) {
          count = (count + 1) % (int)(Math.pow(10, 9) + 7);
        }
      }
    }
    return count;
  }
}
