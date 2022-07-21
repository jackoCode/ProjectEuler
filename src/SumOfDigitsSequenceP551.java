import java.math.BigInteger;

public class SumOfDigitsSequenceP551 {

    /*
    a_0 = 1
    for n >= 1, a_n is the sum of the digits of all preceding terms
    The sequence starts with 1, 1, 2, 4, 8, 16, 23, 28, 38, 49, ...
    You are given a_10^6 = 31054319

    Find a_10^15
    */

    public static void main(String[] args) {

        BigInteger a = new BigInteger("10");
        a = a.pow(15);
        BigInteger index = new BigInteger("1");

        System.out.println(sum(index, a));
    }

    private static BigInteger sum(BigInteger index, BigInteger a) {
        BigInteger sum = new BigInteger("0");

        while (!index.equals(a)){
            sum = sum.add(index);
            a.subtract(BigInteger.ONE);

        }

        return sum;
    }
}
