package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει ένα ποσο σε ευρω σε
 * δολάρια και σεντς Αμερικής.

 */
public class EuroUSDConverter {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int eur = 0;
        int usd = 0;
        int dol = 0;
        int cents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        //Εντολές
        System.out.println("Please insert an integer amount (in euro)");
        eur = in.nextInt();

        usd = eur * PARITY;
        dol = usd / 100;
        cents = usd % 100;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("%d \u20AC = %d \u0024 , %d cents.", eur, dol, cents);
    }
}
