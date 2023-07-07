/**
* Klasse zum Ausfuehren von einfachen Rechenoperationen mit Bruechen
* Methoden von Interface Grundrechenarten hergezogen
**/
public class Bruch implements Grundrechenarten {

    /* statische Felder mit Bruch.FELD aufrufbar */
    public static final Integer ZERO = 0;
    public static final Integer ONE = 1;
    public static final Bruch HALF = new Bruch(1, 2);
	private Integer zaehler;			
	private Integer nenner;

    /* Konstruktor 1 */
	public Bruch() {
        this.zaehler = ZERO;  /* keine Initialisierung von Werten (zaehler & nenner NULL) */
        this.nenner = ZERO;
    }

    /* Konstruktor 2 */
	public Bruch(int z) {
        this.zaehler = z;   /* Initialisierung von einem Feld, nenner ONE */
        this.nenner = ONE;
    }

    /* Konstruktor 3 */
	public Bruch(int z, int n) {
        this.zaehler = z;   /* Initialisierung von beiden Feldern */
        this.nenner = n;
    }

    /* ueberschreiben der Grundrechenarten-Interface Methoden */
    @Override
	public void addieren(Bruch addBruch) {
        if (this.nenner != addBruch.nenner) {

            Integer temp = this.nenner;

            this.zaehler *= addBruch.nenner;
            this.nenner *= addBruch.nenner;
            addBruch.zaehler *= temp;

        } 
        this.zaehler += addBruch.zaehler;
    }

    @Override
    public void subtrahieren(Bruch minusBruch) {
        if (this.nenner != minusBruch.nenner) {

            Integer temp = this.nenner;

            this.zaehler *= minusBruch.nenner;
            this.nenner *= minusBruch.nenner;
            minusBruch.zaehler *= temp;

        } 
        this.zaehler -= minusBruch.zaehler;
    }

    @Override
    public void multiplizieren(Bruch timesBruch) {
        this.zaehler *= timesBruch.zaehler;
        this.nenner *= timesBruch.nenner;
    }

    @Override
    public void dividieren(Bruch divideBruch) {
        Integer temp = divideBruch.zaehler;
        divideBruch.zaehler = divideBruch.nenner;
        divideBruch.nenner = temp;
        multiplizieren(divideBruch);
    }

    /* ueberschreiben der Objekt-Methode toString()  */
    @Override
    public String toString() {
        return this.zaehler + "/" + this.nenner;
    }
    
    /* main()-Methode */
	public static void main(String[] args) {
        
        Bruch first = new Bruch();
        Bruch second = new Bruch(Bruch.ONE, 2);

        first.addieren(second);
        System.out.println("Ergebnis: " + first);

    }
    

}