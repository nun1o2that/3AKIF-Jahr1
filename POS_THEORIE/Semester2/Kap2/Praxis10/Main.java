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
        String user;
        DeletablePrimes program;

        System.out.print("\n" + "Zahl? ");
        user = scan.nextLine();
        System.out.println();

        program = new DeletablePrimes(user);
        // Counter aus DeletablePrimes-Klasse hier zurueckgegeben
        System.out.println("\n" + "Es wurden " + program.check() + " Wege gefunden.");

        scan.close();

    }

}