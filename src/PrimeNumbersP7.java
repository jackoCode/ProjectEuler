import java.util.ArrayList;

public class PrimeNumbersP7 {

    // What is the 10001st prime number

    private static boolean isPrime(long number){
        int counter = 0;
        long sqrt = (long) Math.sqrt(number);

        for (int i = 1; i <= sqrt; i++) {
            if(number % i == 0){
                counter++;
            }

            if(counter > 1){
                return false;
            }
        }

        return true;
    }

    private static long tenThousandAndOnePrime(long limit){
        long counter = 1;
        long results = 0;

        for (int i = 2; counter <= limit; i++) {
            if(isPrime(i)){
                results = i;
                counter++;
            }
        }

        return results;
    }

    public static void main(String[] args) {
        System.out.println(tenThousandAndOnePrime(10001));
    }
}
