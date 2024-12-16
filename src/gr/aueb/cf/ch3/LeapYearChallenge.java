package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LeapYearChallenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        final int CR1 = 4;
        final int CR2 = 100;
        final int CR3 = 400;
        boolean isYearLeap = false;

        System.out.println("Enter a year");
        year = in.nextInt();

        if (year % CR1 == 0 && (year % CR2 != 0|| year % CR3 == 0)){
            isYearLeap = true;
        }

       /* isYearLeap = year % CR1 == 0 && (year % CR2 != 0|| year % CR3 == 0); */


        System.out.println("year is leap: " + isYearLeap);

    }
}
