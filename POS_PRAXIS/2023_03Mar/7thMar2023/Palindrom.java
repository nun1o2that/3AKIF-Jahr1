/**
* Klasse zum Ueberpruefen von Woertern, Speichern und Ausgabe im Falle eines Palindroms
**/
public class Palindrom {

    private String[] palindrome;

    /**
    * Konstruktor, String[] mit 10 Stellen initialisiert
    **/
    public Palindrom() {
        palindrome = new String[10];
    }

    /**
    * Methode zum Ueberpruefen einer Benutzereingabe
    * Wenn alles passt, wird die hinzufuegen()-Methode aufgerufen
    * @param benutzereingabe vom User in der Main-Klasse mitgeliefert
    **/
    public void ueberpruefen(String benutzereingabe) {

        /* Benutzereingabe-String in ein char-Array speichern; ist schon LowerCase, das wurde in Main gemacht! */
        char[] buchstaben = benutzereingabe.toCharArray();
        String umgekehrt = "";

        /* von hinten beim Array durchzaehlen, und jeden Buchstaben zur umgekehrt-Variable anhaengen */
        for (int i = buchstaben.length - 1; i >= 0; i--) {
            umgekehrt += buchstaben[i];
        }
        
        System.out.println();
        if ( benutzereingabe.equals(umgekehrt) ) {
            System.out.println("Das Wort ist ein Palindrom!");
            hinzufuegen(benutzereingabe);   /* Zur Palindromliste hinzufuegen */
        }
        else {
            System.out.println("Das Wort ist kein Palindrom!");
        }
        System.out.println();

    }

    /**
    * Durchlaueft die Palindromliste und fuegt an der ersten moeglichen Stelle das neue Wort hinzu
    * (String-Arrays werden mit null-Werten initialisiert!)
    * @param benutzereingabe von der ueberpruefen()-Methode mitgegeben
    **/
    public void hinzufuegen(String benutzereingabe) {
        boolean added = false;

        for (int i = 0; i < palindrome.length; i++) {
            if ( palindrome[i] == null ) {
                palindrome[i] = benutzereingabe;
                added = true;
                System.out.println("Zur Liste hinzugefuegt. Noch " + (palindrome.length - 1 - i) + " freie Stellen.");  /* -1, weils sonst nicht stimmt */
                break;  /* aus dem Loop raus, sonst wird das Wort an jeder weiteren Stelle auch hinzugefuegt! */
            }
        }

        if (!added) {
            System.out.println("Die Liste ist schon voll!");
        }
    }

    /**
    * Liste durchlaufen und alle nicht-null Stellen ausgeben
    **/
    public void ausgeben() {
        boolean exists = false;

        System.out.println("\n" + "+++++++++++++++++++++++++++++++++++++++");

        for (String i : palindrome) {
            if (i != null) {    /* sonst wird "null" untereinander in der Konsole ausgegeben */
                exists = true;
                System.out.println(i);
            }
        }

        if (!exists) {          /* wenn keine Worte gefunden wurden, diese Ausgabe */
            System.out.println("Keine Palindrome gespeichert!");
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++" + "\n");

    }

}