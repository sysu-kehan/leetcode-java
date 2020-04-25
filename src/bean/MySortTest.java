package bean;

import java.util.Arrays;

public class MySortTest {

  public static void main(String[] args) {
    int length = 30;
    Integer[] array = new Integer[length];
    for (int i = 0; i < length; i++) {
      array[i] = (int)Math.floor(Math.random() * 1000);
    }
    MySort.mergeSort(array);
    System.out.println(Arrays.toString(array));
  }
}
