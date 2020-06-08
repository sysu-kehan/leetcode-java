package interview29;

class Solution {
  public int[] spiralOrder(int[][] matrix) {
    if (matrix.length == 0) {
      return new int[]{};
    }
    int height = matrix.length;
    int width = matrix[0].length;
    int length = width * height;
    int[] result = new int[length];
    int left = 0, right = width - 1, top = 0, bottom = height - 1;
    int count = 0;
    while (true) {
      for (int i = left; i <= right; i++) {
        result[count] = matrix[top][i];
        count++;
      }
      if (count >= length) {
        break;
      }
      top++;
      for (int i = top; i <= bottom; i++) {
        result[count] = matrix[i][right];
        count++;
      }
      if (count >= length) {
        break;
      }
      right--;
      for (int i = right; i >= left; i--) {
        result[count] = matrix[bottom][i];
        count++;
      }
      if (count >= length) {
        break;
      }
      bottom--;
      for (int i = bottom; i >= top; i--) {
        result[count] = matrix[i][left];
        count++;
      }
      if (count >= length) {
        break;
      }
      left++;
    }
    return result;
  }
}
