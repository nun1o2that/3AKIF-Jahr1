import java.util.Scanner;

/**
* einfache Klasse Koordinate mit zwei Datenfeldern x und y
**/
public class Koordinate {

    private int x;  // durch die toString()-Methode und fehlenden Bedarf muessen keine Getter geschrieben werden 
    private int y;      

    /**
    * Konstruktor der Koordinate-Klasse
    * @param x Initialisierung des x-Datenfeldes der Klasse
    * @param y Initialisierung des y-Datenfeldes der Klasse
    **/
    public Koordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
    * Methode zum Neu-Setzen der Datenfelder
    * @param newX neue x-Koordinate
    * @param newY neue y-Koordinate
    **/
    public void setCoordinate(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    /**
    * ueberschreibt die toString()-Methode der Object-Klasse
    * gibt die x- und y-Koordinate als String zurueck
    * @return der fertige String
    **/
    public String toString() {
        return "Mitte M(" + this.x + "|" + this.y + ")\n";
    }

}