package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * αντιγραφει ενα pdf αρχειο binary file
 */
public class PdfCopyApp {
    public static void main(String[] args) {
        int b;
        int counter = 0;
        long start;
        long end;
        double elapsedTime = 0.0;
        try (FileInputStream fls = new FileInputStream("C:/tmp/dummy.pdf");
             FileOutputStream fos = new FileOutputStream("C:/tmp/dummy-out.pdf")){
            start = System.currentTimeMillis();
            while ((b = fls.read()) != -1){
               fos.write(b);
               counter++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end-start) / 1000.0;

            System.out.printf("το αρχειο με μεγεθος %1fKB(%d bytes) αντιγραφηκε επιτυχώς",(counter / 1024.0), counter);
            System.out.println("elapsed time:" + elapsedTime + "seconds");

        }catch (IOException e){
            System.err.println(e.getMessage());

        }

    }
}
