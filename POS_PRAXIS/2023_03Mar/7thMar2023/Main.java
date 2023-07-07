import java.util.Scanner;
import java.util.regex.*;

/**
* Main-Klasse zur Benutzereingabe und Menueausgabe
**/
public class Main {

    /**
    * Zur wiederholten Ausgabe des Menues
    **/
    public static void menue() {
        System.out.println("---------------------------------------");
        System.out.println("  1 - Eingabe");
        System.out.println("  2 - Ausgabe gespeicherte Palindrome");
        System.out.println("  X - Beenden");
        System.out.println("---------------------------------------");
    }

    /**
    * main-Methode
    **/
    public static void main ( String[] args ) {

        Scanner scan = new Scanner(System.in);
        String user = "";
        Palindrom wortPruefer = new Palindrom();

        System.out.println("\n" + "Willkommen!" + "\n");

        /* Hauptloop */
        do {

            /* Eingabe-Loop, solange Eingabe falsch ist */
            do {
                menue();
                System.out.print("Welche Option? ");
                user = scan.nextLine();

                if ( !Pattern.matches("[12xX]", user) ) {
                    System.out.println("\n" + "Falsche Eingabe! Nocheinmal versuchen!" + "\n");
                }

            } while ( !Pattern.matches("[12xX]", user) );   /* Eingabe muss EINEM dieser Zeichen entsprechen */

            if ( user.equals("1") ) {
                System.out.print("\n" + "Worteingabe: ");
                user = scan.nextLine();
                wortPruefer.ueberpruefen(user.toLowerCase());   /* eingegebenes Wort in Kleinbuchstaben ruebergeschickt */
            }

            else if ( user.equals("2") ) {
                wortPruefer.ausgeben();
            }

        } while ( !Pattern.matches("[xX]", user) );

        System.out.println("\n" + "ByeBye!");
        scan.close();

    }

}