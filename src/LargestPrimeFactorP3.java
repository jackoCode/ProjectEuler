import java.util.ArrayList;

public class LargestPrimeFactorP3 {

    // 600851475143
    static long maxPrimeFactor(long n){
        long maxPrime = -1;

        while (n % 2 == 0){
            maxPrime = 2;
            n >>= 1;
        }

        for (int i = 3; i < Math.sqrt(n); i += 2) {
            while (n % i == 0){
                maxPrime = i;
                n = n / i;
            }
        }

        if(n > 2){
            maxPrime = n;
        }

        return maxPrime;
    }

    public static void main(String[] args) {

        long l = Long.parseLong("600851475143");
        System.out.println(maxPrimeFactor(l));
    }
}
