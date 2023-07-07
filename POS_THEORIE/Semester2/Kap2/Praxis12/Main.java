import java.util.Scanner;

/**
* Main-Klasse zur Benutzereingabe und Starten des Programmes
**/
public class Main {

    /**
    * main()-Methode
    **/
    public static void main ( String[] args ) {

        Scanner scan = new Scanner(System.in);
        String eingabe = " ";
        MyTreeElement tree = new MyTreeElement();
        int schrittZaehler = 0;

        System.out.println("\n" + "Beenden mit Eingabe laenger als 1");

        while (eingabe.length() <= 1) {

            System.out.print("\n" + "Eingabe: ");
            eingabe = scan.nextLine();

            if (eingabe.length() == 1) {
                tree.add(eingabe.charAt(0));
            }

        }

        System.out.println("\n" + "Eingabe beendet..." + "\n");
        eingabe = " ";

        System.out.println("Beenden mit Eingabe laenger als 1");

        while (eingabe.length() <= 1) {

            System.out.print("Nach Character suchen: ");
            eingabe = scan.nextLine();

            if (eingabe.length() == 1) {
                schrittZaehler = tree.count(eingabe.charAt(0), 0);
            }

            System.out.println(schrittZaehler + " Schritte bis zu " + eingabe + "!" + "\n");

        }

    }

}