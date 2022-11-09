import java.util.Scanner;

public class aufgabe1_stromkosten{

    public static void main ( String[] args ){

        //programm fragt nach anzahl der kilowattstunden pro jahr &  kosten je kilowattstunde

        double stundenAnzahl;
        double kilowattStunden;
        double jahresKosten;

        Scanner myScanner = new Scanner(System.in);


        System.out.println("----------------------");
        System.out.println("Stromkosten-Berechnung");
        System.out.println("----------------------");

        System.out.print("\n" + "Geben Sie die Kilowattstunden pro Jahr ein: ");
            kilowattStunden = myScanner.nextDouble();

        System.out.print("Geben sie die Kosten pro Kilowattstunde (in Cent) an: ");
            stundenAnzahl = myScanner.nextDouble();

        jahresKosten = stundenAnzahl * kilowattStunden; //in cent

        System.out.println("\n" + "    Ihre Jahreskosten betragen " + (jahresKosten / 100.0) + " Euro"); //in euro

    }
}