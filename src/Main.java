import udemy.BubbleSort;
import udemy.SelectionSort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int[] array = SelectionSort.performSelectionSortAsc(new int[]{20,35,-15,7,55,1,-22});
        Arrays.stream(array).forEachOrdered(System.out::println);
    }
}
