import javax.imageio.plugins.tiff.GeoTIFFTagSet; // ????????????????????????????

public class Produkt {

    int pNr;
    String pName;
    Double pPreis;

    public Produkt(int cPnr, String cPname, Double cPpreis) {
        this.pNr = cPnr;
        this.pName = cPname;
        this.pPreis = cPpreis;
    }

    public int getPnr() { return this.pNr; }
    public void setPnr(int newPnr) { this.pNr = newPnr; }
    public String getPname() { return this.pName; }
    public void setPname(String newPname) { this.pName = newPname; }
    public Double getPpreis() { return this.pPreis; }
    public void setPpreis(Double newPpreis) { this.pPreis = newPpreis; }

}