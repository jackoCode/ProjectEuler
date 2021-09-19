import java.math.BigInteger;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class LaggedFibonacciSequenceP258 {

    // Solution --> 12747994

    public static void main(String[] args) {

        long k = (long)Math.pow(10,18);
        long ergebnis = sequence(k) % 20092010;
        System.out.println(ergebnis);

    }

    public static long sequence(long k){
        List<Long> ergebnisse = new ArrayList<Long>();

        if(k <= 1999){
            ergebnisse.add(0,1L);
            return 1;
        }

        
        return sequence(k-2000) + sequence(k-1999);
    }
}
