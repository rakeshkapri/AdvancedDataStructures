package algorithms.sorting;

import static algorithms.common.SortingUtils.*;

public class InsertionSort {
    public static void main(String s[]){
        int arr[] = scanInput();
        insertionSort(arr);
        print(arr);
    }

    private static void insertionSort(int[] arr){
        for(int i=0; i< arr.length-2; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(j, j-1, arr);
                    break;
                }
            }
        }
    }
}
