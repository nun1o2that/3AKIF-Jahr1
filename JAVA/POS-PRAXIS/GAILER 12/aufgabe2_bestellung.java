import java.util.Scanner;

public class aufgabe2_bestellung{

    public static void main ( String[] args ){

        //5 cent pro schraube
        //3 cent pro mutter
        //1 cent pro unterlegscheibe

        //programm fragt anwender nach anzahlen, berechnet gesamtbetrag und gibt ihn aus

        //überprüfung: fehler, wenn mehr schrauben als muttern
        //ansonsten: "bestellung in ordnung",,,,
        //immer ausgabe des gesamtpreises

                Scanner myScanner = new Scanner(System.in);
                final int schraubenAnzahl;
                final int mutterAnzahl;
                final int unterlegscheibenAnzahl;

                final int schraubenPreis;
                final int mutterPreis;
                final int unterlegscheibenPreis;
                    final int gesamtPreis;


        System.out.println("------------------------------");
        System.out.println("          Bestellung");
        System.out.println("------------------------------" + "\n");


        System.out.print("Wie viele Schrauben kaufen Sie? ");
            schraubenAnzahl = myScanner.nextInt();

        System.out.print("Wie viele Muttern kaufen Sie? ");
            mutterAnzahl = myScanner.nextInt();

        System.out.print("Wie viele Unterlegscheiben kaufen Sie? ");
            unterlegscheibenAnzahl = myScanner.nextInt();

  
        
        gesamtPreis = (schraubenAnzahl * 5) + (mutterAnzahl * 3) + (unterlegscheibenAnzahl * 1);



        if(schraubenAnzahl > mutterAnzahl){ //anstatt >  != ?????????
            System.out.println("\n" + "    --> Mehr Schrauben als Muttern!");
            System.out.println("    Kontrollieren Sie Ihre Bestellung.");
        }

        else{
            System.out.println("\n" + "    --> Kein Fehler in der Bestellung.");
        }



        System.out.println("\n" + "Ihr Gesamtpreis beträgt " + gesamtPreis + " Cent, oder " + (gesamtPreis / 100.0) + " Euro.");
    }
}