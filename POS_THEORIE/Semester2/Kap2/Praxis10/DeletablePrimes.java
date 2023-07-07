import java.math.*;
import java.util.Stack;

/*
* Nimmt eine Eingabe des Nutzers und ueberprueft, ob sie eine Primzahl ist (..."probably")
**/
public class DeletablePrimes {

    Stack<String> numberStack;
    String input;
    int counter;

    /*
    * Konstruktor der Klasse DeletablePrimes
    * Initialisiert die Datenfelder der Klasse
    **/
    public DeletablePrimes(String eingabe) {
        this.numberStack = new Stack<String>();
        this.input = eingabe;
        this.counter = 0;
    }

    /**
    * Die Zahl des Benutzers wird auf alle moeglichen Wege zerlegt (mit Substrings) und in den Stack gepusht, wenn eine Primzahl vorliegt
    * Ist eine Zahl eine Ziffer lang und eine Primzahl, wird der Zaehler hochgezaehlt
    * @return der Zaehler wird am Ende in der Main-Klasse ausgegeben
    **/
    public int check() {
        this.numberStack.push(this.input);

        String currentNumber = "";
        String deletedPositions = "";
        BigInteger getChecked;

        while (!this.numberStack.empty()) {
            currentNumber = numberStack.pop();

            for (int i = 0; i < currentNumber.length(); i++) {
                // z.B. currentNumber = 1234, i = 2
                // deletedPositions -> 124
                deletedPositions = currentNumber.substring(0, i) + currentNumber.substring(i + 1);

                if (deletedPositions.length() > 0) {
                    getChecked = new BigInteger(deletedPositions);

                    if (getChecked.isProbablePrime(100)) {
                        this.numberStack.push(deletedPositions);
                        System.out.println(deletedPositions);

                        // wenn die Zahl eine Ziffer hat, zaehle hoch
                        counter = (Integer.valueOf(deletedPositions) < 10) ? counter + 1 : counter + 0;

                    }

                }

            }

        }

        return counter;

    }

}