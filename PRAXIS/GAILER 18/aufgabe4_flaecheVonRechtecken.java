import java.util.Scanner;

public class aufgabe4_flaecheVonRechtecken {

    public static void main ( String[] args ) {

        //anwender gibt koordinaten von zwei eckpunkten fuer jedes von mehreren rechtecken
        //seiten des rechtecks verlaufen parallel zu X und Y achsen
        //koordinaten jedes eckpunktes als paar von ganzzahlen eingegeben, erst X dann Y
        //ursprung koordinatensystems (0, 0) ist linke obere ecke; X nimmt nach rechts und Y nach unten zu 

        //programm berechnet fuer jedes rechteck HOEHE, BREITE, FLAECHE
        //eckpunkte muessen sich diagonal gegenueber liegen
        //eckpunkt eingabe in beliebiger reihenfolge
        //hoehe und breite immer positiv -> programm passt berechnungen an, damit das wahr ist

        //programm beendet, wenn anwender unmoegliche werte eingibt (sodass entweder/both hoehe, breite 0 sind)


                int x1;
                int y1;

                int x2;
                int y2;

                int hoehe;
                int breite;
                int flaeche;

                Scanner eingabe = new Scanner(System.in);


        System.out.println("\n" + "--------------------------------------------------------------------------");
        System.out.println("                 CAD Programm: Flaeche von Rechtecken");
        System.out.println("--------------------------------------------------------------------------");


            do {

                
                System.out.println("\n" + "--------------------------------------------------------------------------");

                System.out.print("1. Eckpunkt, X-Koordinate: ");
                    x1 = eingabe.nextInt();
                System.out.print("1. Eckpunkt, Y-Koordinate: ");
                    y1 = eingabe.nextInt();

                System.out.print("\n" + "2. Eckpunkt, X-Koordinate: ");
                    x2 = eingabe.nextInt();
                System.out.print("2. Eckpunkt, Y-Koordinate: ");
                    y2 = eingabe.nextInt();


                        if (x1 < x2) {
                            breite = x2 - x1; 
                        }

                        else {
                            breite = x1 - x2;
                        }



                        if (y1 < y2) {
                            hoehe = y2 - y1;
                        }

                        else {
                            hoehe = y1 - y2;
                        }


                flaeche = breite * hoehe;

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Breite: " + breite + "        Hoehe: " + hoehe + "        Flaeche: " + flaeche);


        } while ( !((breite == 0) || (hoehe == 0) || (flaeche == 0)) );



        System.out.println("\n" + "--------------------------------------------------------------------------");
        System.out.println("byebye!");

    }
}