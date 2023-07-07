import java.util.Scanner;

public class rabattOutputTextTestStuff {

    public static void main ( String[] args ) {


        //programm, dass preis und rabatt einliest und dann endpreis ausrechnet
        //zum textoutput testen und so! lolzzz


                int startPreis;
                int rabatt;
                int endPreis;

                Scanner scan = new Scanner(System.in);


        System.out.println("\n" + "Rabattierten Preis ausrechnen");

        System.out.print("\n" + "Preis eingeben (in Cent): ");
            startPreis = scan.nextInt();

        System.out.print("Rabatt eingeben (in Prozent): ");
            rabatt = scan.nextInt();

        endPreis = startPreis - (startPreis * rabatt) / 100;

        System.out.println("\n" + "Endpreis: " + endPreis + " Cent");

    }
}