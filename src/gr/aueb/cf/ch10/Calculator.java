package gr.aueb.cf.ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        try {
            System.out.print("εισάγετε 2 ακεραίους");
            num1 = in.nextInt();
            num2 = in.nextInt();

            result = div(num1, num2);

            System.out.println("sum:" + result);
        }catch (InputMismatchException e){
            System.out.println("η εισοδος πρεπει να ειναι ακεραιοι");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Λάθος στον υπολογισμό. Δε γίνεται διαίρεση με το μηδέν");
        }


    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static int div(int a, int b) throws Exception{
        try{
            if (b == 0) throw new Exception("Denominator must not be zero");
            return a / b;
        }catch (Exception e){
            System.err.println("ERROR." + e.getMessage());
            throw e;
        }
    }

    public static int mod(int a, int b) throws Exception{
        try{
            if (b == 0) throw new Exception("Denominator must not be zero");
            return a % b;
        }catch (Exception e){
            System.err.println("ERROR." + e.getMessage());
            throw e;
        }
    }
}
