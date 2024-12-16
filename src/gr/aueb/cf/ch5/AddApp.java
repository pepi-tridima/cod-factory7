package gr.aueb.cf.ch5;

import java.util.Scanner;

/** υπολογιζει το αθροισμα 2 ακεραιων
 * με τη χρηση μεθοδων
 */

public class AddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;
        int sub = 0;

        System.out.println("insert two integers");
        a = scanner.nextInt();
        b = scanner.nextInt();

         sum = add(a,b);
         sub = AddApp.sub(a,b);

        System.out.println(sum);
        System.out.println(sub);

    }

    /**
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */
    public static int add(int a, int b){
        int result = 0;
        result = a + b;
       // return result;
        //  η θα μπορουσαμε
        return a + b;
    }

    /**
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sub of the two integers
     */
    public static int sub(int a, int b){
        return a - b;
    }

}
