import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
* Klasse zum Erstellen von Dreieck- / Kreisobjekten, Abspeichern in Liste und Ausrechnen von Umfang und Flaeche
**/
public class GeoTester {

    private ArrayList<AFigur> figuren;
    private static Scanner scan = new Scanner(System.in);

    /* Konstruktor */
    public GeoTester() {
        figuren = new ArrayList<AFigur>();
    }

    /* Methode zum Erstellen von neuen Figuren und hinzufuegen zur Liste */
    public void figurHinzufuegen() {
        int input;
        AFigur neueFigur = null;
        
        System.out.print("\nDreieck [1] oder Kreis [2]? ");
        input = scan.nextInt();

        if (input == 1) {
            System.out.print("Wie lang ist Seite A? ");
                Integer a = scan.nextInt();
            System.out.print("Wie lang ist Seite B? ");
                Integer b = scan.nextInt();
            System.out.print("Wie lang ist Seite C? ");
                Integer c = scan.nextInt();
            neueFigur = new Dreieck(a, b, c);
        }
        else {
            System.out.print("Wie gross ist der Radius? ");
                double radius = scan.nextDouble();
            neueFigur = new Kreis(radius);
        }

        figuren.add(neueFigur);
    }

    /* Methode zum Ausgeben der Eigenschaften der Figuren */
    public void figurenAusgeben() {
        System.out.println();
        for (AFigur figur : figuren) {
            if (figur instanceof Dreieck) {
                System.out.print("Dreieck: [" + figur + "]\n");
            }
            else {
                System.out.print("Kreis: [" + figur + "]\n");
            }
        }
    }

    /**
    * Methode zum Ausrechnen des Gesamtumfangs aller Figuren
    * @return ausgerechneter Umfang
    **/
    public double berechneGesamtumfang() {
        double summe = 0.0;
        
        for (AFigur figur : figuren) {
            /* Typecasting jeder Figur zum Interface FigurHelper zum Aufrufen der getUmfang()-Methode */
            FigurHelper help = (FigurHelper)figur;
            summe += help.getUmfang();
        }

        return summe;
    }

    /**
    * Methode zum Ausrechnen der Gesamtflaeche aller Figuren
    * @return ausgerechnete Flaeche
    **/
    public double berechneGesamtFlaeche() {
        double summe = 0.0;
        
        for (AFigur figur : figuren) {
            /* Typecasting jeder Figur zum Interface FigurHelper zum Aufrufen der getFlaeche()-Methode */
            FigurHelper help = (FigurHelper)figur;
            summe += help.getFlaeche();
        }

        return summe;
    }

    /**
    * Methode zum Zurueckgeben speziell der Dreiecke
    * @return Liste aller Dreiecke in der Figurenliste
    **/
    public List<Dreieck> getDreiecke() {
        List<Dreieck> dreiecke = new ArrayList<Dreieck>();
        
        for (AFigur figur : figuren) {
            if (figur instanceof Dreieck) {
                /* Typecasting zu Dreieck, damit das Objekt zu Liste hinzugefuegt werden kann */
                dreiecke.add( (Dreieck)figur );
            }
        }
        return dreiecke;
    }

    /**
    * Methode zum Zurueckgeben speziell der Kreise
    * @return Liste aller Kreise in der Figurenliste
    **/
    public List<Kreis> getKreise() {
        List<Kreis> kreise = new ArrayList<Kreis>();

        for (AFigur figur : figuren) {
            if (figur instanceof Kreis) {
                /* Typecasting zu Kreis, damit das Objekt zu Liste hinzugefuegt werden kann */
                kreise.add( (Kreis)figur );
            }
        }
        return kreise;
    }

    /**
    * Methode zum wiederholten Ausgeben des Menues
    * @return Auswahl des Users
    **/
    public static int menue() {
        System.out.println("\n------------------------------");
        System.out.println("1 - Neue Figur hinzufuegen");
        System.out.println("2 - Alle Figuren ausgeben");
        System.out.println("3 - Gesamtumfang ausrechnen");
        System.out.println("4 - Gesamtflaeche ausrechnen");
        System.out.println("5 - Programm beenden");
        System.out.println("------------------------------");
        System.out.print("Welche Option? ");
            return scan.nextInt();
    }

    /* main()-Methode */
    public static void main (String[] args) {
        GeoTester programm = new GeoTester();
        int input = 0;

        while (input != 5) {
            input = menue();
            switch (input) {
                case 1: programm.figurHinzufuegen(); break;
                case 2: programm.figurenAusgeben(); break;
                case 3: System.out.println("\nGesamtumfang: " + programm.berechneGesamtumfang()); break;
                case 4: System.out.println("\nGesamtflaeche: " + programm.berechneGesamtFlaeche()); break;
            }
        }

        System.out.println("\nByeBye :)");
        scan.close();
    }

}