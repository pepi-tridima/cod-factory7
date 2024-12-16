package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Show a menu at least once
 */

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choise;

        do {
            System.out.println("please select one of the following: ");
            System.out.println("1. Insert");
            System.out.println("Delete");
            System.out.println("Quit");
            choise = in.nextInt();
        } while (choise != 3);
        System.out.println("Thaks for using Menu App");
    }
}
