package gr.aueb.cf.ch6;

/**
 * δηλωση και αρχικοποιηση πινακα
 * populate πινακα
 * new
 * unsized init
 * array initializer
 * print τα στοιχεια πινακα
 */

public class ArrayInit {
    public static void main(String[] args) {
        int [] arr = new int[3]; //declare and initiate
        int [] arr2 = {1, 2, 3, 4, 5 };  // unsized initialization
        int [] arr3 = new int[] {1, 2, 3, 4, 5 };  //array initializer


       // populate
        arr [0] = 5;
        arr [1] = 10;
        arr [2] = 4;

        // traverse
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");

        }
        // enhanced for
        for (int el : arr3){
            System.out.print(el + " ");
        }
    }
}
