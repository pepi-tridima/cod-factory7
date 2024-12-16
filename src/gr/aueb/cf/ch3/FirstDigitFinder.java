package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το πρώτο ψηφίο αριστερά ενός αριθμού
 */

public class FirstDigitFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int temp = 0;

        System.out.println("Enter a positive number");
        inputNum = scanner.nextInt();

        temp = inputNum;
        while (temp >= 10){
            temp /= 10;
        }
        System.out.println("The first digit of: " + inputNum + " is " + temp);




    }
}
