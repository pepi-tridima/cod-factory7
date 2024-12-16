package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringChallenge1 {

        public static void main(String[] args) {
            // Δοκιμή του προγράμματος κρυπτογράφησης
            Scanner scanner = new Scanner(System.in);
            String plainText = "";

            System.out.println("Δώστε το κείμενο προς κρυπτογράφηση: ");
            plainText = scanner.nextLine();

            String encrypted = encrypt(plainText);
            System.out.println("Κρυπτογραφημένο κείμενο: " + encrypted);

            scanner.close();
        }
    // Μέθοδος κρυπτογράφησης
    public static String encrypt(String text) {
        StringBuilder sb = new StringBuilder();

        // Διατρέχουμε κάθε χαρακτήρα στο κείμενο
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            sb.append((char) (c + 1)); // Αύξηση του χαρακτήρα κατά 1 στον ASCII πίνακα
        }

        return sb.toString();
    }
    }

