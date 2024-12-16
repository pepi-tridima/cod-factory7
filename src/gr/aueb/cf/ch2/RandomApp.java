package gr.aueb.cf.ch2;

public class RandomApp {
    public static void main(String[] args) {
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("Το αποτελεσμα: " + dice);
    }
}
