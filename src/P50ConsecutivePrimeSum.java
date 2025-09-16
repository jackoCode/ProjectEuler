public class P50ConsecutivePrimeSum {

    // Solution --> 997651

    public static void main(String[] args) {

        long summe = 0;
        long counter = 0;

        while (summe < 1000000){

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
        boolean istPrim = true;

        if(n < 2){
            istPrim = false;
        }
        if(n % 2 == 0){
            istPrim = false;
        }
        if(n == 2){
            istPrim = true;
        }

        for (int i = 3; i * i <= n; i+=2) {
            if(n % i == 0){
                istPrim = false;
            }
        }

        return istPrim;
    }
}
