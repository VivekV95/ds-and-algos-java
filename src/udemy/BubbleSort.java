package udemy;

public class BubbleSort {
    public static int[] performBubbleSortAscending(int[] arrayToSort) {
        int unsortedPartitionIndex = arrayToSort.length - 1;
        for (int i = unsortedPartitionIndex; i > 0; i--) {
            for (int j = 0; j < unsortedPartitionIndex; j++) {
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
}

// [20,35,-15,7,55,1,-22]
//                 j-1, j
//                  j   i
// Iteration 0: unsortedPartitionIndex = 6
// Iteration 1: unsortedPartitionIndex = 6
