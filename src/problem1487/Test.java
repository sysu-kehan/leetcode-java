package problem1487;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(
        Arrays.toString(
            solution.getFolderNames(new String[]{"pes", "fifa", "gta", "pes(2019)"})
        )
    );
    System.out.println(
        Arrays.toString(
            solution.getFolderNames(new String[]{"gta", "gta(1)", "gta", "avalon"})
        )
    );
    System.out.println(
        Arrays.toString(
            solution.getFolderNames(new String[]{"onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece"})
        )
    );
    System.out.println(
        Arrays.toString(
            solution.getFolderNames(new String[]{"wano", "wano", "wano", "wano"})
        )
    );
    System.out.println(
        Arrays.toString(
            solution.getFolderNames(new String[]{"kaido", "kaido(1)", "kaido", "kaido(1)"})
        )
    );
    System.out.println(
        Arrays.toString(
            solution.getFolderNames(new String[]{"kaido", "kaido(1)", "kaido", "kaido(1)", "kaido(2)"})
        )
    );
  }
}
