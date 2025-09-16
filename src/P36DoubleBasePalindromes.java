public class P36DoubleBasePalindromes {

    /*
    The decimal number, 585 = 1001001001 (binary), is palindromic in both bases.
    Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
    --> Solution: 872187
     */

    public static void main(String[] args) {
        int summe = 0;

        for (int i = 0; i <= 1000000; i++) {
            Integer n = i;
            String s = n.toString();

            if(isPalindrom(s)){
                String binary = toBinary(i);
                if(isPalindrom(binary)){
                    summe += i;
                }
            }
        }

        System.out.println(summe);
    }

    private static String toBinary(int i) {
        String s = "";

        while (i > 0){
            s = ((i % 2) == 0 ? "0" : "1") + s;
            i = i / 2;
        }

        return s;
    }

    private static boolean isPalindrom(String s) {
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        }

        return isPalindrom(s.substring(1,s.length() - 1));
    }
}
