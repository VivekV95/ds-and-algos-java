import udemy.BubbleSort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int[] array = BubbleSort.performBubbleSortDescending(new int[]{20,35,-15,7,55,1,-22});
        Arrays.stream(array).forEachOrdered(System.out::println);
    }
}
