package algorithms.sorting;

import static algorithms.common.SortingUtils.*;

public class SelectionSort {
    public static void main(String s[]) {
        int[] arr = scanInput();
        selectionSort(arr);
        print(arr);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = i + 1; j < arr.length - i - 1; j++) {
                if (arr[j] > max) {
                    max = j;
                }
            }
            swap(max, arr.length - i - 1, arr);
        }
    }
}
