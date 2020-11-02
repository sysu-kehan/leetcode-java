package problem1002;

import java.util.List;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    List<String> list1 = solution.commonChars(new String[]{"bella", "label", "roller"});
    List<String> list2 = solution.commonChars(new String[]{"cool", "lock", "cook"});
    System.out.println();
  }
}
