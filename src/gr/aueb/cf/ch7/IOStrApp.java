package gr.aueb.cf.ch7;

import java.util.Scanner;

public class IOStrApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("insert two strings");
        s1 = in.next();  // διαβαζει μεχρι να βρει whitespace (space, tab, enter)
        s2 = in.nextLine();  //διαβαζει μεχρι να βρει αλλαγη γραμμης

        System.out.printf("s1: %s\n", s1);
        System.out.printf("s2: %s\n", s2);
    }
}
