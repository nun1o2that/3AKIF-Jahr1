import java.util.Scanner;

public class Aufgabe4_fantasySpiel{

    public static void main ( String[] args ) {

        // spieler gibt 3 punktwerte fuer jedes von 3 merkmalen
        // staerke, gesundheit, glueck 1 - 10

        //programm fragt nach namen der figur und nach punktwerten
        //gesamtpunktzahl muss geringer als 15 sein
        //wenn gesamtpunktzahl 15 ueberschreitet, wird jedem merkmal 5 punkte zugewiesen

                    String figurName;
                    int figurStaerke;
                    int figurGesundheit;
                    int figurGlueck;

                    int gesamtPunktwert;

                    Scanner eingabe = new Scanner(System.in);

        System.out.println("\n" + "-----------------------------------------------------");
        System.out.println("                   Figur erstellen");
        System.out.println("-----------------------------------------------------");
        
        
        System.out.print("\n" + "Wie heisst Ihre Figur?: "); figurName = eingabe.next();

        System.out.println("\n" + "Punkte eingeben: maximal 15 Punkte gesamt!:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Staerke eingeben: ");       figurStaerke = eingabe.nextInt();
        System.out.print("Gesundheit eingeben: ");    figurGesundheit = eingabe.nextInt();
        System.out.print("Glueck eingeben: ");        figurGlueck = eingabe.nextInt();
        System.out.println();

        // System.out.println(figurName); 
        // System.out.println(figurStaerke);
        // System.out.println(figurGesundheit);
        // System.out.println(figurGlueck);

        gesamtPunktwert = figurStaerke + figurGesundheit + figurGlueck;

        if (gesamtPunktwert > 15) {
            figurStaerke = 5;
            figurGesundheit = 5;
            figurGlueck = 5;

            gesamtPunktwert = figurStaerke + figurGesundheit + figurGlueck;
            System.out.println("Sie haben Ihrer Figur zu viele Punkte gegeben!");
        }       

        System.out.println("Ihre Figur:");
        System.out.println("-----------------------------------------------------");
        System.out.println("Name: " + figurName + ", Staerke: " + figurStaerke + ", Gesundheit: " + figurGesundheit + ", Glueck: " + figurGlueck);
        
    }


}