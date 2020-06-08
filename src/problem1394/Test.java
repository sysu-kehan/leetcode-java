package problem1394;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.findLucky(new int[]{2, 2, 3, 4}));
    System.out.println(solution.findLucky(new int[]{1, 2, 2, 3, 3, 3}));
    System.out.println(solution.findLucky(new int[]{2, 2, 2, 3, 3}));
    System.out.println(solution.findLucky(new int[]{5}));
    System.out.println(solution.findLucky(new int[]{7, 7, 7, 7, 7, 7, 7}));
  }
}
