package problem1487;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public String[] getFolderNames(String[] names) {
    String[] result = new String[names.length];
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < names.length; i++) {
      String name = names[i];
      if (map.containsKey(name)) {
        int count = map.get(name);
        count++;
        String newName = name + "(" + count + ")";
        while (map.containsKey(newName)) {
          count++;
          newName = name + "(" + count + ")";
        }
        result[i] = newName;
        map.put(name, count);
        map.put(newName, 0);
      } else {
        result[i] = name;
        map.put(name, 0);
      }
    }
    return result;
  }
}
