package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * 153 = 1^3 + 5^3 + 3^3
 */
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int digitNumber = 0;
        int originalNum;
        int digit;

        System.out.println("enter a number");
        
        num = in.nextInt();
        digitNumber = String.valueOf(num).length(); // valueof transforms a primitive to string
        originalNum = num;

        while (num != 0){
            digit = num % 10;
            sum+= (int) Math.pow(digit, digitNumber);
            num /= 10;
        }

        System.out.printf("%d%s Armstrong", originalNum, (sum == originalNum ? "is " : "is not"));
    }
}
