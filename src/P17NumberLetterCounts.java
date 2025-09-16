public class P17NumberLetterCounts {

    /*
    If the numbers 1 to 5 are written out in words: one, two, three, four, five,
    then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

    If all the numbers from 1 to 1000 (one thousand) inclusive were written out
    in words, how many letters would be used?

    NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two)
    contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use
    of "and" when writing out numbers is in compliance with British usage.
     */

    public static void main(String[] args) {
        String[] oneDigits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};
        String[] tenDigits = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};

        String[] speicher = new String[1001];
        int index = 0;

        for (int i = 0; i <= 1000; i++) {
            if(i < 20){
                speicher[index] = oneDigits[i];
                index++;

            }else if(i >= 20 && i < 100){
                int zehner;
                int einer;

                zehner = i / 10;
                einer = i % 10;

                if(einer != 0) {
                    speicher[index] = tenDigits[zehner] + oneDigits[einer];
                }else{
                    speicher[index] = tenDigits[zehner];
                }
                index++;

            }else if(i >= 100 && i < 1000){
                int hunderter;
                int zehner;
                int einer=0;

                hunderter = i / 100;
                zehner = i % 100 / 10;
                einer = i % 10;

                if(einer != 0) {
                    speicher[index] = oneDigits[hunderter] + "hundred" + tenDigits[zehner] + oneDigits[einer];
                }else if(einer == 0){
                    speicher[index] = oneDigits[hunderter] + "hundred" + tenDigits[zehner];
                }
                index++;

            }else{
                speicher[index] = "onethousand";
            }
        }

        for(String s : speicher){

            System.out.println(s);
        }


        int summe = 0;
        for (int i = 1; i < speicher.length; i++) {
            summe = summe + speicher[i].toCharArray().length;
        }

        System.out.println(summe);
    }
}
