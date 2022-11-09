import java.util.Scanner;
import java.util.Random;

public class Zahlenratespiel_StefanieKarov {

    public static void main ( String[] args ) {


                Scanner eingabe = new Scanner(System.in);

                Random randomNum = new Random();

                int zufallszahl = randomNum.nextInt(100);
                int tipp;
                int versuche = 0;


        do {
            System.out.print("\n" + "Tipp 1-100 eingeben: ");
                tipp = eingabe.nextInt();

            versuche = versuche + 1;

                    if (tipp > zufallszahl) {
                        System.out.println("Tipp zu hoch!");
                    }

                    else if (tipp < zufallszahl) {
                        System.out.println("Tipp zu niedrig!");
                    }

                    else {
                        System.out.println("Tipp ist richtig! Anzahl an Versuchen: " + versuche);
                    }

        } while (tipp != zufallszahl);


    }
}