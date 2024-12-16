package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choise;

        do {
            System.out.println("επιλεξτε ενα απο τα παρακατω");
            System.out.println("1. one-player");
            System.out.println("2. two-players");
            System.out.println("3. team ");
            System.out.println("4. quit");

            choise = scanner.nextInt();

            if (choise < 1 || choise > 4) {
                System.out.println("choise between 1-4");
                System.out.println("try again");
                continue;
            }
            if (choise == 1) {
                System.out.println("one");
            } else if (choise == 2) {
                System.out.println("two");
            } else if (choise == 3) {
                System.out.println("team");
            } else {
                System.out.println("quit");
            }

        }while (choise != 4);






        switch (choise) {
            case 1:
                System.out.println("one-player");
            case 2:
                System.out.println("two-player");
            case 3:
                System.out.println("team");
            case 4:
                System.out.println("quiting");
            default:
                System.out.println("error in choise");
                break;

        }
    }


}

