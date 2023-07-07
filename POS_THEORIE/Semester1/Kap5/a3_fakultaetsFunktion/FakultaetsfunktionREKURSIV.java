import java.math.*;
import java.util.Scanner;

public class FakultaetsfunktionREKURSIV {

    int x = 1;

    /**
    * menue, dass sich bis zum abbruch des programms wiederholt wird
    */
    static void menue() {
        System.out.println("\n" + "---------------------------------------------------------");
        System.out.println("|    Fakultaetsberechner!     Welche Option?            |");
        System.out.println("|    I = Integer                                        |");
        System.out.println("|    L = Long                                           |");
        System.out.println("|    B = BigInteger                                     |");
        System.out.println("|                                                       |");
        System.out.println("|    Abbruch Programm (Endlosschleife) = Strg+C !       |");
        System.out.println("|                                                       |");
        System.out.println("|    Erkenntnisse = E                                   |");
        System.out.println("---------------------------------------------------------");
        System.out.print("Auswahl: ");
    }


    /**
    * berechnet die fakultaet einer zahl unter nutzung der REKURSION
    * datentyp aller variablen ist INT
    * @param grenze wenn die grenze 5 ist, berechnet die funktion 5 fakultaet (5!)
    */
    static int fakINT(int grenze) {

        if (grenze > 0) {
            return grenze * fakINT(grenze - 1);
        }
        else {
            return 1;
        }

    }



    /**
    * berechnet die fakultaet einer zahl unter nutzung der REKURSION
    * datentyp aller variablen ist LONG
    * @param grenze wenn die grenze 5 ist, berechnet die funktion 5 fakultaet (5!)
    */
    static long fakLONG(long grenze) {

        if (grenze > 0) {
            return grenze * fakLONG(grenze - 1);
        }
        else {
            return 1;
        }

    }



    /**
    * berechnet die fakultaet einer zahl unter nutzung der REKURSION
    * datentyp aller variablen ist BIGINTEGER
    * @param grenze wenn die grenze 5 ist, berechnet die funktion 5 fakultaet (5!)
    */
    static BigInteger fakBIGINT(BigInteger grenze) {
        BigInteger eins = BigInteger.valueOf(1);

        if (grenze.compareTo(BigInteger.valueOf(0)) == 1) {
            return grenze.multiply(fakBIGINT(grenze.subtract(eins)));
        }
        else {
            return eins;
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
                System.out.println("Ergebnis: " + fakINT(userInt));
            }

            else if (userString.equals("l") || userString.equals("L")) {
                System.out.println("\n" + "Welchen Wert hat n? ");
                    userLong = scan.nextLong();

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Ergebnis: " + fakLONG(userLong));
            }

            else if (userString.equals("b") || userString.equals("B")) {
                System.out.print("\n" + "Welchen Wert hat n? ");
                    userBigInteger = scan.nextBigInteger();

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Ergebnis: " + fakBIGINT(userBigInteger));
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