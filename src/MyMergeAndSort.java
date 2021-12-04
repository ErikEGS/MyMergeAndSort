public class MyMergeAndSort {

  // Merge Sort
  public static void sortWithMergeSortAlgorithm(int[] sourceArray) {
    if (sourceArray == null) {
      System.out.println("Array is null");
      return;
    }
    int size = sourceArray.length;
    if (size < 2) {
      return;
    }

    int mid = size / 2;
    int leftSize = mid;
    int rightSize = size - mid;

    int[] left = new int[leftSize];
    int[] right = new int[rightSize];

    System.arraycopy(sourceArray, 0, left, 0, mid);
    System.arraycopy(sourceArray, mid, right, 0,
        sourceArray.length - (sourceArray.length / 2));

   /* for (int i = 0; i < mid; i++) {
      left[i] = sourceArray[i];
    }
    for (int i = mid; i < size; i++) {
      right[i - mid] = sourceArray[i];
    } */

    sortWithMergeSortAlgorithm(left);
    sortWithMergeSortAlgorithm(right);
    merge(left, right, sourceArray);
  }

  private static void merge(int[] left, int[] right, int[] argArray) {

    int leftSize = left.length;
    int rightSize = right.length;

    int i = 0, j = 0, k = 0;

    while (i < leftSize && j < rightSize) {
      if (left[i] <= right[j]) {
        argArray[k] = left[i];
        i++;
        k++;
      } else {
        argArray[k] = right[j];
        k++;
        j++;
      }
    }

    while (i < leftSize) {
      argArray[k] = left[i];
      k++;
      i++;
    }

    while (j < rightSize) {
      argArray[k] = right[j];
      k++;
      j++;
    }
  }

  // binarySearch
  public static int binarySearch(final int[] input, final int target) {

    int left = 0, right = input.length - 1;
    while (left <= right) {
      int middle = left + (right - left) / 2;
      if (input[middle] == target) {
        return middle;
      } else if (input[middle] < target) {
        left = middle + 1;
      } else {
        right = middle - 1;
      }
    }
    return -1;
  }


}