package problem845;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.longestMountain(new int[]{2, 1, 4, 7, 3, 2, 5}));
    System.out.println(solution.longestMountain(new int[]{2, 2, 2}));
    System.out.println(solution.longestMountain(new int[]{0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0}));
    System.out.println(solution.longestMountain(new int[]{875, 884, 239, 731, 723, 685}));
    System.out.println(solution.longestMountain(new int[]{
        0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1
    }));
  }
}
