/** 
* Subklasse der Klasse Medium
**/
public class DVD extends Medium {

    private String regissuer;
    private String studio;

    /* Konstruktor der DVD-Klasse */
    public DVD(String userTitel, String userSpielDauer, String userGenre, String userRegissuer, String userStudio) {

        /* Konstruktor der SUPERKLASSE Medium, bei dem drei Parameter mitgegeben werden! */
        super(userTitel, userSpielDauer, userGenre);
        this.regissuer = userRegissuer;
        this.studio = userStudio;

    }

    /* GETTER-METHODEN */

    public String getRegissuer() {
        return this.regissuer;
    }

    public String getStudio() {
        return this.studio;
    }

    /**
    * ueberschreibt die toString()-Methode der Medium-Klasse
    * @return der resultierende String
    **/
    @Override
    public String toString() {
        String ausgabe = super.toString();  /* ruft toString()-Methode der Superklasse Medium auf */
        ausgabe += " | Regissuer: " + this.regissuer;
        ausgabe += " | Studio: " + this.studio;
        return ausgabe;
    }

}