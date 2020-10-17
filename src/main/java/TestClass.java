import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        BigInteger num = BigInteger.valueOf(scanner.nextInt());
        BigInteger factorial = fact(num);
        System.out.println(factorial.longValue());
    }

    private static BigInteger fact(BigInteger n){
        if(BigInteger.ONE.equals(n) || BigInteger.ZERO.equals(n)){
            return BigInteger.ONE;
        }else{
            return n.multiply(fact(n.subtract(BigInteger.ONE)));
        }
    }
}
