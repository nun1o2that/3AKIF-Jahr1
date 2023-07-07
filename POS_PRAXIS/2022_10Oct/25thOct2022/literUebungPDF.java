import java.util.Scanner;

public class literUebungPDF {

    public static void main ( String[] args ) {

        //fluessigkeitsmengen in leicht lesbare form fuer praesentation auf einer website
        
        //programm liest gleitpunktzahl ein, in LITER
        //ausgabe mit leicht lesbarer form

        //1,0 und groesser : ausgabe in LITER,      zb 4l bei eingabe 4
        //0,1 und groesser : ausgabe in ZENTILITER, zb 2cl bei eingabe 0,2
        //0,001 und groesser: ausgabe in MILLILITER, zb 9ml bei eingabe 0,009

        //ausgabe ist immer eine ganzzahl
        //rundungen in ordnung

                double zahl;
                int ganzzahl;

                Scanner eingabe = new Scanner(System.in);
            
        System.out.print("Menge in Liter eingeben: ");
            zahl = eingabe.nextDouble();

        
        if (zahl >= 1.0) {
            ganzzahl = (int)zahl;
            System.out.println("ungefaehr " + ganzzahl + " l");
        }

        else if (zahl >= 0.1) {
            zahl *= 100;
            ganzzahl = (int)zahl;
            System.out.println("ungefaehr " + ganzzahl + " cl");
        }

        else if (zahl >= 0.001) {
            zahl *= 1000;
            ganzzahl = (int)zahl;
            System.out.println("ungefaehr " + ganzzahl + " ml");
        }

        else {
            System.out.println("Wert zu klein!");
        }

    }
}