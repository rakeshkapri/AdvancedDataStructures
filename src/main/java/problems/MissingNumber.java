package problems;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] s){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n; i++){
            int count = scanner.nextInt();
            int arr[] = new int[count-1];
            for(int j=0;j<arr.length;j++){
                arr[j] = scanner.nextInt();
            }
            printMissingElement(arr);
        }
    }

    private static void printMissingElement(int[] arr) {
        int missingNumber = -1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1] - arr [i] > 1){
                missingNumber = arr[i+1] - 1;
                break;
            }
        }
        System.out.println(missingNumber);
    }
}
