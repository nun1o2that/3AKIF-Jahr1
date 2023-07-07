import java.util.Scanner;
import java.util.regex.*;

/**
* Hauptklasse fuer das Benutzermenue, Eingabe usw.
* Erzeugt ein Objekt der MyStack-Klasse
**/
public class Main {

    /**
    * Methode zur Benutzereingabe
    * @param OPTION abhaengig davon, wo die Methode aufgerufen wird, wird eine andere Zahl mitgeliefert - diese bestimmt, welches Suchmuster verwendet wird
    * @return der ueberpruefte String
    **/
    public static String eingabe(int OPTION) {
        Scanner scan = new Scanner(System.in);
        String user = "";
        String antwortmuster = "";

        if (OPTION == 1) {
            antwortmuster = "[0123456789]+";        /* "Wie lang soll die Liste sein?" */
        }
        else if (OPTION == 2) {
            antwortmuster = "[123xX]";              /* "Welche Option?" [Menue] */
        }
        else if (OPTION == 3) {
            antwortmuster = "[-]?[0123456789]+";    /* "Welche Zahl hinzufuegen?" [push()] */
        }

        do {
            user = scan.nextLine();

            if ( !Pattern.matches(antwortmuster, user) ) {
                System.out.print("\n" + "Falsche Eingabe! Nocheinmal probieren! ");
            }

        } while ( !Pattern.matches(antwortmuster, user) );


        return user;
    }

    /**
    *
    **/
    public static void menue() {
        System.out.println("\n" + "----------------------------------------------------");
        System.out.println("    1 - push()  -> neues Element");
        System.out.println("    2 - pop()   -> letztes Element entfernen");
        System.out.println("    3 - peek()  -> letztes Element ausgeben");
        System.out.println("    X - Programm beenden()");
        System.out.println("----------------------------------------------------");
    }

    /**
    * main-Methode zum Ausfuehren des Programms
    **/
    public static void main ( String[] args ) {

        MyStack stack;  /* MyStack-Objekt */
        String user;    /* String, damit in der eingabe()-Methode Ueberpruefungen mit Regex gemacht werden koennen */

        System.out.println("\n" + "Willkommen!");

        System.out.print("\n" + "Wie lang soll die Liste sein? ");
        user = eingabe(1);

        stack = new MyStack(Integer.valueOf(user)); /* Initialisierung des Objekts mit der eingegebenen Laenge des Users */

        /* Menue-Loop, beendet mit x/X */
        do {

            menue();
            System.out.print("Welche Option? ");
            user = eingabe(2);

            if ( user.equals("1") ) {
                System.out.print("Welche Zahl hinzufuegen? ");
                user = eingabe(3);
                stack.push(Integer.valueOf(user));
            }
            else if ( user.equals("2") ) {
                System.out.println("\n" + stack.pop() + " wurde entfernt.");
            }
            else if ( user.equals("3") ) {
                System.out.println("\n" + stack.peek() + " ist das letzte Element des Stacks.");
            }

        } while ( !Pattern.matches("[xX]", user) );

        System.out.println("\n" + "ByeBye!");

    }

}