package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * throughout demo of for
 */

public class FlexibleFor {
    public static void main(String[] args) {
        int startVal = 0;
        int endVal = 0;
        int step;
        Scanner scanner = new Scanner(System.in);
        int iterations = 0;
        System.out.println("enter start end step");
        startVal = scanner.nextInt();
        endVal = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = startVal; i <= endVal; i+= step){
            iterations++;
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("iterations: " + iterations);

    }
}
