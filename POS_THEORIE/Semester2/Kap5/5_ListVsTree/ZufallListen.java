import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
* Main-Programm zu Kapitel 5 Aufgabe 5
* Vergleich von Suche nach Elementen in einer ArrayList vs. MyTreeElement
**/
public class ZufallListen {

    /**
    * Methode zur Suche nach einer zufaelligen Zahl in einer ArrayList
    * @param list mitgegebene ArrayListe
    * @param ranum zu suchende Zahl
    * @return Anzahl der Schritte bis zu der gesuchten Zahl
    **/
    public static int listCount(ArrayList<Integer> list, int ranum) {
        int counter = 0;
        for (Integer i : list) {
            if (i == ranum) {
                break;
            }
            else {
                counter++;
            }
        }
        return counter;
    }

    /* main */
    public static void main ( String[] args ) {

        ArrayList<Integer> arrayListe = new ArrayList<Integer>();
        MyTreeElement treeListe = new MyTreeElement();
        Random rand = new Random();

        int numberToSearch;
        int ranum;
        int[] randoNumberArray = new int[100];

        int schritteListe = 0;
        int schritteTree = 0;
        Double mittelWertListe;
        Double mittelWertTree;

        for (int x = 0; x < 1000; x++) {

            for (int i = 0; i < 100; i++) {
                ranum = rand.nextInt(0, 10000);
                randoNumberArray[i] = ranum;
                
                arrayListe.add(ranum);
                treeListe.add(ranum);
            }
            numberToSearch = randoNumberArray[rand.nextInt(0, 100)];
            
            schritteListe += listCount(arrayListe, numberToSearch);
            schritteTree += treeListe.treeCount(numberToSearch, 0);

        }

        mittelWertListe = Double.valueOf(schritteListe) / 1000;
        mittelWertTree = Double.valueOf(schritteTree) / 1000;

        System.out.println("\n***** ArrayList *****");
        System.out.println("Schritte Insgesamt: " + schritteListe);
        System.out.println("Schritte Mittelwert: " + mittelWertListe);

        System.out.println("\n***** MyTreeElement *****");
        System.out.println("Schritte Insgesamt: " + schritteTree);
        System.out.println("Schritte Mittelwert: " + mittelWertTree);

    }

}