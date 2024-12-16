package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Θα δέχεται τρεις ακέραιους αριθμούς
 * για μέρα, μήνα και χρονιά και θα
 * τους εκτυπώνει σαν ημερομηνία
 */
public class IntToDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day;
        int month;
        int year;

        System.out.println("Please insert 3 int numbers for: day, month, year");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        year %= 100;

        System.out.printf("The date is %02d/%02d/%02d", day, month, year);


    }
}
