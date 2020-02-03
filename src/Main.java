import udemy.sorting.Factorial;
import udemy.sorting.MergeSort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] input = new int[]{20,35,-15,7,55,1,-22};
        MergeSort.mergeSort(input, 0, 6);
        Arrays.stream(input).forEach(System.out::println);
    }
}
