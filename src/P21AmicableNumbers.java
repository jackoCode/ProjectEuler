public class P21AmicableNumbers {

    // Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
    // If d(a) = b and d(b) = a, where a!=b, than a and b are an amicable pair and each a and b are called
    // amicable numbers.
    //
    // For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110. Therefore, d(220) = 284.
    // The proper divisors of 284 are 1, 2, 4, 71 and 142. So d(284) = 220.
    //
    // Evaluate the sum of all the amicable numbers under 10000.
    //
    // Solution is 31626

    public static void main(String[] args) {

        int sum = 0;

        int dOfN;
        int dOfA;
        int dOfB;

        int counter = 10000;

        while (counter > 0){
            for (int i = 1; i < counter/2; i++) {
                if (counter % i == 0){
                    dOfA = i;
                }
            }

            counter--;
        }

        System.out.println(sum);
    }
}
