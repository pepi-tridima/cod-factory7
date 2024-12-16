package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * μ.ο >= 9 αριστα
 * μ.ο >= 7 πολυ καλα
 * μ.ο. >= 5 καλως
 * μ.ο.<5 αποτυχία
 */

public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int average = 0;
        int coursesCount = 0;
        int totalMarks = 0;

        System.out.println("insert total marks");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0){
            System.out.println("Total marks must not be zero");
            System.exit(1);
        }
        System.out.println("please insert courses count");
        coursesCount = scanner.nextInt();

        if (coursesCount <= 0){
            System.out.println("courses count must not be zero or negative");
            System.exit(1);

        }
        average = totalMarks / coursesCount;

        if (average > 10){
            System.out.println("Error. average must be less or equal than ten");
            System.exit(1);

        }
        if (average >= 9){
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("very good");

        } else if (average >= 5) {
            System.out.println("good");

        } else { // average < 5
            System.out.println("failure");
        }
    }
}
