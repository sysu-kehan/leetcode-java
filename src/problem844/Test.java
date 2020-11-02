package problem844;

public class Test {
  public static void main(String[] args) {
    Solution soltuion = new Solution();
    System.out.println(soltuion.backspaceCompare("ab#c", "ad#c"));
    System.out.println(soltuion.backspaceCompare("ab##", "c#d#"));
    System.out.println(soltuion.backspaceCompare("a##c", "#a#c"));
    System.out.println(soltuion.backspaceCompare("a#c", "b"));
  }
}
