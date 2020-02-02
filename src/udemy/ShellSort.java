package udemy;

/**
 * Worst case time complexity: O(n^2)
 * Variation of insertion sort but first pre-sorts the array
 * so that the insertion requires less shifting.
 * A common gap used from the Knuth sequence is (3^k - 1)/2
 * k is based on length of array
 * Want gap to be as large as possible without being larger than array size
 **/
public class ShellSort {
    public static int[] performShellSort(int[] arrayToSort) {
        for (int gap = arrayToSort.length / 2; gap > 0; gap /= 2) {
            for (int currentGapIndex = gap; currentGapIndex < arrayToSort.length; currentGapIndex++) {
                int newElement = arrayToSort[currentGapIndex];
                int indexToShift = currentGapIndex;
                while (indexToShift >= gap && arrayToSort[indexToShift - gap] > newElement) {
                    arrayToSort[indexToShift] = arrayToSort[indexToShift - gap];
                    indexToShift -= gap;
                }
                arrayToSort[indexToShift] = newElement;
            }
        }
        return arrayToSort;
    }
}
