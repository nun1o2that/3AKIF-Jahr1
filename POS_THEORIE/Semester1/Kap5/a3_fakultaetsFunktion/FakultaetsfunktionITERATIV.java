import java.math.*;
import java.util.Scanner;

public class FakultaetsfunktionITERATIV {

    /**
    * menue, dass sich bis zum abbruch des programms wiederholt wird
    */
    static void menue() {
        System.out.println("\n" + "---------------------------------------------------------");
        System.out.println("|    Fakultaetsberechner!     Welche Option?            |");
        System.out.println("|    I = Integer              II = Endlos-Integer       |");
        System.out.println("|    L = Long                 LL = Endlos-Long          |");
        System.out.println("|    B = BigInteger           BB = Endlos-BigInteger    |");
        System.out.println("|                                                       |");
        System.out.println("|    Abbruch Programm (Endlosschleife) = Strg+C !       |");
        System.out.println("|                                                       |");
        System.out.println("|    Erkenntnisse = E                                   |");
        System.out.println("---------------------------------------------------------");
        System.out.print("Auswahl: ");
    }

    /**
    * berechnet die fakultaet einer zahl
    * datentyp aller variablen ist INT
    * @param grenze wenn die grenze 5 ist, berechnet die funktion 5 fakultaet (5!)
    */
    static void fakINT(int grenze) {
        
        int fakultaetszahl = 1;
        int zaehler = 1;

        while (zaehler <= grenze) {
            fakultaetszahl = fakultaetszahl * zaehler;
            zaehler++;
        }

        System.out.println("Ergebnis: " + fakultaetszahl);

    }

    /**
    * berechnet die fakultaet ALLER ZAHLEN AB 1
    * datentyp aller variablen ist INT
    */
    static void infinite_fakINT() {

        int fakultaetszahl = 1;
        int zaehler = 1;
        int grenze = 1;

        while (true) {

            while (zaehler <= grenze) {
                fakultaetszahl = fakultaetszahl * zaehler;
                zaehler++;
            }
            
            // zur verschoenerung
            if (grenze < 10) {
                System.out.println(grenze + "  Fakultaet = " + fakultaetszahl);
            }
            else {
                System.out.println(grenze + " Fakultaet = " + fakultaetszahl);
            }

            /*jede iteration eine hoehere zahl*/
            grenze++;
            /*muessen zurueckgesetzt werden*/
            zaehler = 1;            
            fakultaetszahl = 1;

        }

    }



    /**
    * berechnet die fakultaet einer zahl
    * datentyp aller variablen ist LONG
    * @param grenze wenn die grenze 5 ist, berechnet die funktion 5 fakultaet (5!)
    */
    static void fakLONG(long grenze) {
        long fakultaetszahl = 1;
        long zaehler = 1;

        while (zaehler <= grenze) {
            fakultaetszahl = fakultaetszahl * zaehler;
            zaehler++;
        }

        System.out.println("Ergebnis: " + fakultaetszahl);
    }

    /**
    * berechnet die fakultaet ALLER ZAHLEN AB 1
    * datentyp aller variablen ist LONG
    */
    static void infinite_fakLONG() {

        long fakultaetszahl = 1;
        long zaehler = 1;
        long grenze = 1;

        while (true) {

            while (zaehler <= grenze) {
                fakultaetszahl = fakultaetszahl * zaehler;
                zaehler++;
            }

            // zur verschoenerung
            if (grenze < 10) {
                System.out.println(grenze + "  Fakultaet = " + fakultaetszahl);
            }
            else {
                System.out.println(grenze + " Fakultaet = " + fakultaetszahl);
            }
            
            //jede iteration eine hoehere zahl
            grenze++;
            //muessen zurueckgesetzt werden
            zaehler = 1;            
            fakultaetszahl = 1;

        }

    }



    /**
    * berechnet die fakultaet einer zahl
    * datentyp aller variablen ist BIGINTEGER
    * @param grenze wenn die grenze 5 ist, berechnet die funktion 5 fakultaet (5!)
    */
    static void fakBIGINT(BigInteger grenze) {

        BigInteger fakultaetszahl = BigInteger.valueOf(1);
        BigInteger zaehler = BigInteger.valueOf(1);
        final BigInteger eins = BigInteger.valueOf(1);  //final -> veraendert sich nicht


        // BigInteger.compareTo(BigInteger var) Methode:
        //  0 = gleicher Wert
        //  1 = Wert des BigInteger groesser als der des Parameters
        // -1 = Wert des BigInteger kleiner als der des Parameters

        // diese ueberpruefung entspricht dem ausdruck (zaehler <= grenze)
        while (zaehler.compareTo(grenze) == -1 || zaehler.compareTo(grenze) == 0) {
            fakultaetszahl = fakultaetszahl.multiply(zaehler);  //fakultaetszahl = fakultaetszahl * zaehler
            zaehler = zaehler.add(eins);                        //1 in form einer BigInteger variable
        }

        System.out.println("Ergebsnis: " + fakultaetszahl);
    }

