public class P50ConsecutivePrimeSum {
    // The prime 41, can be written as the sum of six consecutive primes:
    // 41 = 2 + 3 + 5 + 7 + 13
    // This is the longest sum of consecutive primes that adds to a prime below one-hundred.
    // The longest sum of consecutive primes below one-thousand that adds to a prime,
    // contains 21 terms, and is equal to 953.
    // Which prime, below one-million, can be written as the sum of the most consecutive primes?

    // Solution --> 997651

    public static void main(String[] args) {

        long summe = 0;
        long counter = 0;

        while (true){

            if(isPrime(counter)){
                summe += counter;
            }

            if(summe >= 1000000){
                summe -= counter;
                while (!isPrime(summe)){
                    summe--;
                }
                break;
            }

            counter++;
        }

        System.out.println(summe);
    }

    public static boolean isPrime(long n){
        boolean istPrim = n >= 2;

        if(n % 2 == 0){
            istPrim = false;
        }
        if(n == 2){
            istPrim = true;
        }

        for (int i = 3; (long) i * i <= n; i+=2) {
            if (n % i == 0) {
                istPrim = false;
                break;
            }
        }

        return istPrim;
    }
}
