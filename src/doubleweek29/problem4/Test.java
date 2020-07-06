package doubleweek29.problem4;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.minNumberOfSemesters(4, new int[][]{
        {2, 1}, {3, 1}, {1, 4}
    }, 2));
    System.out.println(solution.minNumberOfSemesters(5, new int[][]{
        {2, 1}, {3, 1}, {4, 1}, {1, 5}
    }, 2));
    System.out.println(solution.minNumberOfSemesters(9, new int[][]{
        {4, 8}, {3, 6}, {6, 8}, {7, 6}, {4, 2}, {4, 1}, {4, 7}, {3, 7}, {5, 2}, {5, 9}, {3, 4}, {6, 9}, {5, 7}
    }, 2));
    System.out.println(solution.minNumberOfSemesters(11, new int[][]{

    }, 2));
  }
}
