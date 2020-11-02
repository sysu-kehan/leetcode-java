package problem1024;

class Solution {
  public int videoStitching(int[][] clips, int T) {
    boolean[] use = new boolean[clips.length];
    int result = videoStitching(clips, use, 0, T);
    return result < 0 ? -1 : result;
  }

  private int videoStitching(int[][] clips, boolean[] use, int begin, int end) {
    if (begin >= end) {
      return 0;
    }
    int startIndex = -1;
    int endIndex = -1;
    int startLength = -1;
    int endLength = -1;
    for (int i = 0; i < use.length; i++) {
      if (!use[i]) {
        int clipBegin = clips[i][0];
        int clipEnd = clips[i][1];
        if (clipBegin <= begin && clipEnd >= end) {
          return 1;
        }
        int length = clipEnd - clipBegin;
        if (clipBegin <= begin && clipEnd - begin > startLength) {
          startIndex = i;
          startLength = clipEnd - begin;
        }
        if (clipEnd >= end && end - clipBegin > endLength) {
          endIndex = i;
          endLength = end - clipBegin;
        }
      }
    }
    if (startIndex == -1 || endIndex == -1) {
      return Integer.MIN_VALUE;
    }
    use[startIndex] = true;
    use[endIndex] = true;
    return videoStitching(clips, use, clips[startIndex][1], clips[endIndex][0]) + 2;
  }
}
