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
        int limit = 10000;
        int totalSum = 0;

        for (int a = 2; a < limit; a++) {
            int b = sumOfDivisors(a);
            if (b != a && b < limit && sumOfDivisors(b) == a) {
                totalSum += a;
            }
        }

        System.out.println(totalSum);
    }

    public static int sumOfDivisors(int n) {
        int sum = 1;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                int other = n / i;
                if (other != i) {
                    sum += other;
                }
            }
        }
        return sum;
    }
}