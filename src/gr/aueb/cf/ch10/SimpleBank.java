package gr.aueb.cf.ch10;

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

    public static void deposit(double amount) throws IllegalArgumentException{
        try{
            if (amount <= 0){
                throw new IllegalArgumentException("ammount must be positive");
            }
            balance += amount;  // balance = balance - amount
            System.out.println("successfully deposited:" + amount);  //log
        } catch (IllegalArgumentException e){
            System.err.println("error " + e.getMessage());          //log
            throw e;
        }
    }

    public static void withdraw(double amount) throws Exception{
        try{
            if (amount <= 0){
                throw new IllegalArgumentException("ammount must be positive");
            }
            if (amount > balance){
                throw new IllegalArgumentException("amount must be less than balance");
            }
            balance -= amount;  // balance = balance - amount
            System.out.println("successfully withdrawn:" + amount);  //log
        } catch (IllegalArgumentException e){
            System.err.println("error " + e.getMessage());          //log
            throw e;
        }
    }
}
