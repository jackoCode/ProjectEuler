import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciNumberP25 {

    /*
    The 12th term, F12, is the first term to contain three digits.
    What is the index of the first term in the Fibonacci sequence to contain 1000 digits? 4782
     */

    private static int thousandFib(int limit){
        var list = Stream.of(BigInteger.ONE, BigInteger.ONE).collect(Collectors.toList());
        var index = 0;

        while (list.get(index).toString().length() != limit){

            if(list.get(index).toString().length() == limit){
                break;
            }

            list.add(list.get(index).add(list.get(index+1)));

            index++;
        }

        return list.size() - 1;
    }

    public static void main(String[] args) {
        System.out.println(thousandFib(1000));
    }
}
