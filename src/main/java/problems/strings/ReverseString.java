package problems.strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String s[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] inputs=new String[n];
        scanner.nextLine();
        for(int i=0; i<n; i++){
            inputs[i] = scanner.nextLine();
        }
        for(int i=0; i<n; i++){
            String reverse = reverseString(inputs[i]);
            System.out.println(reverse);
        }
    }

    private static String reverseString(String str) {
        String[] tokens = str.split("\\.");
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=tokens.length-1; i >=0; i--){
            if("".equals(stringBuffer.toString())){
                stringBuffer.append(tokens[i]);
            }else{
                stringBuffer.append("." + tokens[i]);
            }
        }
        return stringBuffer.toString();
    }
}
