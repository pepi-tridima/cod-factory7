package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {
    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("ο", 2);
        int positionOfSecondo = cf.lastIndexOf("ο");

        String cf2 = cf.substring(0);  // "Coding Factory"
        String slice = cf.substring(1,3); // od
    }
}
