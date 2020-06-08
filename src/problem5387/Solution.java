package problem5387;

import java.util.*;

class Solution {

  private int count = 0;
  private List<List<Integer>> hats;

  public int numberWays(List<List<Integer>> hats) {
    this.hats = hats;
    this.count = 0;
    selectHats(new ArrayList<>(), new ArrayList<>());
    return count;
  }

  private void selectHats(List<Integer> hatList, List<Integer> indexList) {
    int minListIndex = -1;
    int minSize = Integer.MAX_VALUE;
    for (int i = 0; i < hats.size(); i++) {
      if (indexList.indexOf(i) < 0 && hats.get(i).size() < minSize) {
        minListIndex = i;
        minSize = hats.get(i).size();
      }
    }
    List<Integer> likeHatsList = hats.get(minListIndex);
    for (int i = 0; i < likeHatsList.size(); i++) {
      int likeHat = likeHatsList.get(i);
      if (hatList.indexOf(likeHat) < 0) {
        if (indexList.size() + 1 >= hats.size()) {
//      System.out.println(Arrays.toString(hatList.toArray()));
          this.count++;
          this.count = this.count % (int) (Math.pow(10, 9) + 7);
        } else {
          List<Integer> newHatList = new ArrayList<>(hatList);
          List<Integer> newIndexList = new ArrayList<>(indexList);
          newHatList.add(likeHat);
          newIndexList.add(minListIndex);
          selectHats(newHatList, newIndexList);
        }
      }
    }
  }
}
