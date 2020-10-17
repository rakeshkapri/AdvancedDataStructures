package algorithms.sorting;

import static algorithms.common.SortingUtils.*;

public class QuickSort {
    public static void main(String s[]) {
        int[] arr = scanInput();
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }

    public static void quickSort(int[]arr, int start, int end){
        if(start >= end){
            return;
        }
        int lowIndex = start + 1;
        int highIndex = end;
        int pivot = arr[start];

        while(lowIndex < highIndex && arr[lowIndex] < pivot){
            lowIndex++;
        }
        while(lowIndex <= highIndex && arr[highIndex] > pivot){
            highIndex--;
        }
        if(lowIndex < highIndex){
            swap(lowIndex, highIndex, arr);
        }
        swap(start, highIndex, arr);
        quickSort(arr, start, highIndex);
        quickSort(arr, highIndex + 1, end);
    }
}
