package problem378;

class Solution {

  private int[][] matrix;

  public int kthSmallest(int[][] matrix, int k) {
    this.matrix = matrix;
    int[] result = merge(0, matrix.length - 1);
    return result[k - 1];
  }

  private int[] merge(int begin, int end) {
    if (begin == end) {
      return matrix[begin];
    } else if (begin + 1 == end) {
      return merge(matrix[begin], matrix[end]);
    } else {
      int middle = (begin + end) >> 1;
      return merge(merge(begin, middle), merge(middle + 1, end));
    }
  }

  private int[] merge(int[] a, int[] b) {
    int[] result = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;
    while (i < result.length) {
      if (j < a.length && k < b.length) {
        result[i++] = a[j] < b[k] ? a[j++] : b[k++];
      } else {
        result[i++] = j < a.length ? a[j++] : b[k++];
      }
    }
    return result;
  }

  public int kthSmallest1(int[][] matrix, int k) {
    int[] index = new int[matrix.length];
    for (; k > 0; k--) {
      int sign = -1;
      for (int i = 0; i < matrix.length; i++) {
        if (index[i] < matrix[i].length) {
          sign = i;
          break;
        }
      }
      int min = matrix[sign][index[sign]];
      for (int i = 1; i < index.length; i++) {
        if (index[i] >= matrix[i].length) {
          continue;
        }
        int cur = matrix[i][index[i]];
        if (cur < min) {
          sign = i;
          min = cur;
        }
      }
      if (k == 1) {
        return min;
      }
      index[sign]++;
    }
    return -1;
  }
}
