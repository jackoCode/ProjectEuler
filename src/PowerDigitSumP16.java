import java.math.BigInteger;

public class PowerDigitSumP16 {

    /*
    2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
    What is the sum of the digits of the number 2^1000?
     */

    public static void main(String[] args) {
        BigInteger ergebnis = new BigInteger("2");

        String s = ergebnis.pow(1000).toString();

        char[] digits;
        digits = s.toCharArray();

        int summe = 0;

        for (int i = 0; i < digits.length; i++) {
            summe += digits[i] - 48;
        }

        System.out.println(summe);
    }
}
