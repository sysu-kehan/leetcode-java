package problem1415;

import java.util.ArrayList;
import java.util.List;

class Solution {

  public String getHappyString(int n, int k) {
    if (3 * Math.pow(2, n - 1) < k) {
      return "";
    }
    if (n == 1) {
      return k == 1 ? "a" : k == 2 ? "b" : "c";
    }
    int index = 1;
    for (; k > index * Math.pow(2, n - 1); index++) ;
    char begin = index == 1 ? 'a' : index == 2 ? 'b' : 'c';
    int count = k - (index - 1) * (int) Math.pow(2, n - 1);
    char[] tree = new char[(int) Math.pow(2, n - 1) - 1 + count];
    tree[0] = begin;
    for (int i = 0; i * 2 + 1 < tree.length; i++) {
      char left, right;
      switch (tree[i]) {
        case 'a':
          left = 'b';
          right = 'c';
          break;
        case 'b':
          left = 'a';
          right = 'c';
          break;
        default:
          left = 'a';
          right = 'b';
          break;
      }
      tree[i * 2 + 1] = left;
      if (i * 2 + 2 < tree.length) {
        tree[i * 2 + 2] = right;
      }
    }
    String result = "";
    for (int i = tree.length - 1; i > 0; i = (i - 1) / 2) {
      result = tree[i] + result;
    }
    return begin + result;
  }

  public String getHappyString1(int n, int k) {
    if (3 * Math.pow(2, n - 1) < k) {
      return "";
    }
    if (n == 1) {
      return k == 1 ? "a" : k == 2 ? "b" : "c";
    }
    List<String> list = new ArrayList<>();
    list.addAll(getHappyString("a", n - 1));
    list.addAll(getHappyString("b", n - 1));
    list.addAll(getHappyString("c", n - 1));
    return list.get(k - 1);
  }

  private List<String> getHappyString(String s, int n) {
    List<String> result = new ArrayList<>();
    String new1 = s, new2 = s;
    switch (s.charAt(s.length() - 1)) {
      case 'a':
        new1 += 'b';
        new2 += 'c';
        break;
      case 'b':
        new1 += 'a';
        new2 += 'c';
        break;
      default:
        new1 += 'a';
        new2 += 'b';
        break;
    }
    if (n == 1) {
      result.add(new1);
      result.add(new2);
      return result;
    }
    result.addAll(getHappyString(new1, n - 1));
    result.addAll(getHappyString(new2, n - 1));
    return result;
  }
}
