package problem1418;

import java.util.*;

class Solution {
  public List<List<String>> displayTable(List<List<String>> orders) {
    Map[] table = new Map[501];
    List<String> foodItems = new ArrayList<>();
    for (int i = 0; i < orders.size(); i++) {
      List<String> order = orders.get(i);
      int id = Integer.valueOf(order.get(1));
      String food = order.get(2);
      if (foodItems.indexOf(food) < 0) {
        foodItems.add(food);
      }
      if (table[id] == null) {
        Map<String, Integer> map = new HashMap<>();
        map.put(food, 1);
        table[id] = map;
      } else {
        Map<String, Integer> map = table[id];
        if (map.containsKey(food)) {
          map.put(food, map.get(food) + 1);
        } else {
          map.put(food, 1);
        }
      }
    }
    List<List<String>> result = new ArrayList<>();
    Collections.sort(foodItems);
    foodItems.add(0, "Table");
    result.add(foodItems);
    List<String> list = new ArrayList<>();
    for (int j = 0; j < foodItems.size(); j++) {
      list.add("0");
    }
    for (int i = 0; i < 501; i++) {
      if (table[i] != null) {
        Map<String, Integer> map = table[i];
        Collections.fill(list, "0");
        list.set(0, i + "");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
          String food = entry.getKey();
          int count = entry.getValue();
          int index = foodItems.indexOf(food);
          list.set(index, count + "");
        }
        result.add(new ArrayList<>(list));
      }
    }
    return result;
  }
}
