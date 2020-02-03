package udemy.sorting;

/**
 * Insertion Sort
 * Time Complexity: O(n^2)
 * In insertion sort, the idea is to have a sorted and unsorted partition. The number
 * ins the very first index is already considered to be in the sorted partition. The
 * first number in each traversal of the unsorted partition is selected to insert.
 * If it's already larger/smaller than the last number in the sorted partition, it stays
 * where it is and the sorted partition grows by one index. Otherwise, each number in the
 * sorted partition is shifted over one index until the condition fails or the first index of the
 * sorted partition is reached. The selected number is then inserted at the index where the
 * condition failed.
 * **/
public class InsertionSort {
    public static int[] performInsertionSort(int[] arrayToSort) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arrayToSort.length; firstUnsortedIndex++) {
            int numberSelected = arrayToSort[firstUnsortedIndex];
            int indexToInsert = firstUnsortedIndex;
            for (int currentSortedIndex = firstUnsortedIndex -1; currentSortedIndex >= 0; currentSortedIndex--) {
                if (arrayToSort[currentSortedIndex] > numberSelected) {
                    arrayToSort[currentSortedIndex + 1]  = arrayToSort[currentSortedIndex];
                    indexToInsert = currentSortedIndex;
                }
            }
            arrayToSort[indexToInsert] = numberSelected;
        }
        return arrayToSort;
    }
}
