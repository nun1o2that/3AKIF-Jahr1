import java.util.Scanner;

public class Aufgabe3_mikrowellenHerd{

    public static void main ( String[] args ) {

        //mikrowellenherd-hersteller empfiehlt beim erhitzen von zwei posten 50% mehr erhitzungszeit
        //beim erhitzen von drei posten, erhitzungszeit verdopplen
        //erhitzen von mehr als drei posten nicht empfohlen

        //programm fragt anwender nach anzahl der posten und erhitzungszeit

        //programm gibt empfohlene erhitzungszeit aus

        //vier aufeinanderfolgende einzweigige if-anweisungen
        //1 posten, 2 posten, 3 posten, mehr als drei posten

                int postenAnzahl;
                double anwenderErhitzungszeit; //in welcher EINHEIIIIIT
                double empfohleneErhitzungszeit = 1;

                Scanner eingabe = new Scanner(System.in);

        System.out.println("\n" + "---------------------------------------");
        System.out.println("           Mikrowellenherd");
        System.out.println("---------------------------------------");

        System.out.println("\n" + "Geben Sie ein:");
        System.out.print("Anzahl der Posten (1-3, mehr als 3 nicht empfohlen!): ");
            postenAnzahl = eingabe.nextInt();

        System.out.print("Ihre Erhitzungszeit (in Sekunden): ");
            anwenderErhitzungszeit = eingabe.nextDouble();


        if (postenAnzahl == 1) {
            empfohleneErhitzungszeit = anwenderErhitzungszeit;
        }

        if (postenAnzahl == 2) {
            empfohleneErhitzungszeit = anwenderErhitzungszeit + (anwenderErhitzungszeit * 0.5);
        }

        if (postenAnzahl == 3) {
            empfohleneErhitzungszeit = anwenderErhitzungszeit * 2;
        }

        if (postenAnzahl > 3) {
            System.out.println("Mehr als 3 Posten ist nicht empfohlen!");
            empfohleneErhitzungszeit = 0;
        }

        System.out.println("Empfohlene Erhitzungszeit: " + empfohleneErhitzungszeit);
    }
}