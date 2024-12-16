package gr.aueb.cf.ch4;

/**
 * calculates sum and mul of the 10 first integers
 */

public class ForSumMulApp {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i<= 10; i++){
            sum += i;
            mul *= 1;

        }
        System.out.println("sum:" + sum);
        System.out.println("mul:" + mul);

    }
}
