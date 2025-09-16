import java.math.BigInteger;

public class P56PowerfulDigitSum {

    /*
    A googol (10^100) is a massive number: one followed by one-hundred zeros; 100^100 is almost unimaginably large:
    one followed by two-hundred zeros. Despite their size, the sum of the digits in each number is only 1.
    Considering natural numbers of the form, a^b, where a, b < 100, what is the maximum digital sum?
    Solution: 972
     */

    public static void main(String[] args) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        new BigInteger("0");
        BigInteger result;

        int quersumme = 0;
        int summe = 0;
        int counter = 1;
        int c = 1;

        char[] digits;

        while (counter < 100){
            result = a.pow(counter);
            String s = result.toString();

            digits = new char[s.length()];
            digits = s.toCharArray();

            for (int i = 0; i < digits.length; i++) {
                quersumme += digits[i] - 48;
            }

            if(quersumme >= summe){
                summe = quersumme;
            }

            quersumme = 0;
            a = a.add(BigInteger.ONE);
            counter++;
        }

        System.out.println(summe);

    }
}
