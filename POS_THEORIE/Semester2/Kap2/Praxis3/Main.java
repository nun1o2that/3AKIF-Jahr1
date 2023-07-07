import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static void main ( String[] args ) {

        // implementierung mti einem ARRAY, da dieses im gegensatz zu z.b list / arraylist NICHT in der collections-klasse vorhanden ist.

        Scanner scan = new Scanner(System.in);
        double[] messwerte;
        String user;
        double minimum;
        double maximum;
        double durchschnitt;

        do {
            System.out.print("\n" + "Wie viele Temperaturwerte speichern? ");
            user = scan.next();

            if ( !Pattern.matches("[1-9]+[0-9]*", user) ) {
                System.out.println("Falsche Eingabe! Nocheinmal versuchen!");
            }
        } while( !Pattern.matches("[1-9]+[0-9]*", user) );

        messwerte = new double[Integer.valueOf(user)];
        System.out.println("Erlaubte Werte: positiv/negativ, Gleitkommazahlen (mit PUNKT geschrieben!)");


        // strings wie z.b "000.5" gehen noch, besser bekomme ich es grade nicht hin.
        for(int i = 0; i < messwerte.length; i++) {
            do {
                System.out.print("\n" + "Temperatur?: ");
                user = scan.next();

                if ( !Pattern.matches("[-]?(0?|[1-9]+)([.]?[0-9])*", user) ) {
                    System.out.println("Falsche Eingabe! Nocheinmal versuchen!");
                }
            } while( !Pattern.matches("[-]?(0?|[1-9]+)([.]?[0-9])*", user) );
            messwerte[i] = Double.valueOf(user);
        }


        // MINIMUM-Bestimmung
        minimum = messwerte[0];
        for(double i : messwerte) {
            if (i < minimum) {
                minimum = i;
            }
        }
        System.out.println("\n" + "Minimum: " + minimum);


        // MAXIMUM-Bestimmung
        maximum = messwerte[0];
        for(double i : messwerte) {
            if (i > maximum) {
                maximum = i;
            }
        }
        System.out.println("Maximum: " + maximum);


        // DURCHSCHNITT-Bestimmung
        durchschnitt = 0;
        for(double i : messwerte) {
            durchschnitt += i;
        }
        durchschnitt /= messwerte.length;
        System.out.println("Durchschnitt: " + durchschnitt);


        System.out.println("\n" + "Auf Wiedersehen!");

    }

}