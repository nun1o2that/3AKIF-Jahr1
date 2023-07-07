import java.util.Scanner;

public class Notenprogramm {

    public static void main ( String[] args ) {
        
        //eingabe: student name
        //eingabe: wieviele punkte koennen beim test maximal erreicht werden?
        //eingabe: von [student] erreichten punkte je testaufgabe (eine zeile pro aufgabe), -1 beendet eingabe
        
        //ERGEBNIS: [student] hat [prozent] der maximal moeglichen punkte erreicht

        //wenn summe der eigenen punkte die angegebene maximalpunktzahl uebersteigt, soll fehlermeldung (anstelle ergebnis & notenvorschlag) kommen:
        //FEHLER: summe [eingegebene punkte] betraegt x und uebersteigt damit [maximalpunktzahl] von y. bitte eingabe kontrollieren und programm neustart

        //notenschema (prozent)
        // >92  SEHR GUT
        // >80 - 92  GUT
        // >65 - 80 BEFRIEDIGEND
        // >50 - 65 GENUEGEND
        // rest     NICHT GENUEGEND


                String name;     //name des studenten, von dem die testnote ausgerechnet wird

                Double maximalPunktzahl;   //maximalpunktzahl die bei diesem test erreicht werden konnte        (MUSS >= punktInsg SEIN)
                Double punktProAufg;       //erreichte punkte des studenten je aufgabe
                Double punktInsg;          //insgesamt erreichte punkte des studenten                                                               (MUSS <= maximalPunktzahl SEIN)
                Double prozent;            //prozent 1-100%

                Scanner scan = new Scanner (System.in);


        System.out.println("\n" + "-----------------------------------");
        System.out.println("Willkommen zur Notenberechnung!");       //"\n" = zeilenumbruch, verschoenerungssache
        System.out.println("-----------------------------------");

        System.out.print("Wie heisst der Student, fuer den Sie die Testnote berechnen moechten? ");
            name = scan.nextLine().trim();      //nextLine, damit Lesezeichen(LZ) und Text nach LZ mitgescannt werden. trim() entfernt LZ vor und nach dem String

        System.out.print("Wie viele Punkte konnten beim Test maximal erreicht werden? ");
            maximalPunktzahl = scan.nextDouble();

        System.out.println("\n" + "Geben Sie nun die von " + name + " erreichten Punkte je Test-Aufgabe ein");
        System.out.println("(pro Zeile eine Aufgabe, -1 beendet die Eingabe)");



        punktInsg = 0.0;      //auf 0 initialisieren, in jeder schleifeniteration wird punktProAufg dazugezaehlt


        do {

            punktProAufg = scan.nextDouble();

            if (punktProAufg != -1) {
                punktInsg += punktProAufg;      //punktInsg = punktInsg + punktProAufg;
            }

        } while (punktProAufg != -1);          //solange punktProAufg nicht -1 betraegt, schleife laufen lassen



        if (punktInsg <= maximalPunktzahl) {
    
            prozent = (punktInsg / maximalPunktzahl) * 100;

            System.out.println("\n" + "***ERGEBNIS***");
            System.out.println(name + " hat " + prozent + "% der maximal moeglichen Punkte erreicht.");

            System.out.print("Notenvorschlag: ");

                if (prozent < 50) {
                    System.out.println("NICHT GENUEGEND.");
                }

                else if ((prozent >= 50) && (prozent < 65)) {
                    System.out.println("GENUEGEND.");
                }

                else if ((prozent >= 65) && (prozent < 80)) {
                    System.out.println("BEFRIEDIGEND.");
                }

                else if ((prozent >= 80) && (prozent < 92)) {
                    System.out.println("GUT.");
                }

                else {
                    System.out.println("SEHR GUT.");
                }

            System.out.println("**************");

        }

        else {

            System.out.println("\n" + "***FEHLER***");
            System.out.println("Die Summe der eingegebenen Punkte betraegt " + punktInsg + " und uebersteigt damit die angegebenen Maximalpunkte von " + maximalPunktzahl + ".");
            System.out.println("Bitte kontrollieren Sie Ihre Eingabe und starten Sie das Programm neu!");  

            System.out.println("************");
        }   


    }
}