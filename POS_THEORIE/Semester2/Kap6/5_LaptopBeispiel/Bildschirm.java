public class Bildschirm extends Komponente {

    public Bildschirm(String produktNummer, String hersteller, String modellbezeichnung) {
        super(produktNummer, hersteller, modellbezeichnung);
    }

    public String toString() {
        String output = "\n\nBILDSCHIRM:";
        output += super.toString();
        return output;
    }

}