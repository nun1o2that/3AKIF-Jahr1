import java.math.BigDecimal;

/**
* Klasse zur Darstellung einer detaillierteren Buchung, mit Kommentar und Kontonummer
* Subklasse zu Buchungszeile
**/
public class DetailBuchungszeile extends Buchungszeile{
    
    /* Datenfelder */
    private String kommentar;
    private int kontonummer;

    /**
    * Konstruktor der Klasse DetailBuchungszeile
    * Initialisierung der 2 Datenfelder dieser Klasse und der 3 Datenfelder der Superklasse Buchungszeile; mitgegeben in CLI-Klasse
    * @param constrBNr Buchungsnummer (Super)
    * @param constrBDatum Datum (Super)
    * @param constrBBetrag Betrag (Super)
    * @param constrKommentar Kommentar
    * @param constrKontonummer Kontonummer
    **/
    public DetailBuchungszeile(int constrBNr, Date constrBDatum, BigDecimal constrBBetrag, String constrKommentar, int constrKontonummer) {
        super(constrBNr, constrBDatum, constrBBetrag);  /* Aufruf des Konstruktors der Ueberklasse mit den benoetigten Parametern */
        this.kommentar = constrKommentar;
        this.kontonummer = constrKontonummer;
    }

    /**
    * gibt das Kommentar zurueck
    * @return Kommentar
    **/
    public String getKommentar() {
        return this.kommentar;
    }

    /**
    * das Kommentar der Buchung wird mit einem neuen Wert ersetzt
    * @param newKommentar neues Kommentar
    **/
    public void setKommentar(String newKommentar) {
        this.kommentar = newKommentar;
    }

    /**
    * gibt die Kontonummer zurueck
    * @return Kontonummer
    **/
    public int getKontonummer() {
        return this.kontonummer;
    }

    /**
    * die Kontonummer der Buchung wird mit einem neuen Wert ersetzt
    * @param newKontonummer neue Kontonummer
    **/
    public void setKontonummmer(int newKontonummer) {
        this.kontonummer = newKontonummer;
    }

    /**
    * Ueberschreibt die toString()-Methode der Buchungszeile-Klasse
    * @return Zusammenfassung der Datenfelder der Superklasse, plus Zusammenfassung der Datenfelder dieser Klasse
    **/
    public String toString() {
        String output = "";
        output += super.toString(); /* Aufruf der toString()-Methode der Ueberklasse */
        output += "\nKommentar: " + this.kommentar + "";
        output += "\nKontonummer " + this.kontonummer + "";
        return output;
    }

}