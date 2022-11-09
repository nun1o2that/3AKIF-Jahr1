import java.util.Scanner;

public class aufgabe3_deathvalley{

    public static void main ( String[] args ){

        //al's last chance gas station VOR DEATH VALLEY
        //nächste 200 meilen keine tankstelle
        //programm hilft fahrer zu entscheiden, ob tanken oder nicht

        //programm fragt anwender nach anzahlen, berechnet gesamtbetrag und gibt ihn aus

        //überprüfung: fehler, wenn mehr schrauben als muttern
        //ansonsten: "bestellung in ordnung",,,,
        //immer ausgabe des gesamtpreises

                int tankKapazitaet;     //in gallonen (= 3,78 Liter)
                int benzinAnzeige;      //in prozent, 100=voll 50=halb;
                int benzinVerbrauch;    //meilen pro gallone

                int moeglicheFahrtstrecke;

                double maximalPassendeGallonen;
                double maximalFahrtstrecke;
                
                Scanner myScanner = new Scanner(System.in);


        System.out.println("--------------------------------------------------------");
        System.out.println("                     Death-Valley");
        System.out.println("--------------------------------------------------------");

        System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        Benutzen Sie bei der Eingabe Ganzzahlen!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");



        System.out.print("Tankkapazität (in Gallonen; =3,78 Liter): ");
            tankKapazitaet = myScanner.nextInt();

        System.out.print("Benzinanzeige (in Prozent; 0=leer, 100=voll): ");
            benzinAnzeige = myScanner.nextInt();

        System.out.print("Benzinverbrauch (in Meilen pro Gallone): ");
            benzinVerbrauch = myScanner.nextInt();

  

        moeglicheFahrtstrecke = tankKapazitaet * benzinVerbrauch;

        if(moeglicheFahrtstrecke >= 200){
            System.out.println("\n" + "     Sie können noch " + moeglicheFahrtstrecke + " Meilen Fahren.");
            System.out.println("     Genug Tank. VIEL GLÜCK!");
        }

        else{
            System.out.println("\n" + "     Sie können noch " + moeglicheFahrtstrecke + " Meilen Fahren.");
            System.out.println("     -->TANKEN!");
        }



    //EXTRA BERECHNUNGEN ZUM SPASS......................................................
    //maximalPassendeGallonen = (tankKapazitaet / benzinAnzeige) * 100;
    //maximalFahrtstrecke = maximalPassendeGallonen * benzinVerbrauch;


        maximalPassendeGallonen = (( 1.0 * tankKapazitaet) / benzinAnzeige) * 100;
        // System.out.println(maximalPassendeGallonen);

        maximalFahrtstrecke = maximalPassendeGallonen * benzinVerbrauch;
        // System.out.println(maximalFahrtstrecke);



        System.out.println("\n" + "--------------------------------------------------------");
        System.out.println("                       Zusatz");
        System.out.println("--------------------------------------------------------" + "\n");

        System.out.println("    Ihr Tank kann maximal " + maximalPassendeGallonen + " Gallonen Benzin halten.");
        System.out.println("    Mit einem voll aufgefüllten Tank können Sie " + maximalFahrtstrecke + " Meilen fahren.");

        System.out.println("\n" + "--------------------------------------------------------");

       
    }
}