package problem297;

import bean.TreeNode;

import java.util.Calendar;

public class Test {
  public static void main(String[] args) {
    Codec codec = new Codec();
//    System.out.println(
//        codec.serialize(TreeNode.generateTree(new Integer[]{1, 2, 3, null, null, 4, 5}))
//    );
    StringBuilder test = new StringBuilder();
    for (int i = 0; i < 1000; i++) {
      test.append((i + 1) + ",");
      test.append("null");
      if (i != 999) {
        test.append(",");
      }
    }
    Calendar c1 = Calendar.getInstance();
    TreeNode node = codec.deserialize(test.toString());
    Calendar c2 = Calendar.getInstance();
    System.out.println(c2.getTimeInMillis() - c1.getTimeInMillis());
    Calendar c3 = Calendar.getInstance();
    System.out.println(codec.serialize(node));
    Calendar c4 = Calendar.getInstance();
    System.out.println(c4.getTimeInMillis() - c3.getTimeInMillis());
  }
}
