package gr.aueb.cf.ch6;

public class ArraysAsCollections {
    public static void main(String[] args) {
        int[] arr = {1, 11, 21, 31, 8, 9};

    }
    // filtering
    public static int[] getEvens(int[] arr){
        int count = 0;
        int pivot = 0;

        for (int el : arr){
            if (el % 2 == 0)
                count++;
        }
        int[] evens = new int[count];

        for (int el : arr){
            if (el % 2 == 0){
                evens[pivot++] = el;
            }
        }
        return evens;
    }
    //mapping
    public static int[] mapToDouble(int[] arr){
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }
    // reducing
    public static int sum(int[] arr){
        int sum = 0;

        for (int el : arr){
            sum += el;
        }
        return sum;

    }

    public static double avg(int[] arr){

        /* for (int el : arr){
            sum += el;
        } */
        return sum(arr) / (double) arr.length;

    }

    public static boolean anyEven(int[] arr){
        boolean anyEven = false;
        for (int el : arr){
            if (el % 2 == 0){
                anyEven = true;
                break;
            }
        }
        return anyEven;
    }

    public static boolean moreThanTwoEvens(int[] arr){
        int count = 0;
        for (int el : arr) {
            if (el % 2 == 0) {
                count++;
            }
        }
        return count > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++){
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2){
                count++;
                break;
            }
        }
        return count >= 1;
    }

    public static boolean moreThanTwoSameEnding(int[] arr){
        int[] endings = new int[10];
        boolean sameEnding = false;
        for (int num : arr){
            endings[num % 10]++;
        }
        for (int count : endings){
            if (count >= 3){
                sameEnding = true;
                break;
            }
        }
        return sameEnding;
    }

    public static boolean allAreEvens(int[] arr){
       // return getEvens(arr).length == arr.length;

        boolean isEven = false;
        int count = 0;

        for (int el : arr){
            if (el % 2 == 0){
                count++;
            }
        }
        return count == arr.length;
    }

}
