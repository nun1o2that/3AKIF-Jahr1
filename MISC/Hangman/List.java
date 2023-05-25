import java.util.*;
import java.io.*;

/**
* Klasse List zum Erstellen einer ArrayList mit importierten Woertern aus einer Text-Datei
**/
public class List {

    private ArrayList<String> wordList;

    /**
    * Konstruktor der Klasse Liste
    * initialisiert die String-ArrayList und ruft die Methode zur Fuellung dieser auf
    **/
    public List() {
        wordList = new ArrayList<String>();
        fillList();
    }

    /**
    * Methode zum Fuellen der Liste
    * Nimmt die gegebene Textdatei her, liest jede Zeile (= jedes Wort) raus, und fuegt diese zur String-ArrayList hinzu
    **/
    public void fillList() {

        try {
            File Datei = new File("new_wordlist.txt");
            Scanner scan = new Scanner(Datei);
            String current;

            while(scan.hasNextLine()) {
                current = scan.nextLine();
                wordList.add(current);
            }

        }
        catch (IOException e) {
            // z.B wenn es die Datei nit gibt oder so, muss man eine Exception hinklatschen
            System.out.println("Error!! >:(");
        }
        
    }

    /**
    * Methode zum Auswaehlen eines zufaelligen Wortes aus der Liste
    * wird in der Game-Klasse aufgerufen
    * @return gibt das zufaellig bestimmte Wort zueruck -> wird in der Game-Klasse in das Datenfeld -String hangmanWord- gespeichert
    **/
    public String randomWord() {
        Random rand = new Random();
        String rando = wordList.get(rand.nextInt(0, wordList.size()));

        return rando;
    }

}