package problem1418;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    Solution solution = new Solution();
    print(solution.displayTable(generateData(new String[][]{
        {"David", "3", "Ceviche"}, {"Corina", "10", "Beef Burrito"},
        {"David", "3", "Fried Chicken"}, {"Carla", "5", "Water"},
        {"Carla", "5", "Ceviche"}, {"Rous", "3", "Ceviche"}
    })));
  }

  private static List<List<String>> generateData(String[][] data) {
    List<List<String>> result = new ArrayList<>();
    for (String[] items : data) {
      List<String> list = new ArrayList<>();
      list.add(items[0]);
      list.add(items[1]);
      list.add(items[2]);
      result.add(list);
    }
    return result;
  }

  private static void print(List<List<String>> data) {
    for (int i = 0; i < data.size(); i++) {
      System.out.println(Arrays.toString(data.get(i).toArray()));
    }
  }
}
