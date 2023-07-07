import java.util.*;
import java.util.regex.*;

public class Lachautomat {

    /**
    * Methode zur Ausgabe des Hauptmenues.
    **/
    static void menue() {
        System.out.println("-----------------------------------------------");
        System.out.println(" 1 - Lacher eingeben");
        System.out.println(" X - Programm beenden");
        System.out.println("-----------------------------------------------");
        System.out.print("Welche Option? [1/X]: ");
    }

    /**
    * Methode zur Eingabe eines Lachers
    * Weiterleitung in die Methode lacherMatchen(String uebergabe)
    **/
    static void eingabe() {
        Scanner scan = new Scanner(System.in);
        String wirdGeprueft;
        System.out.print("Eingabe: ");
            wirdGeprueft = scan.nextLine();
        System.out.println();

        lacherMatchen(wirdGeprueft);
    }

    /**
    * Ueberprueft den eingegebenen / generierten Lacher auf Gueltigkeit
    * @param uebergabe von eingabe()-Methode mitgegeben
    **/
    static void lacherMatchen(String uebergabe) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                   
        if ( Pattern.matches("([h][a])+|([h][i])+|([h][o])+", uebergabe) ) {
            System.out.println("        Lacher GUELTIG!   ");
        }
        else {
            System.out.println("     Lacher NICHT gueltig!");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");
    }

    /**
    * MAIN-METHODE
    **/
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