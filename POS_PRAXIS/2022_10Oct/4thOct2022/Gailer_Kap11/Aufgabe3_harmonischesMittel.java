import java.util.Scanner;

public class Aufgabe3_harmonischesMittel{

    public static void main ( String[] args ){

        //harmonisches mittel von zwei zahlen
        // H = 2 / ( 1/x + 1/y )

        //manchmal sinnvoller als üblicher durchschnitt
        
        //programm: liest zwei gleitpunktzahlen ein
        //gibt arithmetisches mittel (üblicher durchschnitt) und harmonisches mittel aus


            double x;
            double y;
            double ergebnis;
            
            Scanner myScanner = new Scanner(System.in);

            double harmonischesMittel;
            double arithmetischesMittel; 



        System.out.println("--------------------------------------");
        System.out.println("           Mittel ausrechnen");
        System.out.println("--------------------------------------");

        System.out.println("\n" + "Geben Sie Ihre zwei Zahlen hintereinander ein: ");
            System.out.print("x = "); x = myScanner.nextDouble();   
            System.out.print("y = "); y = myScanner.nextDouble();

        harmonischesMittel = 2 / (1/x + 1/y);
        arithmetischesMittel = (x + y) / 2;

        System.out.println("\n" + "   Harmonisches Mittel: " + harmonischesMittel);
        System.out.println("    Arithmetisches Mittel: " + arithmetischesMittel);










        System.out.println("--------------------------------------");
    }
}