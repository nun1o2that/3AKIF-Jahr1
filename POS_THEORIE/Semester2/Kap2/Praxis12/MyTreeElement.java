/**
* Klasse zur Implementierung eines simplen Datenbaums
* Jedes MyTreeElement hat zwei weitere Objekte dieser Art left und right, die rekursiv befuellt werden
**/
public class MyTreeElement {

    Character letter;
    MyTreeElement left;
    MyTreeElement right;

    /**
    * Methode zum Hinzufuegen eines Characters zum Baum
    * abhaengig von seinem ASCII-Code wird er einsortiert (in den linken oder rechten Ast)
    * @param c in der Main-Methode mitgegebener Character
    **/
    public void add(Character c) {

        if (letter == null) {
            letter = Character.valueOf(c);
            System.out.println("letter, " + c);
        }

        else if (c < letter) {
            System.out.println("left, " + c);

            if (left == null) {
                left = new MyTreeElement();
                left.add(c);
            }
            else {
                left.add(c);
            }
        }

        else if (c > letter) {
            System.out.println("right, " + c);

            if (right == null) {
                right = new MyTreeElement();
                right.add(c);
            }
            else {
                right.add(c);
            }
        }

        else if (c.equals(letter)) {
            System.out.println("Gleicher Buchstabe, wird nicht hinzugefuegt!");
        } 

    }

    /**
    * Methode zum Suchen nach einem gespeicherten Character und zum Zaehlen der Schritte dorthin
    * @param c in der Main-Methode mitgegebener Character
    * @param counter wird beim rekursiven Methodenaufruf hochgezaehlt
    * @return der Zaehler wird an die Main-Klasse zurueckgegeben
    **/
    public int count(Character c, int counter) {
        boolean letterFound = c.equals(letter);
        boolean leftNull = left == null;
        boolean rightNull = right == null;

        if (c.equals(' ')) {
            System.out.println("\n" + "Leerzeichen kann nicht gesucht werden!");
        }
 
        else if (!letterFound) {

            if (c < letter) {
                if (leftNull) {
                    System.out.println("Buchstabe nicht Gefunden!");
                    counter = 0;
                }
                else {
                    counter = left.count(c, counter + 1);
                }
            }
            else if (c > letter) {
                if (rightNull) {
                    System.out.println("Buchstabe nicht Gefunden!");
                    counter = 0;
                }
                else {
                    counter = right.count(c, counter + 1);
                }
            }

        }

        return counter;

    }

}