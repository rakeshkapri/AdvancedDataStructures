package problems;

public class KadaneAlgo {

    public static void main(String[] s){
        int arr[] = new int[]{1, 2, 3, -2, 5};
        int maxEndingHere = 0;
        int maxEndingSoFar = 0;

        for(int i=0; i< arr.length; i++){
            maxEndingHere += arr[i];
            if(maxEndingSoFar < maxEndingHere){
                maxEndingSoFar = maxEndingHere;
            }else if(maxEndingHere < 0){
                maxEndingHere = 0;
            }
        }

        System.out.println("Maximum contiguous sum is " + maxEndingSoFar);
    }
}
