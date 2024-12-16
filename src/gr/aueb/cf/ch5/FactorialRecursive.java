package gr.aueb.cf.ch5;

/**
 * n! = 1*2*3*...n
 * n! = (n-1)! * n
 * n! = (n-2)! * (n-1)! * n
 */

public class FactorialRecursive {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.println(facto(i));
        }

    }
    public static int facto(int n){
      //  if (n<=1) return 1;
     //   return facto(n-1) * n;

        return (n <= 1) ? 1 : facto(n-1) * n;
    }
}
