import java.util.Scanner;

public class aufgabe3_versandkostenKalkulator {

    public static void main ( String[] args ) {

        //paketdienst berechnet $3.00 versandkosten bis zu (inklusive) einem gewicht von 10 pfund
        //darueber hinaus fuer jedes pfund zusaetzlich $0.25 zu bezahlen

        //programm fragt anwender nach gewicht der sendung
        //gibt versandkosten aus   
        //endet bei eingabe eines gewichts <= 0


                double pfund;
                double versandKosten;

                int zaehler = 0;

                Scanner eingabe = new Scanner(System.in);


        System.out.println("\n" + "----------------------------------------------------------");
        System.out.println("                Versandkosten-Kalkulator:");
        System.out.println("----------------------------------------------------------" + "\n");


        System.out.print("Gewicht der Sendung (0 or less to quit): ");
            pfund = eingabe.nextDouble();


        while (pfund > 0) {
    
                if (pfund <= 10) {
                    versandKosten = 3;
                }

                else {

                    while (zaehler + 11 <= pfund) {     //+ 11, sonst ist zaehler viel zu hoch.
                        zaehler++;                      //alternativ bei erster zuweisung zaehler = 11 ?
                    }                                   //von 11 bis eingegebenes gewicht zaehlen

                    versandKosten = 3 + (0.25 * zaehler);   
                }


            System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Versandkosten: $" + versandKosten);


            System.out.println("\n" + "----------------------------------------------------------");
            System.out.print("Gewicht der Sendung (0 or less to quit): ");
                pfund = eingabe.nextDouble();

            zaehler = 0;        //"zurecksetzen" des zaehlers vor naechsten schleifen-iteration

        }


        System.out.println("\n" + "----------------------------------------------------------");
        System.out.println("byebye!");

    }
}