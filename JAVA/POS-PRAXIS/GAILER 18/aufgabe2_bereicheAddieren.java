import java.util.Scanner;

public class aufgabe2_bereicheAddieren {

    public static void main ( String[] args ) {

        //programm fragt anwender nach unter- & obergrenze fuer einen bereich von ganzzahlen
        //programm fragt anwender nach ganzzahlen, die addiert werden sollen (schleifenende mit 0)
        //programm berechnet zwei summen: ganzzahlen INNERHALB (inklusive) und ganzzahlen AUSSERHALB des bereichs


                int untergrenze;
                int obergrenze;

                int integer;
                
                int summeInnerhalb = 0;
                int summeAusserhalb = 0;

                Scanner eingabe = new Scanner(System.in);


        System.out.println("\n" + "------------------------------------------------------------------------------");
        System.out.println("                Bereiche addieren");
        System.out.println("------------------------------------------------------------------------------" + "\n");


        System.out.print("Untergrenze angeben: ");
            untergrenze = eingabe.nextInt();
        System.out.print("Obergrenze angeben: ");
            obergrenze = eingabe.nextInt();

        
        System.out.print("\n" + "Zu addierender Integer: ");
            integer = eingabe.nextInt();


                while (integer != 0) {

                    if ( (untergrenze <= integer) && (integer <= obergrenze) ) {
                        summeInnerhalb = summeInnerhalb + integer;
                    }

                    else {
                        summeAusserhalb = summeAusserhalb + integer;
                    }


                    System.out.print("\n" + "Zu addierender Integer: ");
                        integer = eingabe.nextInt();

                }


        System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Summe der Werte innerhalb des Bereiches: " + summeInnerhalb);
        System.out.println("Summe der Werte ausserhalb des Bereiches: " + summeAusserhalb);

    }
}