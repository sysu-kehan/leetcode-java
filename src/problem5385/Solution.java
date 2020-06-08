package problem5385;

class Solution {
  public int maxDiff(int num) {
    char[] num1 = (num + "").toCharArray();
    char[] num2 = (num + "").toCharArray();
    int firstNotNineIndex = -1;
    int firstNotZeroIndex = num2[0] == '1' ? -1 : 0;
    for (int i = 0; i < num1.length; i++) {
      if (num1[i] != '9') {
        firstNotNineIndex = i;
        break;
      }
    }
    if (firstNotZeroIndex < 0) {
      for (int i = 1; i < num2.length; i++) {
        if (num2[i] != '0' && num2[i] != '1') {
          firstNotZeroIndex = i;
          break;
        }
      }
    }
    String a = "";
    if (firstNotNineIndex >= 0) {
      char replace = num1[firstNotNineIndex];
      for (int i = 0; i < num1.length; i++) {
        if (num1[i] == replace) {
          num1[i] = '9';
        }
        a += num1[i];
      }
    }
    String b = "";
    if (firstNotZeroIndex >= 0) {
      char replace = num2[firstNotZeroIndex];
      char first = num2[0];
      for (int i = 0; i < num2.length; i++) {
        if (num2[i] == replace) {
          num2[i] = first == '1' ? '0' : '1';
        }
        b += num2[i];
      }
    }

    int newNum1 = firstNotNineIndex < 0 ? num : Integer.parseInt(a);
    int newNum2 = firstNotZeroIndex < 0 ? num : Integer.parseInt(b);
    return newNum1 - newNum2;
  }
}
