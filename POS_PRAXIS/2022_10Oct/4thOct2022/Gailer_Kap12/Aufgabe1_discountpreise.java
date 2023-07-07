import java.util.Scanner;

public class Aufgabe1_discountpreise{

    public static void main ( String[] args ){

        //gesamtbetrag mehr als 10.00,- ---> rabatt von 10%
        //programm fragt nach gesamtbetrag und berechnet ggf discountpreis
        //ganzzahl-arithmetik;; gesamtbetrag in cent eingegeben
        //

                Scanner myScanner = new Scanner(System.in);
                int centWert;
                int discountPreis;


        System.out.println("----------Discountpreise----------");

        System.out.print("Wieviel beträgt der Preis? (in Cent) ");
            centWert = myScanner.nextInt();

        

        if(centWert > 1000){
            discountPreis = centWert - (centWert / 10);
            System.out.println("\n" + "    Ihr Wert beträgt: " + centWert + ".");
            System.out.println("    --> d.h. Sie bekommen einen Rabatt!");
            System.out.println("\n" + "Ihr finaler Preis beträgt " + discountPreis + " Cent.");
        }

        else{
            System.out.println("\n" + "    Ihr Wert ist zu klein für einen Rabatt.");
        }

    }
}