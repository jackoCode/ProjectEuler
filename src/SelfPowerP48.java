import java.math.BigInteger;

public class SelfPowerP48 {

    /*
    Find the last ten digits of the series 1^1+2^2+3^3+...+1000^1000.
    Solution: 9110846700
     */

    public static void main(String[] args) {
        BigInteger a = new BigInteger("1");
        BigInteger result = new BigInteger("0");

        for (int i = 1; i < 1001; i++) {
            result = result.add(power(new BigInteger(String.valueOf(a)),i));
            a = a.add(BigInteger.ONE);
        }

        //System.out.println(result);
        String ergebnis = result.toString();
        System.out.println(ergebnis.substring(ergebnis.length()-10,ergebnis.length()));

    }

    public static BigInteger power(BigInteger a, int b){
        BigInteger power = new BigInteger(String.valueOf(a.pow(b)));
        return power;
    }
}
