package problem1024;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.videoStitching(new int[][]{
        {0, 2}, {4, 6}, {8, 10}, {1, 9}, {1, 5}, {5, 9}
    }, 10));
    System.out.println(solution.videoStitching(new int[][]{
        {0, 1}, {1, 2}
    }, 5));
    System.out.println(solution.videoStitching(new int[][]{
        {0, 1}, {6, 8}, {0, 2}, {5, 6}, {0, 4}, {0, 3}, {6, 7}, {1, 3},
        {4, 7}, {1, 4}, {2, 5}, {2, 6}, {3, 4}, {4, 5}, {5, 7}, {6, 9}
    }, 9));
    System.out.println(solution.videoStitching(new int[][]{
        {0, 4}, {2, 8}
    }, 5));
    System.out.println(solution.videoStitching(new int[][]{
        {0, 5}, {1, 6}, {2, 7}, {3, 8}, {4, 9}, {5, 10}, {6, 11}, {7, 12},
        {8, 13}, {9, 14}, {10, 15}, {11, 16}, {12, 17}, {13, 18}, {14, 19},
        {15, 20}, {16, 21}, {17, 22}, {18, 23}, {19, 24}, {20, 25}, {21, 26},
        {22, 27}, {23, 28}, {24, 29}, {25, 30}, {26, 31}, {27, 32}, {28, 33},
        {29, 34}, {30, 35}, {31, 36}, {32, 37}, {33, 38}, {34, 39}, {35, 40},
        {36, 41}, {37, 42}, {38, 43}, {39, 44}, {40, 45}, {41, 46}, {42, 47},
        {43, 48}, {44, 49}, {45, 50}, {46, 51}, {47, 52}, {48, 53}, {49, 54}
    }, 50));
  }
}
