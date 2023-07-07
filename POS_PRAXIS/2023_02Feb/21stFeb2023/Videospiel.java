/** 
* Subklasse der Klasse Medium
**/
public class Videospiel extends Medium {

    private String entwickler;
    private String plattform;

    /* Konstruktor der Videospiel-Klasse */
    public Videospiel(String userTitel, String userSpielDauer, String userGenre, String userEntwickler, String userPlattform) {

        /* Konstruktor der SUPERKLASSE Medium, bei dem drei Parameter mitgegeben werden! */
        super(userTitel, userSpielDauer, userGenre);
        this.entwickler = userEntwickler;
        this.plattform = userPlattform;

    }

    /* GETTER-METHODEN */

    public String getEntwickler() {
        return this.entwickler;
    }

    public String getPlattform() {
        return this.plattform;
    }

    /**
    * ueberschreibt die toString()-Methode der Medium-Klasse
    * @return der resultierende String
    **/
    @Override
    public String toString() {
        String ausgabe = super.toString();  /* ruft toString()-Methode der Superklasse Medium auf */
        ausgabe += " | Entwickler: " + this.entwickler;
        ausgabe += " | Plattform: " + this.plattform;
        return ausgabe;
    }

}