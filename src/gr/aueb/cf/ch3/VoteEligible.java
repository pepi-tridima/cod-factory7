package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου ηλικία>18
 * Ελέγχει αν μια ηλικία
 * έχει δικαίωμα να ψηφίσει
 */

public class VoteEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;
        final int LIMIT = 18;
        boolean isEligible = false;
        System.out.println("please insert age");
        age = in.nextInt();

        isEligible = age >= LIMIT;

        System.out.println("Age is eligible: " + isEligible);
    }
}
