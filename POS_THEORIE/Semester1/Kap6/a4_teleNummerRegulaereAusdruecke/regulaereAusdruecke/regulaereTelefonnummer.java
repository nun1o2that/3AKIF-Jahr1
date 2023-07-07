// Erstelle regulaere Ausdruecke fuer eine gueltige E-Mail-Adresse und fuer Telefonnummern 
// (z.B. 0664/1234567 und +43 677 1234567) und implementiere diese in Java 

import java.lang.Thread;
import java.io.*;

import java.util.*;
import java.util.regex.*;

public class regulaereTelefonnummer {

    /**
    * Methode zur Ausgabe des Hauptmenues.
    **/
    static void menue() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println(" 1 - Nummer eingeben");
        System.out.println(" 2 - Generieren lassen");
        System.out.println(" X - Programm beenden");
        System.out.println("--------------------------------------------------------------------");
        System.out.print("Welche Option? [1/2/X]: ");
    }

    /**
    * Methode zur Eingabe einer Telefonnnummer
    * Weiterleitung in die Methode nummerMatchen(String uebergabe)
    **/
    static void eingabe() {
        Scanner scan = new Scanner(System.in);
        String wirdGeprueft;
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Moegliche Formen (muessen genau uebernommen werden!)");
        System.out.println("     0664/1234567        +43 677 1234567");
        System.out.println("--------------------------------------------------------------------");
        System.out.print("Eingabe: ");
            wirdGeprueft = scan.nextLine();
        System.out.println();

        nummerMatchen(wirdGeprueft);
    }

    /**
    * Methode zur Generation einer Telefonnummer nach dem gegebenen Schema
    * Auswahl einer Art, oder zufaellig
    * Weiterleitung in die Methode nummerMatchen(String uebergabe)
    **/
    static void randomized() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String wirdGeprueft;
        boolean gemacht = false;

        do {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Moegliche Formen");
            System.out.println("     a: 0664/1234567      b: +43 677 1234567");
            System.out.println("oder c: Zufall");
            System.out.println("--------------------------------------------------------------------");
            System.out.print("Welche Form? [a/b/c]: ");
                wirdGeprueft = scan.nextLine();

            // FALL A
            if ( wirdGeprueft.equals("a") || wirdGeprueft.equals("A") ) {
                wirdGeprueft = "0";
                for (int i = 0; i < 3; i++) {
                    wirdGeprueft += Integer.valueOf(rand.nextInt(9) + 1);
                }

                wirdGeprueft += "/";
                for (int i = 0; i < 7; i++) {
                    wirdGeprueft += Integer.valueOf(rand.nextInt(9) + 1);
                }

                gemacht = true;
            }
            // FALL B
            else if ( wirdGeprueft.equals("b") || wirdGeprueft.equals("B") ) {
                wirdGeprueft = "+43 ";
                for (int i = 0; i < 3; i++) {
                    wirdGeprueft += Integer.valueOf(rand.nextInt(9) + 1);
                }

                wirdGeprueft += " ";
                for (int i = 0; i < 7; i++) {
                    wirdGeprueft += Integer.valueOf(rand.nextInt(9) + 1);
                }

                gemacht = true;
            }
            // FALL C
            else if ( wirdGeprueft.equals("c") || wirdGeprueft.equals("C") ) {
                wirdGeprueft = "ab";
                wirdGeprueft = String.valueOf(wirdGeprueft.charAt(rand.nextInt(2)));
            }
            else {
                System.out.println("\n" + "Falsche Eingabe! Nocheinmal versuchen!" + "\n");
            }
        } while (gemacht == false);

        // Nach jedem Output eine Sekunde Wartezeit; Programm wirkt, als wuerde es wirklich "laden"
        try {
            System.out.print("\n" + "Nummer wird generiert");

            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(1000);
            }
            System.out.println("\n");
        }
        catch (Exception e) {
            System.out.println("FEHLER!");
        }

        System.out.println("Deine Nummer: " + wirdGeprueft);

        nummerMatchen(wirdGeprueft);
    }

    /**
    * Ueberprueft die eingegebene / generierte Nummer auf Gueltigkeit
    * @param uebergabe von randomized()-Methode / eingabe()-Methode mitgegeben
    **/
    static void nummerMatchen(String uebergabe) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                   
        if ( Pattern.matches("0[1-9]{3}[\\/][1-9]{7}", uebergabe) || Pattern.matches("\\+43\\s[1-9]{3}\\s[1-9]{7}", uebergabe) ) {
            System.out.println("     Telefonnummer GUELTIG!   ");
        }
        else {
            System.out.println("  Telefonnummer NICHT gueltig!");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");
    }

    /**
    * MAIN-METHODE
    **/
    public static void main ( String[] args ) throws InterruptedException {

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
            else if (user.equals("2")) {
                randomized();
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