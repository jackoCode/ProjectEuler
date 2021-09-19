public class SmallestMultipleP5 {

    // Smallest positive number that is evenly divisible by all of the numbers form 1 to 20

    public static void main(String[] args) {
        int start = 20;
        int ergebnis = 1;

        for (int i = 1; i <= 20; i++){
            if(start % i == 0){
                ergebnis = start;
            }else{
                start *= i;
            }
        }

        System.out.println(ergebnis);

    }
}

