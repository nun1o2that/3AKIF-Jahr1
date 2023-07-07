/**
* simple Klasse zum Erfassen eines Datums
* Grund: die in der JavaDoc vorhandene Date-Klasse hat viele veraltete Methoden, plus i hab keinen Bock kappt lol
**/
public class Date {
    
    /* Datenfelder */
    private String datum;

    /**
    * Konstruktor der Klasse Date
    * Initialisierung des Datenfelds, mitgegeben in CLI-Klasse
    * @param constrDatum Datum
    **/
    public Date(String constrDatum) {
        this.datum = constrDatum;
    }

    /**
    * gibt das Datum zurueck
    * @return Datum
    **/
    public String getDatum() {
        return this.datum;
    }

    /**
    * das Datum wird mit einem neuen Wert ersetzt
    * @param newDatum neues Datum
    **/
    public void setDatum(String newDatum) {
        this.datum = newDatum;
    }

}
