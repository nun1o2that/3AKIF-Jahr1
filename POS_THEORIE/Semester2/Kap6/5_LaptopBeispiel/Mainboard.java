public class Mainboard extends Komponente {

    private int steckplaetze;
    private Prozessor prozessor;
    private Ram ram;

    public Mainboard(String produktNummer, String hersteller, String modellbezeichnung, int steckplaetze, Prozessor prozessor, Ram ram) {
        super(produktNummer, hersteller, modellbezeichnung);
        this.steckplaetze = steckplaetze;
        this.prozessor = prozessor;
        this.ram = ram;
    }

    public String toString() {
        String output = "\n\nMAINBOARD:";
        output += super.toString();
        output += "\nSteckplaetze: " + steckplaetze;
        output += "\nProzessor";
        output += "\nRam";
        return output;
    }

}