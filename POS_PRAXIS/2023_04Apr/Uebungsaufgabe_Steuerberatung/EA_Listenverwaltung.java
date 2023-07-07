import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;

/**
* Klasse zur Verfassung der Buchungen in einer Liste
* Methoden zum Hinzufuegen, Loeschen, und Ausgeben von Buchungen
**/
public class EA_Listenverwaltung {
    
    /* Datenfelder */
    private HashSet<Buchungszeile> buchungen;

    /**
    * Konstruktor der Klasse EA_Listenverwaltung
    * Initialisierung des Datenfelds
    **/
    public EA_Listenverwaltung() {
        this.buchungen = new HashSet<Buchungszeile>();
    }

    /**
    * Hinzufuegen einer neuen Buchung; mitgegeben in CLI-Klasse
    * @param newBuchung neue Buchungszeile
    **/
    public void addBuchung(Buchungszeile newBuchung) {
        this.buchungen.add(newBuchung);
    }

    /**
    * gibt die groesste Buchungsnummer in der Liste zurueck
    * @return groesste Nummer
    **/
    public int maxBuchungsnummer() {
        int groessteBNr = 0;
        for (Buchungszeile i : this.buchungen) {
            if (i.getBNr() > groessteBNr) {
                groessteBNr = i.getBNr();
            }
        }
        return groessteBNr;
    }

    /**
    * Methode zur Ausgabe der Ausgaben (rofl lmao haha heehee), also Buchungen mit negativen Betraegen
    * sind keine negativen Buchung vorhanden, wird dies ausgedrueckt
    **/
    public void printAusgaben() {
        boolean negativeWerteExistieren = false;

        System.out.println();
        for (Buchungszeile i : this.buchungen) {
            if (i.getBBetrag().compareTo(BigDecimal.ZERO) < 0) {
                negativeWerteExistieren = true;
                System.out.println(i + "\n");
            }
        }
        if (!negativeWerteExistieren) {
            System.out.println("Keine negativen Werte vorhanden!");
        }
    }

    /**
    * Methode zur Ausgabe der Summe aller Betraege in der Liste
    * sind keine Buchung vorhanden, wird dies ausgedrueckt
    **/
    public void printSumme() {
        boolean buchungenExistieren = false;
        BigDecimal summe = new BigDecimal("0");

        System.out.println();
        for (Buchungszeile i : this.buchungen) {
            buchungenExistieren = true;
            summe = summe.add(i.getBBetrag());
        }

        if (buchungenExistieren) {
            System.out.println("Summe aller Betraege: " + summe);
        }
        else {
            System.out.println("Keine Buchungen vorhanden!");
        }
    }

    /**
    * Methode zum Ausgeben aller Buchungen
    * sind keine Buchung vorhanden, wird dies ausgedrueckt
    **/
    public void printAlle() {
        boolean buchungenExistieren = false;

        for (Buchungszeile i : this.buchungen) {
            buchungenExistieren = true;
            System.out.print("\n" + i + "\n");
        }

        if (!buchungenExistieren) {
            System.out.println("\nKeine Buchungen vorhanden!");
        }
    }

    /**
    * Methode zum Loeschen einer Buchung aus der Liste
    * wird die Buchung mit der gegebenen Nummer nicht gefunden, wird dies ausgedrueckt
    * @param stornBNr Buchungsnummer die zu loeschen ist; mitgegeben in CLI-Klasse
    **/
    public void storniereBuchung(int stornBNr) {
        Iterator<Buchungszeile> it = this.buchungen.iterator();
        int listBNr = 0;
        boolean buchungGefunden = false;

        while (it.hasNext()) {
            listBNr = it.next().getBNr();
            if (listBNr == stornBNr) {
                buchungGefunden = true;
                it.remove();
            }
        }

        if (buchungGefunden) {
            System.out.println("\nBuchung erfolgreich geloescht!");
        }
        else {
            System.out.println("\nBuchung konnte nicht gefunden werden!");
        }
    }

}