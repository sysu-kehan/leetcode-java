package problem802;

import java.util.*;

class Solution {

  public List<Integer> eventualSafeNodes(int[][] graph) {
    int length = graph.length;
    List<Set<Integer>> graphs = new ArrayList<>();
    List<Set<Integer>> rgraphs = new ArrayList<>();
    boolean[] signs = new boolean[length];
    for (int i = 0; i < length; i++) {
      graphs.add(new HashSet<>());
      rgraphs.add(new HashSet<>());
      signs[i] = false;
    }
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < graph.length; i++) {
      int[] dest = graph[i];
      if (dest.length <= 0) {
        queue.add(i);
      } else {
        for (int j = 0; j < dest.length; j++) {
          graphs.get(i).add(dest[j]);
          rgraphs.get(dest[j]).add(i);
        }
      }
    }
    while (!queue.isEmpty()) {
      int cur = queue.poll();
      signs[cur] = true;
      for (int i : rgraphs.get(cur)) {
        graphs.get(i).remove(cur);
        if (graphs.get(i).isEmpty()) {
          queue.add(i);
        }
      }
    }
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < length; i++) {
      if (signs[i]) {
        result.add(i);
      }
    }
    return result;
  }
}
