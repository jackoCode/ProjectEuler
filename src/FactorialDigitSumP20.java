import java.math.BigInteger;

public class FactorialDigitSumP20 {

    /*
    n! means n × (n − 1) × ... × 3 × 2 × 1

    For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
    and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

    Find the sum of the digits in the number 100! --> 648
    */

    public static void main(String[] args) {

        BigInteger number = new BigInteger("100");
        String s = factorial(number).toString();

        char[] c = s.toCharArray();

        int summe = 0;

        for (int i = 0; i < c.length; i++) {
            summe += c[i] - 48;
        }

        System.out.println(summe);


    }

    private static BigInteger factorial(BigInteger number) {
        BigInteger i = new BigInteger("1");

        if(number.equals(i)){
            return number;
        }

        return number.multiply(factorial(number.subtract(new BigInteger("1"))));
    }
}
