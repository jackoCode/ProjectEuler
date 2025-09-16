public class P1Multiples {

    // Sum of all the multiples of 3 or 5 below 100

    public static void main(String[] args) {

        int sum3 = 0;
        int sum5 = 0;

        for (int i = 0; i <= 100; i++) {
            int zwischenSumme3 = 3 * i;
            System.out.println("Multi 3 von " + i + " " + zwischenSumme3 + " ");
            int zwischenSumme5 = 5 * i;
            System.out.println("Multi 5 von " + i + " " + zwischenSumme5 + " ");

            if(zwischenSumme3 <= 100){
                sum3 += zwischenSumme3;
            }
            if(zwischenSumme5 <= 100){
                sum5 += zwischenSumme5;
            }
        }

        System.out.println("----------------------------------");
        System.out.println(sum3);
        System.out.println(sum5);
    }
}
