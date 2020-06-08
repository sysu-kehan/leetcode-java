package interview46;

class Solution {

  private int count;

  public int translateNum(int num) {
    count = 0;
    search(String.valueOf(num));
    return count;
  }

  private void search(String num) {
    if (num.length() <= 2) {
      int cur = Integer.parseInt(num);
      count += cur >= 10 && cur < 26 ? 2 : 1;
      return;
    }
    int prefix = Integer.parseInt(num.substring(0, 2));
    if (prefix >= 10 && prefix < 26) {
      search(num.substring(2));
    }
    search(num.substring(1));
  }
}
