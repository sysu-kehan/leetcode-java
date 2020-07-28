package problem1483;

class Solution {
  public static void main(String[] args) {
    TreeAncestor obj = new TreeAncestor(7, new int[]{-1, 0, 0, 1, 1, 2, 2});
    System.out.println(obj.getKthAncestor(3, 1));
    System.out.println(obj.getKthAncestor(5, 2));
    System.out.println(obj.getKthAncestor(6, 3));
    TreeAncestor obj1 = new TreeAncestor(16, new int[]{-1, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7});
    obj1.getKthAncestor(7, 5);
  }
}
