package udemy;

/**
 * O(n^2) Time Complexity
 * In each individual traversal, a single value floats to
 * end or beginning based on sort order, and increments or decrements the
 * partition index. The process then repeats until the new partition index reaches 1
 *
 * Stability: Stable
 * **/
public class BubbleSort {
    public static int[] performBubbleSortAscending(int[] arrayToSort) {
        int unsortedPartitionIndex = arrayToSort.length - 1;
        for (int i = unsortedPartitionIndex; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                swapAscending(arrayToSort, j, j+1);
            }
        }
        return arrayToSort;
    }

    public static int[] performBubbleSortDescending(int[] arrayToSort) {
        int unsortedPartitionIndex = 0;
        for (int i = unsortedPartitionIndex; i < arrayToSort.length - 1; i++) {
            for (int j = arrayToSort.length - 1; j > 0; j--) {
                swapDescending(arrayToSort, j, j-1);
            }
        }
        return  arrayToSort;
    }

    private static void swapAscending(int[] arrayToSort, int i, int j) {
        if (arrayToSort[i] > arrayToSort[j]) {
            int temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[j];
            arrayToSort[j] = temp;
        }
    }

    private static void swapDescending(int[] arrayToSort, int i, int j) {
        if (arrayToSort[j] < arrayToSort[i]) {
            int temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[j];
            arrayToSort[j] = temp;
        }
    }

    public static int[] performShellBubbleSort(int[] arrayToSort) {
        for (int gap = arrayToSort.length; gap > 0; gap = gap * 10 / 13) {
            for (int currentGapIndex = gap; currentGapIndex < arrayToSort.length; currentGapIndex++) {
                if (arrayToSort[currentGapIndex] < arrayToSort[currentGapIndex - gap]) {
                    int temp = arrayToSort[currentGapIndex];
                    arrayToSort[currentGapIndex] = arrayToSort[currentGapIndex - gap];
                    arrayToSort[currentGapIndex - gap] = temp;
                }
            }
        }
        return arrayToSort;
    }
}

// [20,35,-15,7,55,1,-22]
//                 j-1, j
//                  j   i
// Iteration 0: unsortedPartitionIndex = 6
// Iteration 1: unsortedPartitionIndex = 6
