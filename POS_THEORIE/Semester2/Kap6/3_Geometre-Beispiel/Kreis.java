/**
* Klasse zum Implementieren eines Kreises, mit Eigenschaften und einfachen Methoden fuer Umfang / Flaeche und Ausgabe
**/
public class Kreis extends AFigur implements FigurHelper {

    private double radius;
    private double durchmesser;

    /* Konstruktor */
    public Kreis(double constrRadius) {
        super(false);   /* nicht eckig */
        radius = constrRadius;
        durchmesser = radius * 2;
    }

    /**
    * Methode zum Ausrechnen und Zurueckgeben vom Umfang
    * @return ausgerechneter Umfang
    **/
    public double getUmfang() {
        return 2 * Math.PI * radius;
    }

    /**
    * Methode zum Ausrechnen und Zurueckgeben von der Flaeche
    * @return ausgerechnete Flaeche
    **/
    public double getFlaeche() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
    * Methode zur Rueckgabe der Eigenschaften eines Kreises
    * @return zusammengesetzter String
    **/
    @Override
    public String toString() {
        return "r: " + radius + ", d: " + durchmesser + "; " + super.toString();
    }

}