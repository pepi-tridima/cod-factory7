package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with vat
 */

public class PriceWithVat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = 0.0;
        final double VAT = 0.24;
        double totalPrice = 0.0;

        System.out.println("Please insert original price");
        price = in.nextDouble();
        totalPrice = price + (price * VAT);

        System.out.printf("Price: %.2f, Price with vat: %.2f", price, totalPrice);

    }
}
