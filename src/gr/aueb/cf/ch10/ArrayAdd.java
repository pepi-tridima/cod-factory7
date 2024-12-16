package gr.aueb.cf.ch10;

public class ArrayAdd {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9};
        int[] arrOut;

        arrOut = addOne(arr);

        for (int el : arrOut){
            System.out.print(el + " ");
        }

    }
    public static int[] addOne(int[] arr){
        int[] arrOut;
        int currentSum;
        int carry = 1;

        if (arr == null) throw new IllegalArgumentException("error");
        arrOut = new int[arr.length + 1];

        for (int i = arr.length - 1; i >= 0; i--){
            currentSum = arr[i] + carry;

            arrOut[i + 1] = currentSum % 10;
            carry = currentSum / 10;
        }
        arrOut[0] = carry;
        return arrOut;
    }
}
