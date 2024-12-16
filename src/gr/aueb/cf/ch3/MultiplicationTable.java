package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *  Δίνει ως output τον πολ/σμό ενο΄ς ακεραίου
 *  που δίνει με όλους τους ακέραιους από 1-10
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;

        System.out.println("please insert a number");
        inputNum = scanner.nextInt();

        while (i <= 10){
           // System.out.println(inputNum + "*" + i + "=" + (inputNum * i));
            System.out.printf("%d * %2d = %d\n", inputNum, i, (inputNum * i) );
            i++;
        }
    }
}
