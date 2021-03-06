public class CountingSundaysP19 {

    /*
    You are given the following information, but you may prefer to do some research for yourself.

    1 Jan 1900 was a Monday.
    Thirty days has September,
    April, June and November.
    All the rest have thirty-one,
    Saving February alone,
    Which has twenty-eight, rain or shine.
    And on leap years, twenty-nine.

    A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
    1904
    How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
     */
    // Solution: 171

    public static void main(String[] args) {

        System.out.println("The number of Sundays on the first of the month during the twentieth century is:");
        System.out.println(numberOfSundays());

    }

    private static int numberOfSundays() {
        int numberOfSundays = 0;
        int dayOfTheWeek = 2; // 1 Jan 1901 was a Tuesday

        for (int year=1901; year<=2000; year++) {
            for (int month=1; month<=12; month++) {
                for (int day=1; day<=getNumberOfDays(month,year); day++) {
                    dayOfTheWeek++;

                    if (dayOfTheWeek == 7) {
                        if (day == 1)
                            numberOfSundays++;

                        dayOfTheWeek = 0;
                    }
                }
            }
        }

        return numberOfSundays;
    }

    private static int getNumberOfDays(int month, int year) {
        if (month == 2)
            return year%4 == 0 ? 29 : 28;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        return 31;
    }

}
