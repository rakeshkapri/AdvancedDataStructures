package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {
    private static int countTriplet(int arr[], int n) {
        Map<Integer, List<Integer>> sumMap = new HashMap<>();

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j< arr.length; j++){
                sumMap.put(arr[i] + arr[j], Arrays.asList(arr[i], arr[j]));
            }
        }
        for(int i=0; i< arr.length; i++){
            if(sumMap.containsKey(arr[i])){
                printElements(sumMap.get(arr[i]), arr[i]);
            }
        }
        return 0;
    }

    private static void printElements(List<Integer> list, int number) {
        System.out.print("[");
        list.forEach(num -> System.out.print(num + ", "));
        System.out.print(number);
        System.out.print("]");
        System.out.println("");
    }

    public static void main(String s[]){
        int arr[] = {1, 5, 3, 2, 4};
        countTriplet(arr, arr.length);
    }
}
