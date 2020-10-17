package problems;

import algorithms.common.SortingUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problems_V1 {
    public static void main(String s[]){
        System.out.println("Please enter the sum of numbers");
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        Map<Integer, Integer> numMap = findSumNumbers(total, 2);
        numMap.forEach((key,value) -> System.out.println(key+":"+value));
    }

    /**
     * Method to find the numbers (2 numbers) from an array with sum equal to the passed number to the method
     * @param total
     * @param digitCount
     * @return
     */
    private static Map<Integer, Integer> findSumNumbers(int total, int digitCount) {
        int[] arr = new int[]{10, 5, 6, 7 , 9, 11,2, 1};
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0; i< arr.length-1; i++){
            if(arr[i] > total){
                continue;
            }else{
                for(int j=i+1; j< arr.length; j++){
                    if(arr[i] + arr[j] == total){
                        numMap.put(arr[i], arr[j]);
                        continue;
                    }
                }
            }
        }
        return numMap;
    }
}
