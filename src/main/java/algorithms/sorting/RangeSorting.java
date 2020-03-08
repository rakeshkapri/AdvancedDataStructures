package algorithms.sorting;

import static algorithms.common.SortingUtils.print;
import static algorithms.common.SortingUtils.swap;

public class RangeSorting {
    public static void main(String s[]) {
        int[] arr = new int[]{0, 0, 2, 1, 0, 0, 1, 1, 0,2,2,0,1};
        rangePartition2_0(arr);
        print(arr);
    }

    private static void rangePartition(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            while (arr[start] == 0) {
                start++;
            }
            while (arr[end] == 1) {
                end--;
            }
            if (start < end) {
                swap(start, end, arr);
            }
        }
    }
    /**
     * Sort an array containing 0,1,2 in a single pass
     * @param arr
     */
    private static void rangePartition2_0(int[] arr){
        int start = 0;
        int end = arr.length -1;
        int i = 0;
        while(i < end){
            if(arr[i] == 0){
                swap(i, start, arr);
                start ++;
                i++;
            }
            if(arr[i] == 2){
                swap(i, end, arr);
                end--;
            }
            else{
                i++;
            }
        }
    }
}
