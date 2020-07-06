package problem215;

import java.util.Arrays;

class Solution {

  public int findKthLargest(int[] nums, int k) {
    int[] temp = Arrays.copyOf(nums, nums.length);
    int left = 0, right = nums.length - 1;
    while (left + 10 <= right) {
      int middle = (left + right) >> 1;
      if (temp[left] < temp[middle]) {
        swap(temp, left, middle);
      }
      if (temp[middle] < temp[right]) {
        swap(temp, middle, right);
      }
      if (temp[left] < temp[middle]) {
        swap(temp, left, middle);
      }
      swap(temp, middle, right - 1);
      int sign = temp[right - 1];
      int i = left, j = right - 1;
      for (; ; ) {
        while (temp[++i] > sign) ;
        while (temp[--j] < sign) ;
        if (i < j) {
          swap(temp, i, j);
        } else {
          break;
        }
      }
      swap(temp, i, right - 1);
      if (i == k - 1) {
        return temp[i];
      }
      if (i > k - 1) {
        right = i - 1;
      } else {
        left = i + 1;
      }
    }
    for (int i = left + 1; i <= right; i++) {
      for (int j = i; j > left; j--) {
        if (temp[j] > temp[j - 1]) {
          swap(temp, j, j - 1);
        } else {
          break;
        }
      }
    }
    return temp[k - 1];
  }

  private void swap(int[] nums, int left, int right) {
    int temp = nums[left];
    nums[left] = nums[right];
    nums[right] = temp;
  }

  public int findKthLargest1(int[] nums, int k) {
    int[] heap = Arrays.copyOf(nums, nums.length);
    for (int i = 1; i < heap.length; i++) {
      int cur = i, curNum = heap[i];
      for (; cur > 0 && curNum > heap[(cur - 1) >> 1];
           heap[cur] = heap[(cur - 1) >> 1], cur = (cur - 1) >> 1)
        ;
      heap[cur] = curNum;
    }
    for (int i = 1, length = heap.length; i < k; i++) {
      int bound = length - i;
      int cur = heap[bound];
      int j = 0, child = 2 * j + 1;
      while (child < bound) {
        if (child + 1 < bound && heap[child + 1] > heap[child]) {
          child++;
        }
        if (cur < heap[child]) {
          heap[j] = heap[child];
          j = child;
        } else {
          break;
        }
        child = j * 2 + 1;
      }
      heap[j] = cur;
    }
    return heap[0];
  }
}
