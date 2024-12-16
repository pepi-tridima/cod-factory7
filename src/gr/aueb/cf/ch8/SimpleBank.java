package gr.aueb.cf.ch8;

import java.util.Scanner;

public class SimpleBank {

    static double balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try{
            deposit(100);
        } catch (Exception e){
            System.out.println("error occurred. try again...");
        }
    }

    public static void deposit(double ammount) throws IllegalArgumentException{
        try{
            if (ammount <= 0){
                throw new IllegalArgumentException("ammount must be positive");
            }
            balance += ammount;
            System.out.println("successfully deposited:" + ammount);  //log
        } catch (IllegalArgumentException e){
            System.err.println("error " + e.getMessage());          //log
            throw e;
        }
    }
}
