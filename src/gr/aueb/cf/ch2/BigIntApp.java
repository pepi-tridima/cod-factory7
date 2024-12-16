package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class BigIntApp {
    public static void main(String[] args) {
        // Declarations and Initialaziation
        BigInteger bigNum1 = new BigInteger("123456789987654321");
        BigInteger bigNUM2 = new BigInteger("123456789987654321");
        BigInteger result;

        //Commands
        result = bigNum1.add(bigNUM2);

        //Printing the results
        System.out.printf("%,d ", result);

    }
}
