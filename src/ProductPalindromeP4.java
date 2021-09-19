public class ProductPalindromeP4 {

    // Largest palindrom made from the product of two 3-digit numbers
    public static void main(String[] args) {
        int start = 100;
        int stop = 999;
        long ergebnis;
        int counter = 0;

        for (int i = start; i <= stop; i++) {
            for (int j = start; j < stop; j++) {
                ergebnis = i * j;
                String s = Long.toString(ergebnis);
                boolean pali = palindrome(s);

                if(pali){
                    counter++;
                    System.out.println("Ergebnis von " + i + " * " + j + " ist " + ergebnis);
                    System.out.println(counter);
                }
            }
        }
    }

    public static boolean palindrome(String s){
        if(s.length() < 2){
            return true;
        }

        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }

        return palindrome(s.substring(1,s.length()-1));

    }
}
