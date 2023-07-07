import java.util.Scanner;

/**
* Kreis-Klasse mit einem Datenfeld des Typs Koordinate und einem int Radius
**/
public class Kreis {

    private Koordinate mitte;   // durch die toString()-Methode und fehlenden Bedarf muessen keine Getter geschrieben werden
    private int radius;

    /**
    * Konstruktor der Kreis-Klasse
    * @param mitte Initialisierung des Datenfeldes der Klasse
    * @param radius Initialisierung des Datenfeldes der Klasse
    **/
    public Kreis(Koordinate mitte, int radius) {
        this.mitte = mitte;
        this.radius = radius;
    }

    /**
    * Methode zum Neu-Setzen der Datenfelder
    * @param newX neues x der Koordinate mitte
    * @param newY neues y der Koordinate mitte
    * @param radius neuer Wert fuer das radius Datenfeld dieser Klasse
    **/
    public void setPosition(int newX, int newY, int newRadius) {
        this.mitte.setCoordinate(newX, newY);
        this.radius = newRadius;
    }

    /**
    * ueberschreibt die toString()-Methode der Object-Klasse
    * benutzt die toString()-Methode der Koordinate-Klasse und fuegt die restlichen Infos der Kreis-Klasse hinzu
    * @return der fertige String
    **/
    @Override
    public String toString() {
        String output = "";
        output += "\n**************************************\n";
        output += this.mitte;
        output += "Radius r = " + this.radius + "\n";
        output += "Umfang u = " + (2 * Math.PI * this.radius) + "\nFlaeche f = " + (Math.PI * Math.pow(this.radius, 2));
        output += "\n**************************************";
        return output;
    }

}