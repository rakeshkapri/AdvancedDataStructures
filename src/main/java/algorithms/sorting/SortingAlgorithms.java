package algorithms.sorting;

import static algorithms.common.SortingUtils.*;

public class SortingAlgorithms {
    public static void main(String[] s) {
        //sortZeroesAndOnes();
        sortZeroesAndOnesAndTwos();
    }

    /**
     * 	• Given an array containing 0s and 1s. Write an algorithm to sort array so that 0s come first followed by 1s.
     * 	Also find the minimum number of swaps required to sort the array.
     */
    private static void sortZeroesAndOnes() {
        int[] arr = scanInput();
        System.out.println("The input items are :: " + arr);
        int index = 0;
        for(int left =0; left < arr.length -2; left++){
            if(arr[left]==0){
                continue;
            }else{
                index = left + 1;
                while(index <= arr.length-1){
                    if(arr[index]==0){
                        swap(left, index, arr);
                        break;
                    }
                    index++;
                }
            }
        }
        print(arr);
    }

    /**
     * Given an array containing 0s, 1s and 2s.
     * Write an algorithm to sort array so that 0s come first followed by 1s and then 2s in the end.
     */
    private static void sortZeroesAndOnesAndTwos() {
        int[] arr = scanInput();
        int left = 0;
        int index = 0;
        int right = arr.length -1;
        while(index <= right){
            if(arr[index] == 0){
                swap(left, index, arr);
                ++index;
                left++;
            }else if(arr[index] == 2){
                swap(index, right, arr);
                right--;
            }else{
                ++index;
            }
        }
        print(arr);
    }

    /**
     *  Given an array containing 0s, 1s and 2s. Write an algorithm to sort array so that 0s come first followed by
     *  1s and then 2s in the end - (Range Partition) 1. sort by maintaining count ( 2 passes), 2. sort in a single pass
     */
}
