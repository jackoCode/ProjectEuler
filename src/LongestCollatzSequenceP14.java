import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LongestCollatzSequenceP14 {

    /*
    The following iterative sequence is defined for the set of positive integers:

    n → n/2 (n is even)
    n → 3n + 1 (n is odd)

    Using the rule above and starting with 13, we generate the following sequence:

    13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

    It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
    Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

    Which starting number, under one million, produces the longest chain?

    NOTE: Once the chain starts the terms are allowed to go above one million.
     */

    public static void main(String[] args) {

        int limit = 1000000;
        int size = 0, max = 1, j = 0;

        for (int i = 2; i < limit; i++) {
            size = chain(i);

            if (size > max) {
                max = size;
                j = i;
            }
        }
        System.out.println("Starting number, under one million, produces the longest chain is : " + j);

    }

    public static int chain(int n){
        List<Long> ergebnis = new ArrayList<Long>();

        long num = n;
        int size = 0;

        while (num != 1){
            ergebnis.add(num);

            if(num % 2 == 0){
                num = num / 2;
            }else{
                num = 3 * num + 1;
            }
        }

        size = ergebnis.size();
        return size;

    }
}
