import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // task 1
    int[] array = {1,98,54,154,8,74,-20,41,6574,84,654,-8,9674,56};
    MyMergeAndSort.sortWithMergeSortAlgorithm(array);
    System.out.println(Arrays.toString(array));
    // task 2
    System.out.println("Enter your target");
    int target = new Scanner(System.in).nextInt();
    System.out.println("Index of target <-> " + MyMergeAndSort.binarySearch(array, target));


  }
}
