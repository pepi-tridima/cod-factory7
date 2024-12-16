package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator;
        int denominator;
        int result;

        while (true){
            System.out.println("insert numerator(quit numerator = 0)");
            numerator = scanner.nextInt();
            denominator = scanner.nextInt();

            if (denominator == 0){
                System.out.println("numerator is zero. quiting..");
                break;
            }
            if (denominator == 0){
                System.out.println("denominator must not be zero");
                continue;
            }
            result = numerator / denominator;
            System.out.println("result" + result);




         //    System.out.println("insert denominator");
            //            if (denominator != 0){
            //                if (numerator !=0){
            //                    result = numerator / denominator;
            //
            //                } else {
            //                    System.out.println("Numerator is zero");
            //                    continue;
            //                }
            //            } else {
            //                System.out.println("Denominator is zero");
            //                break;
            //            }
        }
    }
}
