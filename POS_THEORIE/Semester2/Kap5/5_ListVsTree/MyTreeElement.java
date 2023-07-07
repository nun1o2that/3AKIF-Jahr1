/**
* Klasse zur Implementierung eines simplen Datenbaums; abgeaendert zu INTEGER statt CHARACTER fuer Kapitel 5 Aufgabe 5
* Jedes MyTreeElement hat zwei weitere Objekte dieser Art left und right, die rekursiv befuellt werden
**/
public class MyTreeElement {

    Integer number;
    MyTreeElement left;
    MyTreeElement right;

    /**
    * Methode zum Hinzufuegen eines Integers zum Baum
    * abhaengig von seinem ASCII-Code wird er einsortiert (in den linken oder rechten Ast)
    * @param c in der Main-Methode mitgegebener Character
    **/
    public void add(Integer i) {

        if (number == null) {
            number = i;
            // System.out.println("number, " + i);
        }

        else if (i < number) {
            // System.out.println("left, " + i);

            if (left == null) {
                left = new MyTreeElement();
                left.add(i);
            }
            else {
                left.add(i);
            }
        }

        else if (i > number) {
            // System.out.println("right, " + i);

            if (right == null) {
                right = new MyTreeElement();
                right.add(i);
            }
            else {
                right.add(i);
            }
        }

        else if (i == number) {
            // System.out.println("Gleiche Nummer, wird nicht hinzugefuegt!");
        } 

    }

    /**
    * Methode zum Suchen nach einem bestimmten Integer und zum Zaehlen der Schritte dorthin
    * @param i in der Main-Methode mitgegebene gesuchte Zahl
    * @param counter wird beim rekursiven Methodenaufruf hochgezaehlt
    * @return Anzahl der Schritte bis zu der gesuchten Zahl
    **/
    public int treeCount(Integer i, int counter) {
        boolean numberFound = i == number;
        boolean leftNull = left == null;
        boolean rightNull = right == null;
 
        if (!numberFound) {

            if (i < number) {
                if (leftNull) {
                    // System.out.println("Buchstabe nicht Gefunden!");
                    counter = 0;
                }
                else {
                    counter = left.treeCount(i, counter + 1);
                }
            }
            else if (i > number) {
                if (rightNull) {
                    // System.out.println("Buchstabe nicht Gefunden!");
                    counter = 0;
                }
                else {
                    counter = right.treeCount(i, counter + 1);
                }
            }

        }

        return counter;
    }

}