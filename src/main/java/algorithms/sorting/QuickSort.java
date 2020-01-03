package algorithms.sorting;

import static algorithms.common.SortingUtils.*;

public class QuickSort {
    public static void main(String s[]) {
        int[] arr = scanInput();
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int lowIndex = start + 1;
        int highIndex = end;
        int pivot = arr[start];
        while (lowIndex <= highIndex) {
            while (arr[lowIndex] < pivot && lowIndex < highIndex) {
                lowIndex++;
            }
            while (arr[highIndex] > pivot && lowIndex <= highIndex) {
                highIndex--;
            }
            if (lowIndex < highIndex) {
                swap(lowIndex, highIndex, arr);
            }
        }
        swap(start, highIndex, arr);                 // Exchange pivot
        quickSort(arr, start, highIndex);                    // Sort left partition
        quickSort(arr, highIndex + 1, end);       //Sort right partition
    }
}
