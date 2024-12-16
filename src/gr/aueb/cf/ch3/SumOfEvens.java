package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εισάγει έναν αριθμό και
 * Υπολογίζει το άθροισμα των άρτιων αριθμών
 * μέχρι τον αριθμό αυτό.
 */

public class SumOfEvens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int i = 2;
        int sum = 0;
        System.out.println();
        num = in.nextInt();

        while (i <= num){
           sum += i;
           i += 2;
            }
        System.out.println("The sum of even numbers up to " + num + " is " + sum);

        }
    }

