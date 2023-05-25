import java.util.Scanner;

/**
* Main-Klasse
* Dient dem Starten des Spiels und der Wiederholung bei Bedarf
**/
public class Main {

    /**
    * Fragt den Spieler, ob er noch einen Durchlauf macht oder ob das Programm beendet wird
    * Wird nach jedem Durchlauf aufgerufen
    * @return bool'scher Wert, der in der main-Methode bestimmt, ob nochmal wiederholt wird oder nicht
    **/
    public static boolean tryAgain() {
        Scanner scan = new Scanner(System.in);
        String user;

        do {
            System.out.print("\n" + "\n" + "Nochmal spielen? [0, 1] ");
                user = scan.next();

            if ( !( user.equals("0") || user.equals("1") ) ) {
                System.out.println("Falscher Input!");
            }
        } while (!( user.equals("0") || user.equals("1") ));

        if (user.equals("0")) {
            return false;
        }
        else {
            return true;
        }

    }

    /**
    * Typische main-Methode you know it you love it
    * Wiederholt das Programm nachdem der Spieler danach wuenscht
    **/
    public static void main ( String[] args ) {

        Game newGame;
        boolean tryAgain;

        do {
            System.out.println("\n" + "-- Welcome to Hangman! --" + "\n");
            newGame = new Game();
            newGame.bildAusgabe();

            // Nach der gameEnd()-Methode der Klasse Game wird man wieder hierher geschmissen
            // Aufruf der Methode tryAgain(), mit einem bool'schen Rueckgabewert
            // Rausbrechen aus der Hauptschleife wenn der Rueckgabewert false ist
            if ( !tryAgain() ) {
                break;
            }

        } while (true);

        System.out.println("\n" + "-- ByeBye :) --");

    }

}