package gr.aueb.cf.ch8;

public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i <= arr.length; i++){     //δε γινεται try catch πρεπει να βρουμε το λαθος και να το διορθωσουμρ
            System.out.print(arr[i] + " ");
        }
    }
}
