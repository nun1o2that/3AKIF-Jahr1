import java.util.Scanner;

/**
* Klasse mit Zugriff auf die Koordinate und Kreis Klasse
**/
public class Main {

    static Scanner scan = new Scanner(System.in);
    static Kreis circle;    // static, da es sonst Instanzvariablen sind (von dieser Klasse werden keine Objekte erzeugt)
    static int user;        // Variablen sind global aufrufbar in dieser Klasse
    static int x;
    static int y;
    static int z;

    /**
    * wird wiederholt, bis der Benutzer 3 eingibt
    * ruft abhaengig von der Eingabe verschiedene Funktionen auf 
    **/
    public static void menue() {
        System.out.println("\n--------------------------------------");
        System.out.println("1 - Werte des Kreises aendern");
        System.out.println("2 - Informationen ausgeben");
        System.out.println("3 - Programm Beenden");
        System.out.println("--------------------------------------");
        System.out.print("Welche Option? ");
            user = scan.nextInt();

        switch(user) {
            case 1: eingabe(); circle.setPosition(x, y, z);
            case 2: System.out.println(circle); // toString()-Methode der Kreis-Klasse
        }
    }

    /**
    * globale statische Variablen x, y (Koordinate) und z (Radius) werden hier veraendert und dann in menue() mit der Kreis-Methode setPosition() gesetzt
    **/
    public static void eingabe() {
        System.out.println("\nPosition (Koordinate in der Mitte des Kreises):");
        System.out.print("X-Koordinate: ");
            x = scan.nextInt();
        System.out.print("Y-Koordinate: ");
            y = scan.nextInt();
        System.out.print("Radius eingeben: ");
            z = scan.nextInt();
    }

    // main()-Methode
    public static void main ( String[] args ) {
        eingabe();
        circle = new Kreis(new Koordinate(x, y), z);    // globale statische Variablen x, y (Koordinate) und z (Radius) 

        // das Menue und folgende Aktionen (Methoden in menue() aufgerufen) so oft wiederholt, bis der Benutzer 3 eingibt
        do { menue(); } while(user != 3);

        System.out.println("\nByeBye!");
    }

}