public class CoinSumP31 {

    /*
    In the United Kingdom the currency is made up of pound (£) and pence (p). There are eight coins in general circulation:
    1p, 2p, 5p, 10p, 20p, 50p, £1 (100p), and £2 (200p).
    It is possible to make £2 in the following way:
    1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
    How many different ways can £2 be made using any number of coins?
    --> Solution: 73682
     */

    public static void main(String[] args) {

        int twoPound = 200;
        int ways = 0;

        for (int i = twoPound; i >= 0; i-=200) {
            for (int j = i; j >= 0; j-=100) {
                for (int k = j; k >= 0; k-=50) {
                    for (int l = k; l >= 0; l-=20) {
                        for (int m = l; m >= 0; m-=10) {
                            for (int n = m; n >= 0; n-=5) {
                                for (int o = n; o >= 0; o-=2) {
                                        ways++;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(ways);

    }
}
