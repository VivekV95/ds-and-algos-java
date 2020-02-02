package udemy;

/**
 *Time complexity of O(n^2)
 * Similar to bubble sort
 * In each top level traversal, the index of the largest number
 * in the unsorted partition is identified and stored. At the end of
 * the traversal, the largest number discovered is swapped with the number
 * at the last index of the unsorted partition. The unsorted partition index
 * is then decremented and the top level traversal repeats. The second level
 * iteration is simply responsible for iterating through the unsorted partition
 * and finding the index of the largest number
 *
 * Stability: Unstable
 * **/
public class SelectionSort {
    public static int[] performSelectionSortAsc(int[] arrayToSort) {
        int unsortedPartitionIndex = arrayToSort.length - 1;
        for(int i = unsortedPartitionIndex; i >= 0; i--) {
            int largestNumberIndex = 0;
            for (int j = 1; j < i; j++) {
                if (arrayToSort[j] > arrayToSort[largestNumberIndex]) {
                    largestNumberIndex = j;
                }
            }
            swap(arrayToSort, i, largestNumberIndex);
        }
        return arrayToSort;
    }

    public static void swap(int[] arrayToSort, int i, int j) {
        int temp = arrayToSort[i];
        arrayToSort[i] = arrayToSort[j];
        arrayToSort[j] = temp;
    }
    // [20,35,-15,7,55,1,-22]
}
