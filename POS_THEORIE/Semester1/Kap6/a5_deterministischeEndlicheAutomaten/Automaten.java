import java.util.*;
import java.util.regex.*;

public class Automaten {

    /**
    * Methode zur Ausgabe des Hauptmenues.
    **/
    static void menue() {
        System.out.println("-----------------------------------------------");
        System.out.println(" 1 - String eingeben");
        System.out.println(" X - Programm beenden");
        System.out.println("-----------------------------------------------");
        System.out.print("Welche Option? [1/X]: ");
    }

    /**
    * Methode zur Eingabe eines Strings
    * Weiterleitung in die Methode stringMatchen(String uebergabe)
    **/
    static void eingabe() {
        Scanner scan = new Scanner(System.in);
        String wirdGeprueft;
        System.out.print("Eingabe: ");
            wirdGeprueft = scan.nextLine();
        System.out.println();

        stringMatchen(wirdGeprueft);
    }

    /**
    * Ueberprueft den eingegebenen auf Gueltigkeit
    * @param uebergabe von eingabe()-Methode mitgegeben
    **/
    static void stringMatchen(String uebergabe) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                   
        if ( Pattern.matches("(a+b)+", uebergabe) ) {
            System.out.println("Regex: MATCH.");
        }
        else {
            System.out.println("Regex: NO MATCH.");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");
    }

    public static void main ( String[] args ) {

        String user;
        Scanner scan = new Scanner(System.in);

        System.out.println("\n" + "Willkommen!");
        do {
            menue();
            user = scan.next();
            System.out.println();

            if (user.equals("1")) {
                eingabe();
            }
            else if ( user.equals("X") || user.equals("x") ) {
                System.out.println("<~-Auf Wiedersehen!-~>");
            }
            else {
                System.out.println("Falsche Eingabe! Nocheinmal versuchen!");
            }
        } while( !user.equals("X") && !user.equals("x") );

    }
    
}

