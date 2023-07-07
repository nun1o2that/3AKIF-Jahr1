import java.util.Scanner;

public class Aufgabe2_wort_wortLaenge {

    public static void main ( String[] args ) {

                String wort;
                int wortLaenge;
                int startZahl;

                Scanner eingabe = new Scanner(System.in);

        System.out.println("\n" + "--------------------------------------");       
        System.out.println("Wort und Ausgabe nach Buchstabenanzahl");
        System.out.println("--------------------------------------");


        System.out.print("Geben Sie Ihr Wort ein: ");
            wort = eingabe.next();
        
        System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        

        wortLaenge = wort.length();
        startZahl = 0;

        while (startZahl < wortLaenge) {
            System.out.println(wort);
            startZahl++;    // das gleiche wie:     startZahl = startZahl + 1;
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        // while (wortLaenge < wortLaenge) {
        //     System.out.println(wortLaenge);
        // }

        // while (wortLaenge <= wortLaenge) {    //ENDLOSSCHLEIFE
        //     System.out.println(wortLaenge);
        // }
    }   
}