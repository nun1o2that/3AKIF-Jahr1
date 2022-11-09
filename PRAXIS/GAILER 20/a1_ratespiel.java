import java.util.Scanner;
import java.util.Random;

public class a1_ratespiel {

    public static void main ( String[] args ) {

        //programm ermittelt zufallszahl zwischen 1 und 10
        //anwender bekommt 3 versuche zum erraten
        //bei richtigem raten gewinnmeldung dann ende
        //nach 3 versuchen nicht erraten entsprechende meldung dann ende


                int versuchZaehler = 3;
                int zufallszahl;
                int raten;

                Scanner eingabe = new Scanner (System.in);
                Random random = new Random();


        System.out.println("-------------------------------------------");
        System.out.println("                 Ratespiel");
        System.out.println("-------------------------------------------" + "\n");

        System.out.println("Ich denke an eine Zahl zwischen 1 und 10.");
        System.out.println("Sie haben 3 Versuche diese Zahl zu erraten.");
        System.out.println("Raten Sie!");

        zufallszahl = random.nextInt(10) + 1;


                do {

                    System.out.print("\n" + "Versuch " + versuchZaehler + ": ");
                        raten = eingabe.nextInt();

                    if (raten == zufallszahl) {
                        System.out.println("Richtig!");
                        versuchZaehler = 0;
                    }

                    else {
                        System.out.println("Falsch!");
                        versuchZaehler--;
                    }

                } while (versuchZaehler > 0);

        System.out.println("\n" + "-------------------------------------------");
    }
}