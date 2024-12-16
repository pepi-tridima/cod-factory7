package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/** Μετατρέπει ημέρες, ώρες, λεπτά, δευτερόλεπτα,
 * σε συνολικά δευτερόλεπτα. Ο χρήστης δίνει
 */

public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

        final int SECONDS_PER_DAY = 3600 * 24;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;
        int day = 0;
        int hour = 0;
        int minute = 0;
        int second = 0;
        int resultday = 0;
        int resulthour = 0;
        int resultminute = 0;
        int totalseconds = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert integers for days, hours, minutes and seconds");
        day = in.nextInt();
        hour = in.nextInt();
        minute = in.nextInt();
        second = in.nextInt();

        totalseconds = day * SECONDS_PER_DAY + hour * SECONDS_PER_HOUR + minute * SECONDS_PER_MINUTE + second;

        System.out.printf(Locale.US, " Total seconds: %,d\n", totalseconds);

    }
}
