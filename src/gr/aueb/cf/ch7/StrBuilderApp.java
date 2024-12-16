package gr.aueb.cf.ch7;

public class StrBuilderApp {
    public static void main(String[] args) {
        String concatStr = "";
        long timeStart = 0L;
        long timeEnd = 0L;
        double elapsedTime = 0.0;

        timeStart = System.currentTimeMillis();

        for (int i = 1; i <= 50_000; i++ ){
            concatStr = concatStr + i;
        }
        elapsedTime = (timeEnd - timeStart) / 1000.0;
    }
}
