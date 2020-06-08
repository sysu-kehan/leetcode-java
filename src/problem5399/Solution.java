package problem5399;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {

  private List<Cost> costList;
  private List<String> resultList;

  public String largestNumber(int[] cost, int target) {
    costList = new LinkedList<>();
    resultList = new LinkedList<>();
    for (int i = 0; i < cost.length; i++) {
      int j = 0;
      boolean sign = false;
      for (; j < costList.size(); j++) {
        if (cost[i] < costList.get(j).cost) {
          break;
        } else if (cost[i] == costList.get(j).cost && (i + 1) > costList.get(j).num) {
          sign = true;
          break;
        }
      }
      if (sign) {
        costList.get(j).num = i + 1;
      } else {
        costList.add(j, new Cost(i + 1, cost[i]));
      }

    }
    largestNumber("", target);
    if (resultList.isEmpty()) {
      return "0";
    }
    int length = resultList.get(0).length();
    int lastIndex = 0;
    for (; lastIndex < resultList.size() && resultList.get(lastIndex).length() == length; lastIndex++);
    String result = "";
    for (int i = 0; i < lastIndex; i++) {
      String[] results = resultList.get(i).split("");
      Arrays.sort(results);
      StringBuilder temp = new StringBuilder();
      for (int j = results.length - 1; j >= 0; j--) {
        temp.append(results[j]);
      }
      if (temp.toString().compareTo(result) > 0) {
        result = temp.toString();
      }
    }
    return result;
  }

  private String largestNumber(String cur, int target) {
    for (Cost cost : costList) {
      if (cost.cost < target) {
        largestNumber(cur + cost.num, target - cost.cost);
      } else if (cost.cost == target) {
        String result = cur + cost.num;
        int i = 0;
        for (; i < resultList.size(); i++) {
          if (result.length() > resultList.get(i).length()) {
            break;
          }
        }
        resultList.add(i, result);
      }
    }
    return "";
  }

  private class Cost {
    int num;
    int cost;
    Cost(int num, int cost) {
      this.num = num;
      this.cost = cost;
    }
  }
}
