import java.util.Scanner;

public class aufgabe3_zweiWorte {

    public static void main ( String[] args ) {

                    String wort1;
                    String wort2;

                    int wort1Laenge;
                    int wort2Laenge;

                    int i;
                    int punktAnzahl;

                    Scanner eingabe = new Scanner(System.in);

        System.out.println("\n" + "--------------------------------------");       
        System.out.println("          Zwei-Wort-Zeilen");
        System.out.println("--------------------------------------");

        System.out.print("\n" + "Geben Sie Ihr erstes Wort ein: ");
            wort1 = eingabe.next();

        System.out.print("Geben Sie Ihr zweites Wort ein: ");
            wort2 = eingabe.next();



        wort1Laenge = wort1.length();
        wort2Laenge = wort2.length();

        punktAnzahl = 30 - wort1Laenge - wort2Laenge;


        System.out.print("\n" + wort1);

                i = 0;
                while (i<punktAnzahl) {
                    System.out.print(".");
                    i++;
            
                }

        System.out.print(wort2);

    }
}