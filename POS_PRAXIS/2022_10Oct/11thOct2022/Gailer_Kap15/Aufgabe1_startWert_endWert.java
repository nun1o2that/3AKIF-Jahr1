import java.util.Scanner;

public class Aufgabe1_startWert_endWert {

    public static void main ( String[] args ) {

                int startWert;
                int endWert;

                Scanner eingabe = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println(" Zaehlerprogramm (Ganzzahlen!)");
        System.out.println("-------------------------------");


        System.out.print("\n" + "Geben Sie Ihren Startwert ein: ");
            startWert = eingabe.nextInt();

        System.out.print("Geben Sie Ihren Endwert ein: ");
            endWert = eingabe.nextInt();


        System.out.println();


        while (startWert <= endWert) {
            System.out.println(startWert);
            startWert++;        // das gleiche als: startWert = startWert + 1
        }

    }
}