import java.util.Scanner;
import java.util.Random;
import java.util.regex.*;

/**
* Main-Klasse zur Ausfuehrung des Programms
* Ein Main-Objekt mit einem MyListElement-Feld wird erzeugt, damit dieses leichter manipuliert werden kann (add()-Methode)
**/
public class Main {

    private MyListElement list = new MyListElement();

    /**
    * Sammelmethode fuer die meisten Benutzereingaben
    * Abhaengig davon, wo sie ausgerufen wird, wird eine bestimmte Zahl OPTION mitgeliefert, die den weiteren Verlauf bestimmt
    * @param OPTION Bestimmt das Antwortmuster das mit Regex geprueft wird, und welche passende Eingabeaufforderung ausgegeben wird
    * @return ueberpruefte Benutzereingabe
    **/
    public static String waehlen(int OPTION) {
        Scanner scan = new Scanner(System.in);
        String antwortMuster = "";
        String user;    // String zur Musterueberpruefung

        if (OPTION == 0) {
            antwortMuster = "[0123456789]+";    // Wie viele Zahlen speichern?
        }
        else if (OPTION == 1) {
            antwortMuster = "[12]";             // Selber Zahlen eingeben [1] oder zufaellig generieren lassen [2]?
        }
        else if (OPTION >= 2 && OPTION <= 5) {
            antwortMuster = "[-]?[0123456789]+";// Min/Max Eingabe fuer Random bzw. Zahleneingabe des Users selber
        }

        // Schleife aus der man erst rausgeschmissen wird, wenn das Antwortmuster eingehalten wurde
        do {

            if (OPTION == 0) {
                System.out.print("Wie viele Zahlen speichern? ");
            }
            else if (OPTION == 1) {
                System.out.print("Selber Zahlen eingeben [1] oder zufaellig generieren lassen [2]? ");
            }
            else if (OPTION == 3) {
                System.out.print("Zahl: ");
            }
            else if (OPTION == 4) {
                System.out.print("Minimumwert? (inklusive): ");
            }
            else if (OPTION == 5) {
                System.out.print("Maximumwert? (exklusive): ");
            }

            user = scan.nextLine().trim();

            if ( !Pattern.matches(antwortMuster, user) ) {
                System.out.println("Falsche Eingabe! Nocheinmal versuchen!" + "\n");
            } 
            else if (OPTION != 3 || OPTION != 5) {
                System.out.println();
            }

        } while( !Pattern.matches(antwortMuster, user) );

        return user;
    }

    /**
    * Methode zur Eingabe der Zahlen durch den User selbst
    * Zahlen werden in der waehlend()-Methode eingegeben und ueberprueft, hier in der zahl-Variable gespeichert und dann direkt zur Liste hinzugefuegt
    * @param numberAmount vom User am Programmstart eingegeben; so viele Zahlen werden gespeichert
    **/
    public void eigeneZahlen(int numberAmount) {
        int zahl = 0;

        // Eingeben, Ueberpruefung, und Hinzufuegen 
        do {

            zahl = Integer.valueOf(waehlen(3));
            list.add(zahl);
            numberAmount--;

        } while (numberAmount > 0);

    }

    /**
    * Methode zur zufaelligen Generation der Zahlen
    * Die Mindest- und Maximumwerte, die enstehen können, werden vom User in der waehlen()-Methode eingegeben und ueberprueft
    * Zusaetzlich stellt diese Methode sicher, das der Minimum-Wert kleiner als der Maximum-Wert ist
    * In dieser Range werden Zufallszahlen generiert und direkt zur Liste hinzugefuegt
    * @param numberAmount vom User am Programmstart eingegeben; so viele Zahlen werden gespeichert
    **/
    public void randomizedZahlen(int numberAmount) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int min = 0;
        int max = 0;

        // Rangewahl
        do {

            System.out.println("Rangeauswahl");
            min = Integer.valueOf(waehlen(4));
            max = Integer.valueOf(waehlen(5));

            if (min > max || min == max) {
                System.out.println("Der Minimumwert muss kleiner sein als der Maximumwert!" + "\n");
            }

        } while (min > max || min == max);

        // Hinzufuegen
        do {

            list.add(rand.nextInt(min, max));
            numberAmount--;

        } while (numberAmount > 0);

    }

    /**
    * main-Methode() der Main-Klasse, zur Ausfuehrung des Programms
    **/
    public static void main ( String[] args ) {

        Main programm = new Main();

        Scanner scan = new Scanner(System.in);
        int numberAmount;
        int programmArt;

        System.out.println("\n" + "------>MyListElement<------" + "\n");
        
        numberAmount = Integer.valueOf(waehlen(0));    
        programmArt = Integer.valueOf(waehlen(1));

        switch (programmArt) {
            case 1: programm.eigeneZahlen(numberAmount); break;
            case 2: programm.randomizedZahlen(numberAmount); break;
        }
    
        System.out.println("Ausgabe:" + "\n" + programm.list);
        System.out.println("ByeBye!");
        scan.close();

    }

}