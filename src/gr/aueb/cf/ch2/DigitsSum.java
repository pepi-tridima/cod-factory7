package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Να λαμβάνει από ρο χρήστη ένα διψήφιο ακέραιο
 * και να εκτυπώνει το αθροισμα των ψηφίων του.
 * Πχ. Αν δώσει τον ακέραιο 15, να εκτυπώνει 1+5=6
 */

public class DigitsSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int div = 0;
        int mod = 0;
        int sum = 0;

        System.out.println("Please insert a two-digit integer.");

        num = in.nextInt();
        div = num / 10;
        mod = num % 10;
        sum = div + mod;

        System.out.printf("Το άθροισμα των ψηφίων του αριθμού %d είναι %d + %d = %d\n", num, div, mod, sum);
        System.out.printf("Input num: %d, Left digit: %d, Right digit: %d, Sum: %d", num, div, mod, sum);


    }
}
