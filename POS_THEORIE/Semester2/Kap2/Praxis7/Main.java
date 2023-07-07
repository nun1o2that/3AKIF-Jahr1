import java.util.Scanner;
import java.util.Random;

/**
* Main-Klasse zur Ausfuehrung des Programms
* AUSFUEHRUNG MIT DEM BEFEHL java -Xss512m Main
**/
public class Main {

    /**
    * main-Methode() der Main-Klasse, zur Ausfuehrung des Programms
    **/
    public static void main ( String[] args ) {

        MyListElement list = new MyListElement();

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int numberAmount;
        
        // zur Messung der Zeit
        double programmStart = 0;
        double programmMitte = 0;
        double programmEnde = 0;

        System.out.println("\n" + "------>MyListElement - Random, Zeitmessung<------" + "\n");

        System.out.print("Wie viele Zahlen generieren? ");
            numberAmount = scan.nextInt();
        scan.close();

        programmStart = (double)System.nanoTime();

        for (int i = numberAmount; i > 0; i--) {
            list.add(rand.nextInt());

            // Genau in der Mitte der Durchzaehlung
            if (i == numberAmount / 2) {
                programmMitte = (double)System.nanoTime();
                System.out.println("Haelfte erreicht");
            }

            i--;
        }

        // Ausgabe aller Zahlen
        System.out.println(list);

        System.out.println("Programmstart: 0 ns seit Programmstart");

        programmMitte -= programmStart; // programmMitte = programmMitte - programmStart
        System.out.println("Programmmitte: " + programmMitte + " ns (" + (programmMitte / 1000000000) + " s) seit Programmstart");

        programmEnde = (double)System.nanoTime();
        programmEnde -= programmStart;  // programmEnde = programmEnde - programmStart
        System.out.println("Programmende: " + programmEnde + " ns (" + (programmEnde / 1000000000) + " s) seit Programmstart");

        System.out.println("\n" + "ByeBye!");

    }

}