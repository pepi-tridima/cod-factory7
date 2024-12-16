package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turns lights on, if it is raining AND car
 * is running (>100) OR is dark.
 */

public class LightsOn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX_CAR_SPEED = 100;
        boolean isRaining = false;
        boolean isDark = false;
        boolean isCarRunning = false;
        int speed = 0;
        boolean lightsOn = false;

        System.out.println("please insert if it raining ");
        isRaining = in.nextBoolean();

        System.out.println("please insert speed");
        speed = in.nextInt();

        System.out.println("please insert if it is dark");
        isDark = in.nextBoolean();

        isCarRunning = speed > MAX_CAR_SPEED;

        lightsOn = isRaining && (isCarRunning || isDark);

        System.out.println("Lights on:" + lightsOn);
    }
}
