package bean;

public class MySort {

  public static <AnyType extends Comparable<? super AnyType>> void insertSort(AnyType[] array) {
    quickSort(array, 0, array.length - 1);
  }

  private static <AnyType extends Comparable<? super AnyType>> void insertSort(AnyType[] array, int left, int right) {
    for (int i = left + 1; i <= right; i++) {
      final AnyType tmp = array[i];
      int j = i;
      for (; j > 0 && tmp.compareTo(array[j - 1]) < 0; j--) {
        array[j] = array[j - 1];
      }
      array[j] = tmp;
    }
  }

  public static <AnyType extends Comparable<? super AnyType>> void shellSort(AnyType[] array) {
    int length = array.length;
    int j;
    for (int gap = length / 2; gap > 0; gap /= 2) {
      for (int i = gap; i < length; i++) {
        AnyType tmp = array[i];
        for (j = i; j >= gap && tmp.compareTo(array[j - gap]) < 0; j -= gap) {
          array[j] = array[j - gap];
        }
        array[j] = tmp;
      }
    }
  }

  public static <AnyType extends Comparable<? super AnyType>> void heapSort(AnyType[] array) {
    for (int i = array.length / 2 - 1; i >= 0; i--) {
      percDown(array, i, array.length);
    }
    for (int i = array.length - 1; i > 0; i--) {
      swap(array, 0, i);
      percDown(array, 0, i);
    }
  }

  private static <AnyType extends Comparable<? super AnyType>> void percDown(AnyType[] array, int i, int length) {
    AnyType tmp = array[i];
    for (int child = 2 * i + 1; child < length; i = child, child = 2 * i + 1) {
      if (child + 1 < length && array[child].compareTo(array[child + 1]) < 0) {
        child++;
      }
      if (tmp.compareTo(array[child]) < 0) {
        array[i] = array[child];
      } else {
        break;
      }
    }
    array[i] = tmp;
  }

  public static <AnyType extends Comparable<? super AnyType>> void mergeSort(AnyType[] array) {
    AnyType[] tmp = (AnyType[]) new Comparable[array.length];
    mergeSort(array, tmp, 0, array.length - 1);
  }

  private static <AnyType extends Comparable<? super AnyType>> void mergeSort(
      AnyType[] array, AnyType[] tmp, int left, int right) {
    if (left < right) {
      int center = (right + left) / 2;
      mergeSort(array, tmp, left, center);
      mergeSort(array, tmp, center + 1, right);
      merge(array, tmp, left, center, right);
    }
  }

  private static <AnyType extends Comparable<? super AnyType>> void merge(
      AnyType[] array, AnyType[] tmp, int leftPos, int center, int end) {
    int tmpPos = leftPos;
    int count = end - leftPos + 1;
    int rightPos = center + 1;
    while (leftPos <= center && rightPos <= end) {
      tmp[tmpPos++] = array[leftPos].compareTo(array[rightPos]) < 0 ? array[leftPos++] : array[rightPos++];
    }
    while (leftPos <= center) {
      tmp[tmpPos++] = array[leftPos++];
    }
    while (rightPos <= end) {
      tmp[tmpPos++] = array[rightPos++];
    }
    for (int i = 0; i < count; i++, end--) {
      array[end] = tmp[end];
    }
  }

  public static <AnyType extends Comparable<? super AnyType>> void quickSort(AnyType[] array) {
    quickSort(array, 0, array.length - 1);
  }

  private static <AnyType extends Comparable<? super AnyType>> void quickSort(AnyType[] array, int left, int right) {
    if (left + 10 <= right) {
      AnyType pivot = median3(array, left, right);
      int i = left;
      int j = right - 1;
      while (true) {
        while(array[++i].compareTo(pivot) < 0);
        while(array[--j].compareTo(pivot) > 0);
        if (i < j) {
          swap(array, i, j);
        } else {
          break;
        }
      }
      swap(array, i, right - 1);
      quickSort(array, left, i - 1);
      quickSort(array, i + 1, right);
    } else {
      insertSort(array, left, right);
    }
  }

  private static <AnyType extends Comparable<? super AnyType>> AnyType median3(
      AnyType[] array, int left, int right) {
    int center = (left + right) / 2;
    if (array[right].compareTo(array[center]) < 0) {
      swap(array, right, center);
    }
    if (array[center].compareTo(array[left]) < 0) {
      swap(array, center, left);
    }
    if (array[right].compareTo(array[center]) < 0) {
      swap(array, right, center);
    }
    swap(array, right - 1, center);
    return array[right - 1];
  }

  final private static <AnyType extends Comparable<? super AnyType>> void swap(AnyType[] array, int pos1, int pos2) {
    AnyType tmp = array[pos1];
    array[pos1] = array[pos2];
    array[pos2] = tmp;
  }
}
