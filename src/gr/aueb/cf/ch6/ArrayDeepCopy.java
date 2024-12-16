package gr.aueb.cf.ch6;

public class ArrayDeepCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5 };
        int[] copied;
        copied = arrDeepCopy(arr);

    }

    /**
     *
     * @param source ειναι αρχικος
     * @return το αντιγραφο πινακα
     */
    public static int[] arrDeepCopy(int[] source){
        int[] destination = new int[source.length];

        for (int i =0; i< source.length; i++){
            destination[i] = source[i];
        }
        return destination;
    }
}
