package gr.aueb.cf.ch5;

import java.util.Scanner;

public class DivisionApp {
    public static void main(String[] args) {
        double num1;
        double num2;
        double div = 0d;
        double mod = 0.0;
        float myFloat = 4.5F;
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert 2 numbers");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        div = num1 / num2;
        mod = num1 % num2;

        System.out.printf("Div %.2f\n", div);
        System.out.printf("Mod %,2f", mod);
    }
}
