package interview0401;

import java.util.*;

class Solution {
  public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
    boolean[] nodes = new boolean[n];
    Arrays.fill(nodes, false);
    Map<Integer, List<Integer>> path = new HashMap<>();
    for (int[] tmp : graph) {
      int source = tmp[0];
      int dest = tmp[1];
      if (source == dest) {
        continue;
      }
      if (path.containsKey(source)) {
        List<Integer> list = path.get(source);
        if (list.indexOf(dest) < 0) {
          list.add(dest);
        }
        path.put(source, list);
      } else {
        List<Integer> list = new ArrayList<>();
        list.add(dest);
        path.put(source, list);
      }
    }
    Stack<Integer> stack = new Stack<>();
    stack.push(start);
    nodes[start] = true;
    while (!stack.isEmpty()) {
      Integer node = stack.pop();
      if (node == target) {
        return true;
      }
      if (path.containsKey(node)) {
        List<Integer> list = path.get(node);
        for (int i = 0; i < list.size(); i++) {
          Integer next = list.get(i);
          if (!nodes[next]) {
            stack.push(next);
            nodes[next] = true;
          }
        }
      }
    }
    return false;
  }
}
