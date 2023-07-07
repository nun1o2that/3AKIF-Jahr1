import java.util.Scanner;

/**
* Klasse dient als Anzeige & Eingabe fuer Benutzer
* ruft methode transport der Hanoi2-Klasse auf und beendet das Programm mit Ergebnissen
*/
public class Hanoi2Main {

    public static void main ( String[] args ) {

            Scanner scan = new Scanner(System.in);
            int n;
            long schritte;
            long starttime;
            long endtime;
            double finaltime;

        System.out.println("Tuerme von Hanoi");
        System.out.print("Mit wie vielen Scheiben wird gespielt? ");
            n = scan.nextInt();

        Hanoi2 tuermchen = new Hanoi2();

        // System.currentTimeMillis() zaehlt die Zeit in Millisekunden seit dem 1. Jaenner 1970
        // die Methode wird einmal bei Programmbeginn und einmal bei Programmende aufgerufen, um die benoetigte Zeit auszurechnen
        starttime = System.currentTimeMillis();

        //Aufruf der Methode transport des Objekts tuermchen der Hanoi2-Klasse, zurueckgegebener Wert wird in schritte gespeichert
        schritte = tuermchen.transport(n, 'l', 'm', 'r');   
        endtime = System.currentTimeMillis();

        finaltime = endtime - starttime;
        System.out.println("\n" + "Der Durchlauf dauerte " + finaltime + " Millisekunden (" + finaltime/1000 + " Sekunden) und benoetigte " + schritte + " Schritte.");

    } 

}

// Tuerme von Hanoi (Teil 2)

// Implementiere den Algorithmus, indem du folgende Funktion   void transport(int n, char l, char m, char r)   erstellst. 
// Diese ruft entsprechend dem Algorithmus sich selbst rekursiv mehrfach auf und gibt "Transportiere Scheibe n von Saeule L nach Saeule M (ueber R)" auf die Konsole aus.

// Integriere einen Schritte-Zaehler, welcher tatsaechlichen Verschiebungen (die Konsolenausgaben "Transportiere Scheibe...") zaehlt und am Ende ausgibt.

// Erstelle eine Messreihe (Excel-Tabelle und Diagramm) mit und ohne Konsolenausgaben fuer verschiedene Werte fuer n = 5, 10, ..., 30, 35 um den Zeitaufwand (System.currentTimeMillis()) in Abhaengigkeit von der Scheibenanzahl zu ermitteln. Teste ab welcher Anzahl ein Speicherfehler auftritt.