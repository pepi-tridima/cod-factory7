package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Special forms of while
 */

public class SpecialWhileTypes {
    public static void main(String[] args) {
        int i = 1;
        Scanner in = new Scanner(System.in);
        int num;

        while ((num = in.nextInt())>= 0);    //Μορφή χωρίς σώμα που απλά καταναλώνει θετικούς χωρίς να κάνει κάτι.

        while (i <= 0){
            System.out.println("Never gets in");
            i++;
        }
        while (i < 1){
            System.out.println("Never gets in");
            i++;
        }
        while (i <= 1){
            System.out.println("One time gets in");
            i++;

        }
        while (true){
            System.out.println("Eternal loop");
        }
    }
}
