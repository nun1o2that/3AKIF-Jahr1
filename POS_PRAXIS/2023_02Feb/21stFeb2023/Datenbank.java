import java.util.Scanner;
import java.util.ArrayList;

/**
* Klasse zur Speicherung von Medium-Subtypen in einer ArrayListe
**/
public class Datenbank {
    
    private ArrayList<Medium> mediumListe;

    /**
    * Konstruktor der Klasse Datenbank
    * das Datenfeld mediumListe wird initialisiert
    **/
    public Datenbank() {
        mediumListe = new ArrayList<Medium>();
    }

    /**
    * komplizierte Saumethode y'know
    * Benutzer wird gefragt, welche Art von Medium; abhaengig davon werden verschiedene Fragen ausgegeben
    * ein neues CD / DVD / Videospiel Objekt wird erzeugt und zur Liste hinzugefuegt 
    **/
    public void mediumHinzufuegen() {
        
        Scanner scan = new Scanner(System.in);
        int art = 0;

        String titel;
        String spielDauer;
        String genre;
        String var1;    /* da jede Subklasse zwei eigene Datenfelder hat, lege ich hier 2 fest, anstatt unten im switch-case 6 zu schreiben. */
        String var2;
        
        do {
            System.out.println("-------------------------------");
            System.out.println("Welche Art von Medium?");
            System.out.println("1 - CD");
            System.out.println("2 - DVD");
            System.out.println("3 - Videospiel");
            System.out.println("-------------------------------");
            /* die erste Zeile der Inputs unten (Titel eingeben) wird uebersprungen, wenn man nextInt() nimmt. Das selbe mit next() */
            art = Integer.valueOf(scan.nextLine());

            if ( !(art >= 1 && art <= 3) ) {
                System.out.println("\n" + "*******************************");
                System.out.println("Falsche Eingabe! Nocheinmal probieren!");
                System.out.println("*******************************" + "\n");
            }

        } while( !(art >= 1 && art <= 3) );

        System.out.print("\n" + "Titel des Mediums: ");
            titel = scan.nextLine();
        System.out.print("Spieldauer des Mediums: ");
            spielDauer = scan.nextLine();
        System.out.print("Genre des Mediums: ");
            genre = scan.nextLine();

        switch(art) {
            case 1: System.out.print("Komponist der CD: "); break;
            case 2: System.out.print("Regissuer der DVD: "); break;
            case 3: System.out.print("Entwickler des Videospiels: "); break;
        }
        var1 = scan.nextLine();

        switch(art) {
            case 1: System.out.print("Hersteller der CD: "); break;
            case 2: System.out.print("Studio der DVD: "); break;
            case 3: System.out.print("Plattform des Videospiels: "); break;
        }
        var2 = scan.nextLine();

        System.out.println("\n" + "*******************************");

        Medium userMedium = null;

        switch(art) {
            case 1: 
                userMedium = new CD(titel, spielDauer, genre, var1, var2);
                System.out.println("CD hinzugefuegt!");
                break;
            case 2: 
                userMedium = new DVD(titel, spielDauer, genre, var1, var2);                        
                System.out.println("DVD hinzugefuegt!");
                break;
            case 3: 
                userMedium = new Videospiel(titel, spielDauer, genre, var1, var2);
                System.out.println("Spiel hinzugefuegt!");
                break;
        }

        mediumListe.add(userMedium);

        System.out.println("*******************************");

    }

    /**
    * Methode zum Loeschen eines Listeneintrags mittels des Index
    * ueberprueft ob der eingegebene Index gueltig ist, und faehrt nur dann fort
    **/
    public void mediumLoeschen() {
        Scanner scan = new Scanner(System.in);
        int user;


        System.out.println("\n" + "*******************************");
        System.out.print("Welchen Index loeschen? ");
        user = scan.nextInt();

        if (user <= 0 && user < mediumListe.size()) {
            mediumListe.remove(user);
            System.out.println("Eintrag wurde geloescht!");
        }
        else {
            System.out.println("Eintrag konnte nicht geloescht wurden! Diese ID gibt es nicht.");
        }

        System.out.println("*******************************");
    }

    /**
    * Methode zur Ausgabe der gesamten Mediumliste
    * benutzt die toString()-Methode von den Subtypen und Supertyp Medium
    **/
    public void mediumAusgabe() {
        int counter = 0;

        System.out.println("*******************************");

        if (mediumListe.isEmpty()) {
            System.out.println("Keine Medien vorhanden!");
        }

        else {
            for (Medium i : mediumListe) {
                System.out.println("Index: " + counter + " --> " + i);
                counter++;  /* position der eintraege in GANZER liste wird gezaehlt */
            }
        }

        System.out.println("*******************************");

    }

}

