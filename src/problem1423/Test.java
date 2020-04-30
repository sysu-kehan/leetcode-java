package problem1423;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int result1 = solution.maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3);
//    System.out.println(result1);
    System.out.println(result1 == 12);
    int result2 = solution.maxScore(new int[]{2, 2, 2}, 2);
//    System.out.println(result2);
    System.out.println(result2 == 4);
    int result3 = solution.maxScore(new int[]{9, 7, 7, 9, 7, 7, 9}, 7);
//    System.out.println(result3);
    System.out.println(result3 == 55);
    int result4 = solution.maxScore(new int[]{1, 1000, 1}, 1);
//    System.out.println(result4);
    System.out.println(result4 == 1);
    int result5 = solution.maxScore(new int[]{1, 79, 80, 1, 1, 1, 200, 1}, 3);
//    System.out.println(result5);
    System.out.println(result5 == 202);
    int result6 = solution.maxScore(new int[]{
        53, 14, 91, 35, 51, 9, 80, 27, 6, 15, 77, 86, 34, 62, 55, 45, 91, 45, 23,
        75, 66, 42, 62, 13, 34, 18, 89, 67, 93, 83, 100, 14, 92, 73, 48, 2, 47,
        93, 99, 100, 88, 84, 48}, 43);
    System.out.println(result6);
    int result7 = solution.maxScore(new int[]{
        61, 5, 22, 64, 14, 16, 93, 28, 7, 99, 8, 17, 2, 83, 9, 88, 16, 97, 33, 50,
        78, 5, 78, 100, 100, 44, 43, 73, 14, 31, 1, 72, 93, 42, 48, 49, 3, 26, 59, 8
        , 20, 39, 40, 67, 27}, 34);
    System.out.println(result7);
  }
}
