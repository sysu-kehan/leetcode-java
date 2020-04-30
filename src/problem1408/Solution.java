package problem1408;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> stringMatching(String[] words) {
    List<String> result = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      for (int j = 0; j < words.length; j++) {
        if (j != i && result.indexOf(words[j]) < 0 && words[i].contains(words[j])) {
          result.add(words[j]);
        }
      }
    }
    return result;
  }
}
