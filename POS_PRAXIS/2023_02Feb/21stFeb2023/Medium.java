import java.util.Scanner;

/** 
* Superklasse fuer die Medienarten CD, DVD und Videospiel
**/
public class Medium {

    private String titel;
    private String spielDauer;
    private String genre;
    private String kommentar;
    private boolean verliehen;

    /**
    * Konstruktor der Klasse Medium
    * wird in den Subklassen CD, DVD und Videospiel als super() aufgerufen
    **/
    public Medium(String userTitel, String userSpielDauer, String userGenre) {
        this.titel = userTitel;
        this.spielDauer = userSpielDauer;
        this.genre = userGenre;
        this.kommentar = "";
        this.verliehen = false;
    }

    /* GETTER-METHODEN */

    public String getTitel() {
        return this.titel;
    }

    
    public String getSpieldauer() {
        return this.spielDauer;
    }

    
    public String getGenre() {
        return this.genre;
    }

    
    public String getKommentar() {
        return this.kommentar;
    }

    
    public boolean getVerliehen() {
        return this.verliehen;
    }

    /* SETTER-METHODEN */

    public void setKommentar(String userKommentar) {
        this.kommentar = userKommentar;
    }

    public void setVerliehen(boolean userVerliehen) {
        this.verliehen = userVerliehen;
    }

    /**
    * ueberschreibt die toString()-Methode der Object-Klasse
    * @return der resultierende String
    **/
    @Override
    public String toString() {
        String ausgabe = "";
        ausgabe += "Titel: " + this.titel;
        ausgabe += " | Spieldauer: " + this.spielDauer;
        ausgabe += " | Genre: " + this.genre;
        ausgabe += " | Kommentar: " + this.kommentar;
        ausgabe += " | Verliehen?: " + this.verliehen;
        return ausgabe;
    }

}
