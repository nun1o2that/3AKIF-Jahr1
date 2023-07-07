import java.util.Scanner;
import java.util.regex.*;

/**
* Klasse fuer das Spiel selber
* Ausgabe des Spielfelds, Platzieren von Schiffen
**/
public class SchiffeVersenken {

    String[][] SPIELFELD;
    int zeilen;
    int spalten;

    /**
    * Konstruktor der Klasse SchiffeVersenken, initialisiert das 2D-Array dieser Klasse
    * @param zeilen in der Main-Klasse vom User eingegeben und mitgegeben
    * @param spalten in der Main-Klasse vom User eingegeben und mitgegeben
    **/
    public SchiffeVersenken(int zeilen, int spalten) {
        this.zeilen = zeilen;
        this.spalten = spalten;
        SPIELFELD = new String[this.zeilen][this.spalten];

        spielfeldFuellen();
    }

    /**
    * Fuellt das Spielfeld mit Bindestrichen -, stellen Wasser dar
    **/
    public void spielfeldFuellen() {

        for(int x = 0; x < zeilen; x++) {

            for(int y = 0; y < spalten; y++) {
                SPIELFELD[x][y] = "-";
            }
            
        }

    }

    /**
    * Ausgabe des Spielfelds inklusive Zeilen- und Spaltenbeschriftung, unter Benutzung des Modulo-Operators
    **/
    public void ausgabe() {

        int x = 0;
        int y = 0;
        String buchstaben = "abcdefghijklmnopqrstuvwxyz";
        String nummern = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.print("\n" + "  | ");

        // Ausgabe der Zahlen oben
        for (int i = 0; i < this.spalten; i++) {
            System.out.print(nummern.charAt(i) + " ");
        }

        // Ausgabe der Striche unter den Buchstaben, so lang wie das Feld ist
        System.out.println();
        System.out.print("---");
        for (int i = 0; i < this.spalten; i++) {
            System.out.print("--");
        }
        System.out.println();

        // Ausgabe des Spielfelds selber, mit Buchstaben links bei jedem Zeilenanfang
        while (x < this.zeilen) {

            // Zeilenumbruch
            if ( (y % this.spalten) == 0 && (y > 0) ) {
                System.out.println();
                x++;
                y = 0;
            }

            // Zeilenanfang: entsprechender Buchstabe fuer jede Zeile, dann pipe |
            if (y == 0 && x != this.zeilen) {
                System.out.print(buchstaben.charAt(x) + " | ");
            }

            // Ausgabe der Array-Werte
            if (x != this.zeilen) {
                System.out.print(SPIELFELD[x][y] + " ");
            }

            y++;
            
        }

    }

    /**
    * Funktion zum Platzieren von Schiffen auf dem Spielfeld, ein Feld nach dem anderen
    * Ueberpruefung der Eingabe des Benutzers mit Hilfe von Regex, der basierend auf der Groesse des Feldes generiert wird
    * dabei ist String buchstaben fuer die ZEILEN zustaendig, String nummern fuer die SPALTEN
    * abhaengig von der Ausgewaehlten Schiffart werden bestimmte Buchstaben auf das Feld gesetzt
    **/
    public void schiffSetzen(int schiffGroesse) {
        Scanner scan = new Scanner(System.in);
        String buchstaben = "abcdefghijklmnopqrstuvwxyz";           // ZEILEN-Auswahl - wird unten nach Bedarf gekuerzt
        String nummern = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";    // SPALTEN-Auswahl - wird unten nach Bedarf gekuerzt
        String antwortMuster = "";
        String user;
        String schiffArt = "";

        switch(schiffGroesse) {
            case 2: schiffArt = "U"; break; // U-Boot
            case 3: schiffArt = "Z"; break; // Zerstoerer
            case 4: schiffArt = "K"; break; // Kreuzer
            case 5: schiffArt = "S"; break; // Schlachtschiff
        }

        // Strings werden abhaengig von der Anzahl der Spalten / Zeilen an der entsprechenden Position abgeschnitten
        buchstaben = buchstaben.substring(0, this.zeilen);
        nummern = nummern.substring(0, this.spalten);

        // amtwortMuster Format z.B: [abcdefghij][123456789ABCDEF]
        antwortMuster += "[" + buchstaben + "]"; 
        antwortMuster += "[" + nummern + "]";
        // System.out.println(antwortMuster);   // Test

        while(schiffGroesse > 0) {

            do {
                System.out.println("\n" + "Noch " + schiffGroesse + " Kaestchen zum Platzieren uebrig...");
                System.out.print("Wohin das Schiff setzen? Format z.B [a1] oder [bF]: ");
                user = scan.nextLine();

                if ( !Pattern.matches(antwortMuster, user) ) {
                    System.out.println("\n" + "Dieses Feld existiert nicht! Nocheinmal probieren!");
                }

            } while( !Pattern.matches(antwortMuster, user) );

            // ZEILENWAHL auf Index 0 der user-Variable, Verwandlung dieses CHARS in STRING, und suche nach diesem Text im buchstaben-Variable -> INT - Zeile im Array 
            // SPALTENWAHL auf Index 1 der user-Variable, Verwandlung dieses CHARS in STRING, und suche nach diesem Text in nummern-Variable -> INT - Spalte im Array
            SPIELFELD[buchstaben.indexOf(Character.toString(user.charAt(0)))][nummern.indexOf(Character.toString(user.charAt(1)))] = schiffArt; 

            schiffGroesse--;

        }

    }

}