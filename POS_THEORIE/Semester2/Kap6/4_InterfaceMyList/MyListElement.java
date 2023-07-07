
// Adaptiere deine eigene Listenklasse MyListElement so, dass sie das Interface MyList implementiert. Zeichne zuerst das UML-Diagramm. Die Methoden des Interfaces lauten:
//     void add(int value)
//     void add(int value, int index)
//     int get(int index)
//     int remove(int index)
//     int size()

public class MyListElement implements MyList {

    Integer value;      // Integer Wrapper-Klasse, da der primitive Datentyp int nicht auf null gesetzt werden kann
    Integer index;
    MyListElement next; // Objekt der selben Klasse fuer Rekursion

    /* 
    * Konstruktor 1
    * Wird 1-mal in der Main-Klasse aufgerufen
    **/
    public MyListElement() {
        value = null;
        next = null;
        index = size();
    }

    /*
    * Konstruktor 2 als Methoden-Overloader
    * Wird bei jedem rekursiv erstellten MyListElement-Objekt aufgerufen
    **/
    public MyListElement(int newValue) {
        value = newValue;
        next = null;
    }

    public MyListElement(int newValue, int newIndex) {
        value = newValue;
        index = newIndex;
    }

    /**
    * Dient dem Hinzufuegen einer neuen Zahl zur Liste
    * @param newValue wird in der Main-Klasse zufaellig generiert oder vom User eingegeben
    **/
    public void add(int newValue) {
        // hat das jetzige MyListElement-Objekt keine Zahl gespeichert, speichere die neue Zahl des Users
        if (value == null) {
            value = newValue;    
        }
        // hat das jetzige MyListElement-Objekt schon eine Zahl gespeichert:
        else {
            // existiert noch kein neues MyListElement-Objekt, erzeuge dieses und initialisiere dessen value-Feld mit der neuen Zahl des users
            if (next == null) {
                next = new MyListElement(newValue, index + 1);
            }
            // existiert ein neues MyListElement-Objekt schon, rufe dessen add()-Methode auf (REKURSION)
            else {
                next.add(newValue);
            }
        }
    }

    /* IMTERFACE */
    @Override
    public void add(int newValue, int newValueIndex) {
        System.out.println("addSize: " + size());
        if (newValueIndex <= size()) {
            if (newValueIndex == 0) {
                int temp = this.value;
                this.value = newValue;
                this.next.move(temp);
            }
            else {
                newValueIndex--;
                this.next.add(newValue, newValueIndex);
            }
        }
        else {
            add(value);
        }
    }

    public void move(int temp1) {
        int temp2 = this.value;
        System.out.println("Value to move: " + temp1);
        System.out.println("moveSize: " + size());
        if (this.index <= size()) {
            this.value = temp1;
            this.next.move(temp2);
        }
        else {
            add(temp2, index + 1);
        }
    }

    /* IMTERFACE */
    @Override
    public int get(int indexOfNum) {
        int valueAtIndex;

        while (indexOfNum != 0) {
            if (indexOfNum != 0) {
                next.get(indexOfNum - 1);
            }
            else {
                valueAtIndex = this.value;
                return valueAtIndex;
            }
        }
        return 0;
    }

    /* IMTERFACE */
    @Override
    public int remove(int indexOfNum) {
        System.out.println("Current Index: " + this.index + "Searching for: " + indexOfNum);
        Integer temp = this.value;
        if (indexOfNum <= size()) {
            if (this.index == indexOfNum) {
                temp = this.value;
                this.value = null;
                // return temp;
            }
            else {
                // indexOfNum++;
                temp = this.next.remove(indexOfNum);
            }
        }
        return temp;
    }

    public int size() {
        MyListElement counterElement = this;
        int sizeCounter = 0;

        while (counterElement != null) {
            if (counterElement.value == null) {
                break;
            }
            counterElement = counterElement.next;
            sizeCounter++;
        }

        return sizeCounter;
    }

    /**
    * Override der toString()-Methode, mit der Objekte direkt ausgegeben werden koennen
    **/
    @Override
    public String toString() {
        String ausgabe = "";
        if (this.value != null) {
            ausgabe = Integer.toString(value) + "   Index: " + index + "\n";

            // wenn noch ein MyListElement-Objekt existiert, fuehre deren toString()-Methode aus (REKURSION) 
        }
        if (next != null) {
            ausgabe += next.toString();
        }

        return ausgabe;
    }

}