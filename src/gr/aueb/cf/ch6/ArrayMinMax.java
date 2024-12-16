package gr.aueb.cf.ch6;

public class ArrayMinMax {
    public static void main(String[] args) {

    }

    public static int getMinPosition(int[] arr){
        if (arr == null || arr.length < 1) return -1;
        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;  // Βαζουμε μια πολυ μεγαλη τιμή

        for (int i = 1; i< arr.length; i++){
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];

            }
        }
        return minPosition;
    }
    // Η' ΜΠΟΡΟΥΜΕ

    /*public static int getMinPosition(int[] arr){
        if (arr == null || arr.length < 1) return -1;
        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i< arr.length; i++){
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];

            }
        }
        return minPosition;
    } */

    /**
     * 3ος τροπος ευρεσης min
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int getMinPosition(int[] arr, int low, int high){
        if (arr == null || arr.length < 1) return -1;
        if (low < 0 || high > arr.length -1) return  -1;
        if (low > high) return  -1;
        int minPosition = low;
        int minValue = arr[low];

        for (int i = low; i <= high; i++){
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}


   /* public static int getMaxPosition(int[] arr){
        if (arr == null || arr.length < 1) return -1;
        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i< arr.length; i++){  // ξεκιναει απο 1 γιατι εχει ηδη τη θεση 0 και δε χρειαζεται να
                                                // συγκριθει με τον εαυτο του
            if (arr[i] > maxValue){
                maxPosition = i;
                maxValue = arr[i];

            }
        }
        return maxPosition; */

