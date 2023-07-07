/**
* Abstrakte Klasse zum Implementieren eines Kreises, mit Eigenschaften und einfachen Methoden fuer Umfang / Flaeche und Ausgabe
* note: implements FigurHelper
**/
public abstract class AFigur {

    private boolean eckig;

    /* Konstruktor */
    public AFigur(boolean bool) {
        eckig = bool;
    }

    /**
    * Rueckgabe des eckig-Boolean der Figur
    * @return eckig-Eigenschaft
    **/
    public String toString() {
        return "Eckig: " + eckig;
    }

}