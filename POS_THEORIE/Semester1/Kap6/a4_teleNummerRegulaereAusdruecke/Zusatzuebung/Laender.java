public class Laender {

    private String name;
    private String vorwahl;

    /**
    * Konstruktor
    * @param name: mitgegebener String, der an das Datenfeld name zugewiesen wird
    * @param vorwahl: mitgegebener String, der an das Datenfeld vorwahl zugewiesen wird
    */
    public Laender(String name, String vorwahl) {
        this.name = name;
        this.vorwahl = vorwahl;
    }

    /**
    * Funktion zur Anzeige eines Landes (Name & Vorwahl)
    * @param option: den Methoden arrayAnzeigen() und arraySuchen() der Klasse Datenbank mitgegeben 
    * option == 2 gibt Laender untereinander aus
    * jeder andere Wert gibt sie in einer Zeile in einem bestimmten Abstand aus
    */
    public void laenderAnzeige(int option) {

        String stringoutput;
        stringoutput = name + ": " + vorwahl;
        int maxlaenge = 28;
        int differenz;

        if(option == 2) {
            System.out.println(stringoutput);
        }
        else{
            differenz = maxlaenge - stringoutput.length();
            System.out.print(stringoutput + " ");

            while(differenz > 0) {
                System.out.print(" ");
                differenz--;
            }
        }
    }

    /**
    * getter-Methode fuer das name Datenfeld
    * @return Name des Landes
    */
    public String getName() {
        return this.name;
    }

    /**
    * getter-Methode fuer das vorwahl Datenfeld
    * @return Vorwahl des Landes
    */
    public String getVorwahl() {
        return this.vorwahl;
    }

}