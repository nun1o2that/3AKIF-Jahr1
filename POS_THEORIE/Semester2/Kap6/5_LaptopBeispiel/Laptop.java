public class Laptop extends Komponente {

    private double preis;
    private Gehaeuse gehaeuse;
    private Mainboard mainboard;
    private Bildschirm bildschirm;
    private Festplatte festplatte;

    public Laptop(String produktNummer, String hersteller, String modellbezeichnung, double preis, Gehaeuse gehaeuse, Mainboard mainboard, Bildschirm bildschirm, Festplatte festplatte) {
        super(produktNummer, hersteller, modellbezeichnung);
        this.preis = preis;
        this.gehaeuse = gehaeuse;
        this.mainboard = mainboard;
        this.bildschirm = bildschirm;
        this.festplatte = festplatte;
    }

    public String toString() {
        String output = "\nLAPTOP:";
        output += super.toString();;
        output += festplatte;
        output += gehaeuse;
        output += mainboard;
        output += bildschirm;
        return output;
    }

}