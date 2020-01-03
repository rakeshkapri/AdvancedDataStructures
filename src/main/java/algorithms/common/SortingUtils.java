package algorithms.common;

import java.util.Scanner;

public class SortingUtils {
    public static int[] scanInput(){
        System.out.println("Please enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numArray = new int[size];
        System.out.println("Please enter the numbers, press enter to exit!");
        boolean isContinue = true;
        int i = 0;
        while(i < size){
            int number =  scanner.nextInt();
            numArray[i++] = number;
        }
        scanner.close();
        return numArray;
    }

    public static void print(int[] arr){
        System.out.println("The output after sorting is : ");
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
