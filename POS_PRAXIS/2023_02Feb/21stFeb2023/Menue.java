import java.util.Scanner;

/**
* Hauptklasse des Programms
**/
public class Menue {
    
    /**
    * Menue, dass unten im Loop ist
    **/
    public static void menue() {
        System.out.println("\n" + "-------------------------------");
        System.out.println("  1 - Medium hinzufuegen");
        System.out.println("  2 - Medium loeschen");
        System.out.println("  3 - Medien ausgeben");
        System.out.println("  4 - Programm beenden");
        System.out.println("-------------------------------");
    }

    /* die MAIN you know her you love her */
    public static void main ( String[] args ) {

        Datenbank meineSammlung = new Datenbank();
        Scanner scan = new Scanner(System.in);
        int user = 0;

        System.out.println("\n" + "WILLKOMMEN zur CD/DVD-Liste :)");

        /* aeussere Schleife: solange der User nicht 4 - Programm beenden auswaehlt */
        do {

            /* Eingabeueberpruefung: im Menue nur 1, 2, 3, 4 erlaubt */
            do {

                menue();
                System.out.print("Welche Option? ");
                user = scan.nextInt();

                if ( !(user >= 1 && user <= 4) ) {
                    System.out.println("\n" + "*******************************");
                    System.out.println("Falsche Eingabe! Nocheinmal probieren!");
                    System.out.println("*******************************");
                }

            } while( !(user >= 1 && user <= 4) );

            System.out.println();

            switch(user) {
                case 1: meineSammlung.mediumHinzufuegen(); break;
                case 2: meineSammlung.mediumLoeschen(); break;
                case 3: meineSammlung.mediumAusgabe(); break;
            }


        } while(user != 4);

        System.out.println("ByeBye :)");

        scan.close();

    }

}
