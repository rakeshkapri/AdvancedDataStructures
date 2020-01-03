package algorithms.sorting;

import algorithms.common.SortingUtils;

public class MergeSort {
    public static void main(String s[]){
        int[] arr = SortingUtils.scanInput();
        mergeSort(arr, 0, arr.length-1);
        SortingUtils.print(arr);
    }

    private static void merge(int[] arr, int start, int mid, int end){
        int m = start;
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] temp1 = new int[n1];
        int[] temp2 = new int[n2];
        for(int i=0; i < n1; i++){
           temp1[i] = arr[start + i];
        }
        for(int i=0; i < n2; i++){
            temp2[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0;
        int l = start;
        while(i < n1 && j< n2){
            if(temp1[i] < temp2[j]){
                arr[l++] = temp1[i++];
            }
            else{
                arr[l++] = temp2[j++];
            }
        }
        while(i < n1){
            arr[l++] = temp1[i++];
        }
        while(j < n2){
            arr[l++] = temp2[j++];
        }

    }

    private static void mergeSort(int arr[], int startIndex, int endIndex){
        if(endIndex <= startIndex){
            return;
        }
        else{
            int mid = startIndex + (endIndex - startIndex)/2;
            mergeSort(arr, startIndex, mid);
            mergeSort(arr, mid + 1, endIndex);
            merge(arr, startIndex, mid, endIndex);
        }
    }
}
