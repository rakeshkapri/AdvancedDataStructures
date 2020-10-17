package algorithms.sorting;

import static algorithms.common.SortingUtils.print;
import static algorithms.common.SortingUtils.scanInput;

public class MergeSortDemo {

    public static void main(String []s){
        int[] arr = scanInput();
        mergeSort(arr, 0, arr.length-1);
        print(arr);
    }

    private static void mergeSort(int[] arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex){
            return;
        }
        int midIndex = (endIndex + startIndex)/2 - 1;
        mergeSort(arr, startIndex, midIndex);
        mergeSort(arr, midIndex+1, endIndex);
        merge(arr, startIndex, midIndex, endIndex);
    }

    private static void merge(int[] arr, int startIndex, int midIndex, int endIndex) {
        int n1Size = midIndex - startIndex + 1;
        int n2Size = endIndex - midIndex;

        int arr1[] = new int[n1Size];
        int arr2[] = new int[n2Size];

        for(int i=0; i<n1Size;i++){
            arr1[i] = arr[startIndex + i];
        }
        for(int i=0; i<n2Size;i++){
            arr1[i] = arr[midIndex + i + 1];
        }

    }
}
