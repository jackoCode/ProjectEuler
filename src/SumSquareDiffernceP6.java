public class SumSquareDiffernceP6 {

    // Difference between the sum of the squares of the first one hundred natural numbers and the square of the sum

    public static void main(String[] args) {
        int summe = 0;
        int squareSumme = 0;
        long loesung;

        for (int i = 0; i < 101; i++) {
            summe += i;
        }

        long squareOfSum = summe * summe;
        System.out.println(squareOfSum);

        for (int i = 0; i < 101; i++) {
            squareSumme += (i*i);
        }

        System.out.println(squareSumme);

        loesung = squareOfSum - squareSumme;
        System.out.println(loesung);
    }
}
