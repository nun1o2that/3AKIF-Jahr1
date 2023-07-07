abstract class Komponente {

    private String produktNummer;
    private String hersteller;
    private String modellbezeichnung;

    public Komponente(String produktNummer, String hersteller, String modellbezeichnung) {
        this.produktNummer = produktNummer;
        this.hersteller = hersteller;
        this.modellbezeichnung = modellbezeichnung;
    }

    public String toString() {
        String output = "";
        output += "\nProduktnummer: " + produktNummer;
        output += "\nHersteller: " + hersteller;
        output += "\nModellbezeichnung: " + modellbezeichnung;
        return output;
    }

}