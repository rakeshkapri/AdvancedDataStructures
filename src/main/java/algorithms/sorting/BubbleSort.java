package algorithms.sorting;

import algorithms.common.SortingUtils;

public class BubbleSort {
    public static void main(String s[]){
        bubbleSort(SortingUtils.scanInput());
    }

    private static void bubbleSort(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    swap(j, j+1, arr);
                }
            }
        }
        System.out.println("The output after sorting is : ");
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
