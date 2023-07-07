import java.util.Scanner;
import java.util.regex.*;

/**
* Erledigt Spiel-Loop und Eingabe fuer die Initialisierung des Spielfelds
**/
public class Main {

    /**
    * Benutzereingabe zur Bestimmung der Groesse des Spielfelds, wird 2 mal aufgerufen
    * @param OPTION : bei 1 Ausgabe Zeilenfrage, sonst Spaltenfrage
    * @return der Wert des Spielers
    **/
    public static int rechteckGroesse(int OPTION) {

        Scanner scan = new Scanner(System.in);
        String antwort;
        String antwortMuster = "";
        boolean valid = true;

        do {

            valid = true;

            // Limitierung Zeilen: hoechstens 26 -> kleingeschriebenes Alphabet a-z
            if (OPTION == 1) {
                antwortMuster = "[12][0123456]";
                System.out.print("\n" + "Wie viele Zeilen soll das Spielfeld haben? (Min 10, Max 26!): ");
            }
            // Limitierung Spalten: hoechstens 36 -> Zahlen 0-9, dann grossgeschriebenes Alphabet A-z
            else if (OPTION == 2) {
                antwortMuster = "[123][0123456]";
                System.out.print("\n" + "Wie viele Spalten soll das Spielfeld haben? (Min 10, Max 36!): ");

            }

            antwort = scan.nextLine();

            if ( !Pattern.matches(antwortMuster, antwort) ) {
                System.out.println("Falsche Eingabe! Nocheinmal versuchen!");
                valid = false;
            }
            
        } while(!valid);

        return Integer.valueOf(antwort);        
    }

    /**
    * Dient der Benutzereingabe nach der Initialisierung, mit Regex-Ueberpruefung
    * @return was eingegeben wurde
    **/
    public static String eingabe() {
        Scanner scan = new Scanner(System.in);
        String user = "";

        System.out.println("\n" + "2 - U-Boot (2 Kaestchen)");
        System.out.println("3 - Zerstoerer (3 Kaestchen)");
        System.out.println("4 - Kreuzer (4 Kaestchen)");
        System.out.println("5 - Schlachtschiff (5 Kaestchen)");

        do {
            System.out.print("\n" + "Welche Art von Schiff? [2,3,4,5] oder Spielende [x]: ");
            user = scan.nextLine().trim();

            if ( !Pattern.matches("[2345xX]", user) ) {
                System.out.println("Falsche Eingabe! Nocheinmal versuchen!");
            }
        } while( !Pattern.matches("[2345xX]", user) );

        return user;
    }

    /**
    * main-Methode fuer den Spiel-Loop
    **/
    public static void main ( String[] args ) {

        int zeilen;
        int spalten;
        String user;

        System.out.println("\n" + "Willkommen!");
        zeilen = rechteckGroesse(1);
        spalten = rechteckGroesse(2);

        SchiffeVersenken spiel = new SchiffeVersenken(zeilen, spalten);

        do {
            spiel.ausgabe();

            user = eingabe();
            if ( !Pattern.matches("[Xx]", user) ) {
                spiel.schiffSetzen(Integer.valueOf(user));
            }

        } while( !Pattern.matches("[Xx]", user) );

        System.out.println("\n" + "ByeBye!");

    }

}