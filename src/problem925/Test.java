package problem925;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.isLongPressedName("alex", "aaleex"));
    System.out.println(solution.isLongPressedName("saeed", "ssaaedd"));
    System.out.println(solution.isLongPressedName("leelee", "lleeelee"));
    System.out.println(solution.isLongPressedName("laiden", "laiden"));
    System.out.println(solution.isLongPressedName("kikcxmvzi", "kiikcxxmmvvzz"));
    System.out.println(solution.isLongPressedName("alex", "alexxr"));
  }
}
