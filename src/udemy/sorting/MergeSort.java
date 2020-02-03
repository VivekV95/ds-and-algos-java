package udemy.sorting;

public class MergeSort {

    public static void mergeSort(int[] input, int start, int end) {
        if (end > start) {
            int mid = (start + end) / 2;
            mergeSort(input, start, mid);
            mergeSort(input, mid + 1, end);
            merge(input, start, mid, end);
        }
    }

    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid] <= input[mid + 1])
            return;
        int leftArrayIndex = start;
        int rightArrayIndex = mid + 1;
        int tempIndex = 0;

        int[] tempArray = new int[end - start + 1];
        while (leftArrayIndex <= mid && rightArrayIndex <= end) {
            tempArray[tempIndex++] = input[leftArrayIndex] <= input[rightArrayIndex]
                    ? input[leftArrayIndex++]
                    : input[rightArrayIndex++];
        }
        System.arraycopy(input, leftArrayIndex, input, start + tempIndex, mid + 1 - leftArrayIndex);
        System.arraycopy(tempArray, 0, input, start, tempIndex);
    }
}
