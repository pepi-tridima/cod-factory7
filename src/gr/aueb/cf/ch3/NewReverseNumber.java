package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αντιστρέφει έναν ακέραιο
 * 123 γίνεται 321
 */

public class NewReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int reversed = 0;
        int i = 0;
        int temp = 0;
        int rightDigit = 0;

        System.out.println("insert positive number");
        num = scanner.nextInt();
        temp = num;
        while (temp > 0){
            rightDigit = temp % 10;
            reversed = reversed * 10 + rightDigit;
            temp /= 10; // temp = temp / 10
        }
        System.out.println("The reversed number is: " + reversed);

    }
}
