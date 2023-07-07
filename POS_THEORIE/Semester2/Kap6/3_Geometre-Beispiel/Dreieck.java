/**
* Klasse zum Implementieren eines Dreiecks, mit Eigenschaften und einfachen Methoden fuer Umfang / Flaeche und Ausgabe
**/
public class Dreieck extends AFigur implements FigurHelper {

    private double seiteA;
    private double seiteB;
    private double seiteC;

    /* Konstruktor */
    public Dreieck(double constrA, double constrB, double constrC) {
        super(true);    /* eckig */
        seiteA = constrA;
        seiteB = constrB;
        seiteC = constrC;
    }

    /**
    * Methode zum Ausrechnen und Zurueckgeben vom Umfang
    * @return ausgerechneter Umfang
    **/
    public double getUmfang() {
        return seiteA + seiteB + seiteC;
    }

    /**
    * Methode zum Ausrechnen und Zurueckgeben von der Flaeche
    * @return ausgerechnete Flaeche
    **/
    public double getFlaeche() {
        return (seiteA + seiteB + seiteC) / 2;
    }

    /**
    * Methode zur Rueckgabe der Eigenschaften eines Dreiecks
    * @return zusammengesetzter String
    **/
    @Override
    public String toString() {
        return "a: " +  seiteA + ", b: " + seiteB + ", c: " + seiteC + "; " + super.toString();
    }

}