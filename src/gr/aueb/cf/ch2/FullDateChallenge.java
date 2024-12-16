package gr.aueb.cf.ch2;

import java.util.Scanner;

public class FullDateChallenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int formattedYear = 0;

        System.out.println("Enter day, month, year");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();
        formattedYear = year % 100;

        System.out.printf("The date is: %2d/%2d/%2d", day, month, formattedYear);
    }
}
