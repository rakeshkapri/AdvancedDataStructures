package algorithms.basic;

public class GCD {
    private static int gcd(int big, int small){
        if(big < small){
            return gcd(small, big);
        }
        if(big%small==0){
            System.out.println("Biggest common divisor is : " + small);
            return small;
        }
        return gcd(big, big%small);
    }

    public static void main(String s[]){
        gcd(15, 10);
    }
}
