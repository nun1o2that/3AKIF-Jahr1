import java.util.*;

/**
* Hauptklasse Game
* Hier wird das Hangman-Bild ausgegeben, einzelne Buchstaben eingegeben, diese Eingaben ueberprueft usw.
**/
public class Game {

    private List listOBJ;
    private String hangmanWord;
    private ArrayList<String> underscoreFill;
    private int counter;

    /**
    * Konstruktor der Klasse Game
    * wird bei jedem Spieldurchlauf aufgerufen
    **/
    public Game() {
        listOBJ = new List();
        hangmanWord = listOBJ.randomWord();
        underscoreFill = new ArrayList<String>();
        counter = 7;

        for (int i = 0; i < hangmanWord.length(); i++) {
            underscoreFill.add("_");
        }
    }

    /**
    * in bildAusgabe(() aufgerufen
    * Konsolenausgabe eines Hangmaennchens lol icks de, darunter das Unterstrich-Array
    * @param counter wird mitgegeben, damit die richtige Phase des Spiels dargestellt werden kann
    **/
    public void hangmanBild(int counter) {
        System.out.println("    +--------+");
        System.out.println("    |        |");
        if (counter == 7) {
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
        }
        else if (counter == 6) {
            System.out.println("    |        O");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
        }
        else if (counter == 5) {
            System.out.println("    |        O");
            System.out.println("    |        |");
            System.out.println("    |        |");
            System.out.println("    |");
        }
        else if (counter == 4) {
            System.out.println("    |        O");
            System.out.println("    |        |");
            System.out.println("    |        |");
            System.out.println("    |       /");
        }
        else if (counter == 3) {
            System.out.println("    |        O");
            System.out.println("    |        |");
            System.out.println("    |        |");
            System.out.println("    |       / \\");
        }
        else if (counter == 2) {
            System.out.println("    |        O");
            System.out.println("    |      --|");
            System.out.println("    |        |");
            System.out.println("    |       / \\");
        }
        else if (counter == 1) {
            System.out.println("    |        O");
            System.out.println("    |      --|--");
            System.out.println("    |        |");
            System.out.println("    |       / \\");
        }
        else if (counter == 0) {
            System.out.println("    |        O");
            System.out.println("    |      --|--   hangman :(");
            System.out.println("    |        |");
            System.out.println("    |       / \\");
        }
        System.out.println("    |");
        System.out.println("___________________________________");
        for (String i : underscoreFill) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("\n" + "Noch " + counter + " Versuche uebrig...");
    }

    /**
    * Methode der mit einem Zaehler, der die Ausgabe bestimmt
    * startet die eingabe()-Methode waehrend das Spiel laueft
    * startet die gameEnd()-Methode beim Endwert des counters (0)
    * @param rightguess wird von inputCheck() mitgegeben
    * Bei falscher Eingabe wird der counter runtergezaehlt und die naechste Phase des Hangman-Spiels angezeigt
    **/
    public void bildAusgabe() {

        if (counter > 0) {
            hangmanBild(counter);
            eingabe();
        }
        else {
            gameEnd(false);
        }

    }

    /**
    * Methode zur Eingabe einzelner Buchstaben, aufgerufen in der bildAusgabe()-Methode
    * startet die Methode neu wenn ein ungueltiger Wert eingegeben wurde
    **/
    public void eingabe() {
        Scanner scan = new Scanner(System.in);
        String valid = "abcdefghijklmnopqrstuvwxyz";
        String user;
        
        
        do {
            System.out.print("\n" + "1 Buchstabe eingeben: ");
                user = scan.next();

            // Benutzereingabe muss ein Buchstabe des Alphabets sein, und nur 1 Zeichen lang sein
            if ( !(valid.contains(user)) || (user.length() > 1) ) {
                System.out.println("Falsche Eingabe! Nochmal versuchen!");
            }
        } while ( !(valid.contains(user)) || (user.length() > 1) );

        System.out.println();
        inputCheck(user.charAt(0));

    }

    /**
    * Ueberprueft den vorhin eingegebenen Buchstaben
    * @param userBuchstabe mitgeliefert von der eingabe()-Methode
    **/
    public void inputCheck(char userBuchstabe) {
        char[] wordLetters = hangmanWord.toCharArray();
        int booly;
        int indexCounter = 0;
        boolean continueCount = true;

        // checkt jeden Buchstaben des ausgewaehlten Wortes
        for (char i : wordLetters) {
            // Character.compare() gibt 0, 1, oder -1 aus; 0 wenn die chars gleich sind
            booly = Character.compare(i, Character.toLowerCase(userBuchstabe));

            if (booly == 0) {
                // wenn die chars gleich sind, setz den jetzigen Buchstaben auf die jetzige Stelle im Unterstrich-Array
                underscoreFill.set(indexCounter, Character.toString(i));
                continueCount = false;
            }
            indexCounter++;
        }

        boolean gameWon = true;
        // wenn es im Unterstrich-Array noch Unterstriche gibt, wurde das Spiel noch nicht gewonnen! 
        for (String i : underscoreFill) {
            if ( i.equals("_") ) {
                gameWon = false;
            }
        }

        // wenn beim char-Vergleich KEINE Uebereinstimmung gefunden wurde, wird der counter runtergezaehlt (-> naechste Phase des Spiels!)
        if (continueCount) {
            counter--;
        }

        // wenn im boolean gameWon true gespeichert ist, rufe die gameEnd()-Methode auf. Ansonsten, weitere Bildausgabe!
        if (gameWon) {
            gameEnd(gameWon);
        }
        else {
            bildAusgabe();
        }

    }

    /**
    * stellt das Ende des Spiels dar
    * Gewinn: aufgerufen in inputCheck()-Methode
    * Verlust: aufgerufen in bildAusgabe()-Methode
    * @param win wird bei jeweiligen Aufrufen mitgegeben
    **/
    public void gameEnd(boolean win) {
        
        char[] wordLetters = hangmanWord.toCharArray();

        System.out.println();
        if (win) {
            System.out.println("You win! :)");
        }
        else {
            System.out.println("You lose! :(");
        }
        
        System.out.println("Das Wort war:");
        for (char i : wordLetters) {
            System.out.print(i + " ");

        }
        System.out.println();

    }

}