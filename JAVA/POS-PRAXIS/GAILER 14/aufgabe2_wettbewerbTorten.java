import java.util.Scanner;

public class aufgabe2_wettbewerbTorten {

    public static void main ( String[] args ) {

        //wettbewerb torten essen
        //alle teilnehmer muessen in der schwergewichtsklasse zwischen 235 und 265 pfund liegen

        //programm fragt anwender nach gewicht und gibt aus, ob er zum wettbewerb zugelassen ist oder nicht

                double gewicht;

                Scanner eingabe = new Scanner(System.in);   

        System.out.println("\n" + "----------------------------------------------");
        System.out.println("Tortenwettbewerb - Schwergewichtsklassen-Check");
        System.out.println("----------------------------------------------");

        System.out.print("\n" + "Geben Sie Ihr Gewicht ein (in Pfund): ");
            gewicht = eingabe.nextDouble();

        System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        if (gewicht >= 235 && gewicht <= 265) {
            System.out.println("Sie sind zum Wettbewerb zugelassen!");
        }   

        else {
            System.out.println("Sie nicht sind zum Wettbewerb zugelassen.");
        }      

    }
}