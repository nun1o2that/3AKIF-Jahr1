import java.math.BigDecimal;

/**
* Klasse zur Darstellung einer Buchung, mit Buchungsnummer, Datum, und Betrag
* Superklasse zu DetailBuchungszeile.
**/
public class Buchungszeile {
    
    /* Datenfelder */
    private int bNr;
    private Date bDatum;
    private BigDecimal bBetrag;

    /**
    * Konstruktor der Klasse Buchungszeile
    * Initialisierung der drei Datenfelder, mitgegeben in CLI-Klasse
    * @param constrBNr Buchungsnummer
    * @param constrBDatum Datum
    * @param constrBBetrag Betrag
    **/
    public Buchungszeile(int constrBNr, Date constrBDatum, BigDecimal constrBBetrag) {
        this.bNr = constrBNr;
        this.bDatum = constrBDatum;
        this.bBetrag = constrBBetrag;
    }

    /**
    * gibt die Buchungsnummer zurueck
    * @return Buchungsnummer
    **/
    public int getBNr() {
        return this.bNr;
    }

    /**
    * die Buchungsnummer wird mit einem neuen Wert ersetzt
    * @param newBNr neue Buchungsnummer
    **/
    public void setBNr(int newBNr) {
        this.bNr = newBNr;
    }

    /**
    * gibt das Datum der Buchung zurueck
    * @return Datum
    **/
    public String getBDatumAsString() {
        return this.bDatum.getDatum();
    }

    /**
    * das Datum der Buchung wird mit einem neuen Wert ersetzt
    * @param newBDatum neues Datum
    **/
    public void setBDatum(String newBDatum) {
        this.bDatum.setDatum(newBDatum);
    }

    /**
    * gibt den Betrag der Buchung als String zurueck
    * @return Betrag (String)
    **/
    public String getBBetragAsString() {
        return this.bBetrag.toString();
    }

    /**
    * der Betrag der Buchung wird mit einem neuen Wert ersetzt
    * @param newBBetrag neuer Betrag
    **/
    public void setBBetrag(Double newBBetrag) {
        this.bBetrag = new BigDecimal(newBBetrag);
    }

    /**
    * gibt den Betrag der Buchung in BigDecimal-Form zurueck
    * @return Betrag (BigDecimal)
    **/
    public BigDecimal getBBetrag() {
        return this.bBetrag;
    }

    /**
    * Ueberschreibt die toString()-Methode der Object-Klasse
    * @return Zusammenfassung der Datenfelder dieser Klasse
    **/
    @Override
    public String toString() {
        String output = "";
        output += "Buchungsnummer: " + this.bNr;
        output += "\nDatum: " + this.bDatum.getDatum() + "";
        output += "\nBetrag: " + getBBetragAsString();
        return output;
    }
    
}