import java.util.Scanner;
import java.math.BigDecimal;

/**
* Klasse fuer den Command-Line Output und fuer Benutzereingaben
**/
public class CLI {

    /**
    * Methode zum Ausgeben des Menues, das bis zur Eingabe von '0' wiederholt wird
    * @return Auswahl die der Benutzer faellt; in main() weiterbenutzt
    **/
    private static int menue() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n----------------------------------------------------------------");
        System.out.println(" 1 - Neue Buchung erstellen & hinzufuegen");
        System.out.println(" 2 - Buchung aus Liste loeschen");
        System.out.println(" 3 - Groesste Buchungsnummer ausgeben");
        System.out.println(" 4 - Ausgaben (Minuswerte) auflisten");
        System.out.println(" 5 - Summe der Betraege ausrechnen");
        System.out.println(" 6 - Alle Buchungen ausgeben\n");
        System.out.println(" 0 - Programm beenden");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Welche Option? ");
        return scan.nextInt();
    }

    /**
    * Methode zum Erstellen einer neuen Buchung
    * Es wird ausgewaehlt, ob eine normale oder detaillierte Buchung erfasst wird, dann werden die Eigenschaften eingegeen
    * @return eine neue Buchung mittels new-Keywort, also Konstruktor der Buchungszeile- / DetailBuchungszeile-Klassen; wird in main() weitergegeben (Zeile 95)
    **/
    private static Buchungszeile buchungErfassen() {
        Scanner scan = new Scanner(System.in);
        int wahl = 0;

        int buchungsnummer;
        String datum = "";
        double betrag = 0;

        System.out.print("\nDetaillierte Buchung erstellen (mit Kommentar & Kontonummer)? [0, 1]: ");
            wahl = Integer.parseInt(scan.nextLine());

        System.out.print("\nBuchungsnummer: ");
            buchungsnummer = Integer.parseInt(scan.nextLine());
        System.out.print("Datum der Buchung: ");
            datum = scan.nextLine();
        System.out.print("Betrag der Buchung (Dezimal, mit Punkt): ");
            betrag = Double.parseDouble(scan.nextLine());

        if (wahl == 1) {
            String kommentar = "";
            int kontonummer = 0;

            System.out.print("Kommentar: ");
                kommentar = scan.nextLine();
            System.out.print("Kontonummer: ");
                kontonummer = scan.nextInt();
                
            return new DetailBuchungszeile(buchungsnummer, new Date(datum), new BigDecimal(betrag), kommentar, kontonummer);
        }

        else {
            return new Buchungszeile(buchungsnummer, new Date(datum), new BigDecimal(betrag));
        }

    }

    /**
    * Methode zur Eingabe einer Buchungsnummer, deren Buchung geloescht werden soll
    * @return die Buchungszeile, die geloescht werden soll; wird in main() weitergegeben (Zeile 96)
    **/
    private static int buchungLoeschen() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nWelche Buchung loeschen? (Buchungsnummer eingeben!) ");
        return scan.nextInt();
    }

    /**
    * you know her you love her
    **/
    public static void main ( String[] args ) {

        EA_Listenverwaltung datenbank = new EA_Listenverwaltung();
        int wahl = 0;

        System.out.println("\nWilkommen zum CLI!");

        /* Hauptloop des Programms; Menue mit Auswahl, dann Ausgaben bzw. Methoden der EA_Listenverwaltung-Klasse */
        do {
            wahl = menue();
            System.out.print("\n****************************************************************");
            switch (wahl) {
                case 1: datenbank.addBuchung(buchungErfassen()); break;
                case 2: datenbank.storniereBuchung(buchungLoeschen()); break;
                case 3: System.out.println("\nGroesste Buchungsnummer: " + datenbank.maxBuchungsnummer()); break;
                case 4: datenbank.printAusgaben(); break;
                case 5: datenbank.printSumme(); break;
                case 6: datenbank.printAlle(); break;
                case 0: System.out.println("\nByeBye!"); break;
            }
            System.out.println("****************************************************************");
        } while (wahl != 0);

    }

}