    /**
    * berechnet die fakultaet ALLER ZAHLEN AB 1
    * datentyp aller variablen ist BIGINTEGER
    */
    static void infinite_fakBIGINT() {

        BigInteger fakultaetszahl = BigInteger.valueOf(1);
        BigInteger zaehler = BigInteger.valueOf(1);
        BigInteger grenze = BigInteger.valueOf(1);
        final BigInteger eins = BigInteger.valueOf(1);  //final -> veraendert sich nicht

        while (true) {

            // BigInteger.compareTo(BigInteger var) Methode:
            //  0 = gleicher Wert
            //  1 = Wert des BigInteger groesser als der des Parameters
            // -1 = Wert des BigInteger kleiner als der des Parameters

            // diese ueberpruefung entspricht dem ausdruck (zaehler <= grenze)
            while (zaehler.compareTo(grenze) == -1 || zaehler.compareTo(grenze) == 0) {
                fakultaetszahl = fakultaetszahl.multiply(zaehler);  //fakultaetszahl = fakultaetszahl * zaehler
                zaehler = zaehler.add(eins);                        //1 in form einer BigInteger variable
            }
            
            // zur verschoenerung
            if (grenze.compareTo(BigInteger.valueOf(10)) == -1) {
                System.out.println(grenze + "    Fakultaet = " + fakultaetszahl);
            }
            else if (grenze.compareTo(BigInteger.valueOf(100)) == -1) {
                System.out.println(grenze + "   Fakultaet = " + fakultaetszahl);
            }
            else if (grenze.compareTo(BigInteger.valueOf(1000)) == -1) {
                System.out.println(grenze + "  Fakultaet = " + fakultaetszahl);
            }
            else {
                System.out.println(grenze + " Fakultaet = " + fakultaetszahl);
            }

            /*jede iteration eine hoehere zahl*/
            grenze = grenze.add(eins);
            /*muessen zurueckgesetzt werden*/
            zaehler = BigInteger.valueOf(1);            
            fakultaetszahl = BigInteger.valueOf(1);

        }

    }


    /*MAIN METHODE*/
    public static void main ( String[] args ) {

            String userString;
            int userInt;
            long userLong;
            BigInteger userBigInteger;

            Scanner scan = new Scanner (System.in);
            
        do {

            menue();
                userString = scan.next();

            if (userString.equals("i") || userString.equals("I")) {
                System.out.print("\n" + "Welchen Wert hat n? ");
                    userInt = scan.nextInt();

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                fakINT(userInt);
            }

            else if (userString.equals("ii") || userString.equals("II")) {
                System.out.println();
                infinite_fakINT();
            }

            else if (userString.equals("l") || userString.equals("L")) {
                System.out.println("\n" + "Welchen Wert hat n? ");
                    userLong = scan.nextLong();

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                fakLONG(userLong);
            }

            else if (userString.equals("ll") || userString.equals("LL")) {
                System.out.println();
                infinite_fakLONG();
            }

            else if (userString.equals("b") || userString.equals("B")) {
                System.out.print("\n" + "Welchen Wert hat n? ");
                    userBigInteger = scan.nextBigInteger();

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                fakBIGINT(userBigInteger);
            }

            else if (userString.equals("bb") || userString.equals("BB")) {
                System.out.println();
                infinite_fakBIGINT();
            }


            else if (userString.equals("e") || userString.equals("E")) {

                while ( !(userString.equals("z") || userString.equals("Z")) ) {
                    System.out.println("\n" + "---------------------------------------------------------");
                    System.out.println("|           Endlos-Integer:                             |");
                    System.out.println("|           + Rechnet bis inkl. 33!                     |");
                    System.out.println("|           + ab dann Endlosausgabe von 0               |");
                    System.out.println("|           + Richtge Werte nur bis inkl. 12!           |");
                    System.out.println("|                                                       |");
                    System.out.println("|                                                       |");
                    System.out.println("|           Endlos-Long:                                |");
                    System.out.println("|           + Rechnet bis inkl. 65!                     |");
                    System.out.println("|           + ab dann Endlosausgabe von 0               |");
                    System.out.println("|           + Richtge Werte nur bis inkl. 20!           |");
                    System.out.println("|                                                       |");
                    System.out.println("|                                                       |");
                    System.out.println("|           Endlos-BigInteger:                          |");
                    System.out.println("|           + Rechnet bis: wahrscheinlich unendlich     |");
                    System.out.println("|           + immer richtige Werte                      |");
                    System.out.println("---------------------------------------------------------");
                    System.out.print("Zurueck = Z: ");
                        userString = scan.next();
                }
            }


        } while ( !(userString.equals("x") || userString.equals("X")) );

    }

}