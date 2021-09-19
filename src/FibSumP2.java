public class FibSumP2 {

    public static void main(String[] args) {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        for (int i = 0; i <= 90; i++) {
            System.out.println("FibSum of " + i + " is " + fibSum(i));
        }

    }

    private static long fibSum(int n) {
        long[] berechneteFiboWerte;
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        berechneteFiboWerte = new long[n + 1];

        if (n < 2) {
            return n;
        }

        berechneteFiboWerte[0] = 0;
        berechneteFiboWerte[1] = berechneteFiboWerte[2] = 1;

        for (int i = 3; i <= n; i++) {
            berechneteFiboWerte[i] = berechneteFiboWerte[i - 1] + berechneteFiboWerte[i - 2];
        }

        long sum = 0;
        for (int i = 0; i < berechneteFiboWerte.length; i++) {
            sum += berechneteFiboWerte[i];
        }
        return sum;
    }
}
