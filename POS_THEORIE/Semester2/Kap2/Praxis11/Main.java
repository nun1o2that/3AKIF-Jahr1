import java.util.Scanner;
import java.util.*;

public class Main {
    
    public static void menue() {
        System.out.println("\n" + "------------------------------------------------------");
        System.out.println("    1 - Ausgabe der Tage eines Monats");
        System.out.println("    2 - Alle Monate Ausgeben");
        System.out.println("    3 - Summe und Monatsdurchschnitt aller Tage");
        System.out.println();
        System.out.println("    0 - Programm beenden");
        System.out.println("------------------------------------------------------");
        System.out.print("Welche Option? ");
    }

    public static void main ( String[] args ) {

        MonateMap maps = new MonateMap();
        Scanner scan = new Scanner(System.in);
        int user = 0;

        System.out.println("\n" + "Willkommen!");

        do {

            menue();
            do {
                user = scan.nextInt();
                if ( user < 0 || user > 3 ) {
                    System.out.println("Falsche Eingabe! Nocheinmal probieren!" + "\n");
                }

            } while( user < 0 || user > 3 );

            System.out.println();

            if (user == 1) {
                maps.ausgabe_tageEinesMonats();
            }
            else if (user == 2) {
                maps.ausgabe_ALLE();
            }
            else if (user == 3) {
                maps.summeUndDurchschnitt();
            }

        } while(user != 0);

        scan.close();

        System.out.println("\n" + "ByeBye!" + "\n");

    }

}
