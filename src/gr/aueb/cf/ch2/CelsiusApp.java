package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Θα δέχεται ακεραιους αριθμούς ως τιμές θερμοκρασίας
 * σε Fahrenheit και θα το μετατρέπει σε Celsius
 */

public class CelsiusApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tempf = 0;
        int tempc = 0;

        System.out.println("Please insert a temperature number (int)");
        tempf = in.nextInt();
        tempc = 5 * (tempf - 32) / 9;

        System.out.printf("%d\u2109 = %d\u2103 ", tempf, tempc);

    }
}
