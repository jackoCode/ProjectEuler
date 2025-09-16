import java.math.BigInteger;

// Solution: 35407281

public class P500Problem500 {

    public static void main(String[] args) {
        BigInteger a = new BigInteger("2");
        BigInteger b;
        BigInteger div = new BigInteger("0");

        b = a.pow(500500);
        //System.out.println(b);

        BigInteger c = BigInteger.ONE;
        BigInteger counter = BigInteger.ZERO;

        while (!c.equals(b)){

            if(div.mod(c).equals("0")){
                counter = counter.add(BigInteger.ONE);
            }

            c = c.add(BigInteger.ONE);
        }

        BigInteger ergebnis = new BigInteger("0");

        ergebnis = counter.mod(new BigInteger("500500507"));

        System.out.println(ergebnis);
    }
}
