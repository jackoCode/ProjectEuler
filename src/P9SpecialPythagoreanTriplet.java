public class P9SpecialPythagoreanTriplet {

    /*
    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

    a^2 + b^2 = c^2
    For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.
     */

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;
        int s = 1000;
        int k = 0;
        int n = 0;
        int d = 0;
        boolean found = false;

        int mlimit = (int)Math.sqrt(s / 2);

        for (int m = 2; m < mlimit; m++) {
            if((s / 2) % m == 0){
                if(m % 2 == 0){
                    k = m + 1;
                }else{
                    k = m  + 2;
                }

                while (k < 2 * m && k <= s / (2 * m)){
                    if(s / (2 * m) % k == 0 && gcd(k, m) == 1){
                        d = s / 2 / (k * m);
                        n = k - m;
                        a = d * (m * m - n * n);
                        b = 2 * d * n * m;
                        c = d * (m * m + n * n);
                        found = true;
                        break;
                    }

                    k += 2;
                }
            }

            if(found){
                break;
            }
        }

    }

    private static int gcd(int a, int b) {
        int y = 0;
        int x = 0;

        if(a > b){
            x = a;
            y = b;
        }else {
            x = b;
            y = a;
        }

        while (x % y != 0){
            int temp = x;
            x = y;
            y = temp % x;
        }

        return y;
    }
}
