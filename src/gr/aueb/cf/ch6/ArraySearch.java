package gr.aueb.cf.ch6;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5 };
        final int SECRET = 4;
        boolean found = false;

        for (int i = 0; i< arr.length; i++){
            if (arr[i] == SECRET){
                found = true;
                break;
            }
        }

        /*
         * Η'
         */
        for (int el : arr){
            if (el == SECRET){
                found = true;
            }
        }
        if (found) {
            System.out.println("secret found");
        }else {
            System.out.print("not found");
        }

    }
}
