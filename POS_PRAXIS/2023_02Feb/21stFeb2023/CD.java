/** 
* Subklasse der Klasse Medium
**/
public class CD extends Medium {

    private String komponist;
    private String hersteller;

    /* Konstruktor der CD-Klasse */
    public CD(String userTitel, String userSpielDauer, String userGenre, String userKomponist, String userHersteller) {

        /* Konstruktor der SUPERKLASSE Medium, bei dem drei Parameter mitgegeben werden! */
        super(userTitel, userSpielDauer, userGenre);
        this.komponist = userKomponist;
        this.hersteller = userHersteller;

    }

    /* GETTER-METHODEN */

    public String getKomponist() {
        return this.komponist;
    }

    public String getHersteller() {
        return this.hersteller;
    }

    /**
    * ueberschreibt die toString()-Methode der Medium-Klasse
    * @return der resultierende String
    **/
    @Override
    public String toString() {
        String ausgabe = super.toString();  /* ruft toString()-Methode der Superklasse Medium auf */
        ausgabe += " | Komponist: " + this.komponist;
        ausgabe += " | Hersteller: " + this.hersteller;
        return ausgabe;
    }


}