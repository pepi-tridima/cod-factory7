package gr.aueb.cf.ch6;

/**
 * copies reference of array.
 * shallow copy. has side effects
 */

public class ArrayReferenceCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrRefCopy = arr;

        for (int el : arrRefCopy){
            System.out.print(el + " ");
        }

        arrRefCopy[4] = 100;

        for (int el : arr ){
            System.out.print(el + " ");   // επηρεαζεται και ο αρχικος πινακας κ ας μη τον πειραξαμε,
                                                    // γιατι στη 13 καναμε
                                                          //shallow copy
        }

    }
}
