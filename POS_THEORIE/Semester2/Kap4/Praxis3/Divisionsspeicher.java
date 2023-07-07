/**
* Wird verwendet, um in einer der zwei Implementierungen in der Division-Klasse die Ergebnisse zu speichern
**/
public class Divisionsspeicher {

    private int quotient;
    private int rest;

    /**
    * Konstruktor dieser Klasse
    * @param x ist der Quotient, mitgegeben in der Division-Methode divisionObjekt()
    * @param y ist der Rest, mitgegeben in der Division-Methode divisionObjekt()
    **/
    public Divisionsspeicher(int x, int y) {
        this.quotient = x;
        this.rest = y;
    }

    /**
    * ueberschriebene toString()-Methode der Object-Klasse
    * wenn ein Divisionsspeicher-Objekt zurueckgegeben wird, kann dies mit toString() einfach mit System.out ausgegeben werden
    * @return die Ergebnisse dieser Implementierung, gespeicherte Variablen in dieser Klasse
    **/
    @Override
    public String toString() {
        return "Quotient: " + this.quotient + "\n" + "Rest: " + this.rest;
    }

}