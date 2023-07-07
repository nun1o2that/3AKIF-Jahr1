/** 
* Klasse, die rekursiv eine bestimmte Mengen an Zahlen speichert und ausgibt
**/
public class MyListElement {

    Integer value;      // Integer Wrapper-Klasse, da der primitive Datentyp int nicht auf null gesetzt werden kann
    MyListElement next; // Objekt der selben Klasse fuer Rekursion

    /* 
    * Konstruktor 1
    * Wird 1-mal in der Main-Klasse aufgerufen
    **/
    public MyListElement() {
        value = null;
        next = null;
    }

    /*
    * Konstruktor 2 als Methoden-Overloader
    * Wird bei jedem rekursiv erstellten MyListElement-Objekt aufgerufen
    **/
    public MyListElement(int newValue) {
        value = newValue;
        next = null;
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
                next = new MyListElement(newValue);
            }
            // existiert ein neues MyListElement-Objekt schon, rufe dessen add()-Methode auf (REKURSION)
            else {
                next.add(newValue);
            }
        }
    }

    /**
    * Override der toString()-Methode, mit der Objekte direkt ausgegeben werden koennen
    **/
    @Override
    public String toString() {
        String ausgabe;
        ausgabe = Integer.toString(value) + "\n";

        // wenn noch ein MyListElement-Objekt existiert, fuehre deren toString()-Methode aus (REKURSION) 
        if (next != null) {
            ausgabe += next.toString();
        }

        return ausgabe;
    }

}