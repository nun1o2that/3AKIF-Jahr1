public class Gehaeuse extends Komponente {

    private String farbe;
    private String material;
    private double breite;
    private double hoehe;
    private double tiefe;

    public Gehaeuse(String produktNummer, String hersteller, String modellbezeichnung, String farbe, String material, double breite, double hoehe, double tiefe) {
        super(produktNummer, hersteller, modellbezeichnung);
        this.farbe = farbe;
        this.material = material;
        this.breite = breite;
        this.hoehe = hoehe;
        this.tiefe = tiefe;
    }

    public String toString() {
        String output = "\n\nGEHAEUSE:";
        output += super.toString();
        output += "\nFarbe: " + farbe;
        output += "\nMaterial: " + material;
        output += "\nBreite: " + breite;
        output += "\nHoehe: " + hoehe;
        output += "\nTiefe: " + tiefe;
        return output;
    }

}